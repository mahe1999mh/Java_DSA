package ProgramingClass;

public class SubArray {

	public static void main(String[] args) {
		
	  int arr[] = {5,4,-1,7,8};
		
		for(int k=arr.length; k>=0; k--) {
		   for(int i=0; i<arr.length -k; i++) {
			   int sum =0;
				 for(int j=i; j<i+k; j++) {
				   
					 System.out.print(arr[j]);
				}
				 System.out.println();
			
		  }
		}

	}

}
