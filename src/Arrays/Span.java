package Arrays;

public class Span {
	static int spanOfNumber(int arr[]) {
		
		int span =0;
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				max = arr[i];
			}
			
			if(arr[i]< min) {
				min = arr[i];
			}
		}
		
		span = max - min;
		return span;
		
	}
	
public static void main(String[] args) {
	
	int arr[]= {15,32,1,4,6,7,8};
    System.out.println(spanOfNumber(arr));;
}
}
