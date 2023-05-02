package ProgramingClass;

public class SubArrays {
	
	
	static void subArrays(int arr[]) {
		
		int count = 0, si=0, ei=0, start = 0, end = 0;
		
		for(int i=0; i<arr.length -1; i++) {
			
			if(arr[i]==arr[i+1]-1) {
				ei++;
			}else {
				if(ei-si> end - start)
				{
				    start =si;
				    end = ei;
				}
				si = i+1;
				ei = i+1;			
				}
		}
		
		if(ei-si> end - start)
		{
		    start =si;
		    end = ei;
		}
		
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
     public static void main(String[] args) {
			
        	 int arr[]= {5,12,13,14,9,1,2,3,4,5,8};
        	 
        	 subArrays(arr);
		}
}
