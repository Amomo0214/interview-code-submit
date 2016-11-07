
public class no1 {
	
		public static void main(String[] args) {
			 
			int[] arr = {9, 38, 5, 97, 76, -13, 27, 49, -78, 34, -1};
	 
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i; j < arr.length; j++) {
	 
	                if (arr[i] > arr[j]) {
	                    int tmp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = tmp;
	                }
	            }
	            System.out.print(arr[i]+" ");
	        }
	 
	        
	    }
			
			
		
	}
	

