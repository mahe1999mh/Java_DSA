package Arrays;

public class BinaryScarch {
	
	static int binaryscarch() {
		int arr[] = {1,2,3,4,5,6,7,8};
		int n =5;
		
		int l=0, h = arr.length -1, mid =0;
		
		while(l<=h) {
			mid = (l+h)/2;
			
			if(arr[mid] == n) {
				return mid;
			}else if(n > arr[mid] ) {
				l = mid+1;
			}else {
				h = mid -1;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		
		System.out.println(binaryscarch());

	}

}
