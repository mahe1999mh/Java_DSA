package Arrays;

public class SecondLargest {
	
	static int SecondLargest(int arr[]) {
		
	   int max1 = 0;
	   int max2 = 0;
	   
	   if(arr[0]>arr[1]) {
		   max1 = arr[0];
		   max2 = arr[1];
	   }else {
		   max1 = arr[1];
		   max2 = arr[2];
	   }
	   
	   for(int i=0; i<arr.length; i++) {
		   
		   if(arr[i] > max1) {
			   max2 = max1;
			   max1 = arr[i];
		   }else if(arr[i] > max2) {
			   max2 = arr[i];
		   }
	   }
	   return max2;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(SecondLargest(arr));

	}

}
