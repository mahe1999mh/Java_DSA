package Arrays;

public class SecandLargestNumber {

	static int SecandLargestNumber(int arr[]) {
	
		
		int max1=0,max2=0;
		if(arr[0] > arr[1]) {
		    max1 = arr[0];
		    max2 = arr[1];
	     }else {
		 max1 = arr[1];
		 max2 = arr[2];
	     }
		
		return max2;
	     
	}
	public static void main(String[] args) {
		
		int arr[] = {2,3,1,4,6};
		
		System.out.println(SecandLargestNumber(arr));
	}

}
