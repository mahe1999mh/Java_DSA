package ProgramingClass;

public class SubArrayss {
     public static void main(String[] args) {
		
    	 int arr[] = {1,2,3,4,5,6,7};
    	 
    	 
//    	 int k =2;
    	 int n = arr.length;
    	 
for(int k =1; k<=n; k++) {
    	 for (int i = 0; i < arr.length- k; i++) {
			for (int j = i; j <= (i+k) -1; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
	}
     }
}
