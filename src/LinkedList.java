public class LinkedList implements Collection {  
    Node head = null;  
    Node tail = null;  
    int size = 0;  
    public void add(Object o) {  
        Node n = new Node(o, null);  
        if(head == null) {  
            head = n;  
            tail = n;  
        }  
        tail.setNext(n);  
        tail = n;  
        size ++;  
    }  
      
    public int size() {  
        return size;  
    }  
  
    @Override  
    public Iterator iterator() {  
        return new LinkedListIterator();  
    }  
      
    private class LinkedListIterator implements Iterator{  
  
        private Node currentNode = head;  
        private int nextIndex = 0;//参考源码中的写法  
          
        @Override  
        public Object next() {  
              
            Object data = currentNode.getData();  
            currentNode = currentNode.getNext();  
            nextIndex ++;  
            return data;  
        }  
  
        @Override  
        public boolean hasNext() {  
              
            return nextIndex != size;  
        }  
          
    }  
      
      
}  