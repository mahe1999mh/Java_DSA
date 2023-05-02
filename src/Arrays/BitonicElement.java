package Arrays;

public class BitonicElement {
	
	static int BitonicElement(int arr[]) {
		
		int l=0, h = arr.length -1, mid = 0;
		
		if(l<=h) {
			mid = l+h/2;
			
			if(arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1]) {
				return mid;
				
			}else if(arr[mid]>arr[mid + 1] && arr[mid]<arr[mid-1]) {
				l = mid + 1;
			}else {
				h = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,6,5,4,3};
		System.out.println(BitonicElement(arr));

	}

}
