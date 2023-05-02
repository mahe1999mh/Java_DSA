package Arrays;

public class FistLastSameElement {
	
	static int[]  FistLastSameElement(int arr[],int key) {
		
		int l=0, h =arr.length -1, mid =0;
		int[] arr1 = {1};
		
		while(l<=h) {
			mid = l+h/2;
			
			if(key == arr[mid]) {
				arr1[0] = mid;
				l = mid + 1;
			}else if(key < arr[mid]) {
				
				l = mid + 1;
				
			}else {
				h = mid - 1;
			}
		}
		
		return arr1;
		
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,4,5,6,7};
		int key = 4;
		int a[] = new int[1];
		  a = FistLastSameElement(arr,key);
		  System.out.println(a[0]);
	}

}
