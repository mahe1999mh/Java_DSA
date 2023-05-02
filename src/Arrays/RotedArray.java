package Arrays;

public class RotedArray {
	
	static int rotedArray(int arr1[], int key) {
		
int l=0, h= arr1.length -1, mid =0;
		
		while(l<=h) {
			mid = l+h/2;
//			System.out.println(arr1[mid]);
			
			if(key == arr1[mid]) {
				return mid;
			}else if(arr1[l] <= arr1[mid]) {
				
			   if(key >= arr1[l] && key < arr1[mid]) {
				   h = mid -1;
			   }else {
				   l = mid + 1;
			   }
			}else {
				if(key > arr1[mid] && key <= arr1[h] ) {
					l = mid +1;
				}else {
					h = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
//		int arr1[] = {7,8,1,2,4,5,6};//6,7,8,9,1,2,3,4,5
		int arr1[] = {6,7,8,1,2,3,4,5};//
		int key = 1;
		System.out.println(rotedArray(arr1,key));
	}

}
