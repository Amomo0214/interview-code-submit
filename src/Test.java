public class Test {  
  
    public static void main(String[] args) {  
          
        Collection c = new LinkedList();  
          
        for(int i=0; i<6; i++){  
            c.add("Á´±í-"+i);  
        }  
          
        System.out.println(c.size());  
          
        Iterator it = c.iterator();  
        while(it.hasNext()) {  
            Object o = it.next();  
            System.out.print(o + " ");  
        }  
        }  
    
}  