package Arrays;

public class RemoveDuplicates {
      public static void main(String[] args) {
		
    	  int arr[] = {1,1,2,2,3,3,4,5,5};
    	                
    	  int rd =0;
    	  
    	  for(int i=0; i<arr.length; i++) {
    		 
    		  if(arr[rd] != arr[i]) {
    			  rd++;
    			  arr[rd] = arr[i];
    		  }

    	  }
    	  rd++;
		  arr[rd] = arr[arr.length -1];
		  
		  
    	  
    	  for (int i = 0; i < rd; i++) {
			  System.out.println(arr[i]);
		}
	}
}
