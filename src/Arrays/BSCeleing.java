package Arrays;

public class BSCeleing {
	
  public static int ceiling(int arr[], int key) {
		
		int l=0, h=arr.length-1, mid=0;
		while(l<=h) {
			mid = (l+h)/2;
			
			if(key==arr[mid]) {
				return mid;
			}else if (key < arr[mid]) {
				h = mid -1;
			}else {
				l = mid + 1;
			}
		}
		if(l<arr.length) {
			return arr[l];
		}else {
			return -1;
		}
		
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,7,8,9};
		int key = 6;
		
		System.out.println(ceiling(arr,key));
	}

}
