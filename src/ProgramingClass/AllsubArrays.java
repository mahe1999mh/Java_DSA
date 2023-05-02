package ProgramingClass;

public class AllsubArrays {
	
      public static void main(String[] args) {
		
    	  
    	  int arr[] = {1,2,3,4,5,6,7};
    	
    	  int n = arr.length;
    	  
//          int k = 1;
//     		for(int i=0; i<=n; i++) {
//     			for(int j=i; j<=(j+i)-1; j++) {
//     				System.out.print(arr[j]);
//     			}
//     			System.out.println();
//     		}
    	  
    	  
//    	  int i =4;
//    	  
//          for(int j=0; j<=n-i; j++) {
//  			for(int k=j; k<=(j+i)-1; k++) {
//  				System.out.print(arr[k]);
//  			}
//  			System.out.println();
//  		}
          

    	  for (int i = 0; i <= arr.length -2; i++) {
    		  for (int j = i; j <= i+2 -1; j++) {
    			  System.out.print(arr[j]);
			}
    		  System.out.println();
			   
		}
      	
    	  
	}
}
