package ProgramingClass;

public class MoveToend {
	
	
	static void movetoend(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			
	    	 for (int j = 0; j < arr.length; j++) {
				     
	      	   if(arr[i]<arr[j]) {
	    		   int temp = arr[j];
	    		   arr[j] = arr[i];
	    		   arr[i] = temp;
	    	   }
	    		 
			}
		}
	       
	     
	       for (int j2 = 0; j2 < arr.length; j2++) {
			  System.out.print(arr[j2]+" ");
		}
		
	}
	
	static void movetoend2(int arr[]) {

		movetoend(arr);
		for (int j2 = 0; j2 < arr.length; j2++) {
			System.out.println(arr[j2]);
		}
	}
	
	static void subarray(int arr[]) {
		
		
		
		
	}
    public static void main(String[] args) {
		
    	
     int arr[] = {5,-1,3,-1,4,5,3,-1,0,8,2};
       
     movetoend(arr);
     movetoend2(arr);
     
     int a[] = {1,2};
     

       
     
       
	}
}
