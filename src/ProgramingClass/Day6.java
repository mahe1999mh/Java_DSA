package ProgramingClass;

public class Day6 {
	
	static int MaxNum() {
		
		int arr[] = {2,5,1,4,3};
		int max =0;
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println(index);
		return max;
	}

	static void MinMax() {
		//printing min sun and max sum of array
		int arr[] = {2,5,1,4,3};
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] < min) {
				min = arr[i];
			}
			
			if(arr[i] > max) {
				
				max = arr[i];
			}
			
			count = count + arr[i];
			
		}
		
		System.out.println(count - min);
		System.out.println(count - max);
				
	}
	
	static void prodict() {
		
		int tol = 0;
		int arr[] = {1,2,3,4,5};
		int arr1[] = new int[5];
		for(int i=0; i<arr1.length; i++) {
			tol = tol + arr[i];
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(tol-arr[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		
//        System.out.println(MaxNum());
        MinMax();
//		  prodict();
		
	}
			
}
