package StringPrograming;

public class WithoutUseingSplit {

	public static void main(String[] args) {
		
		String  a = "how are you";
		String[] arr = new String[3];
		String b = "";
		int j = 0;
		
		for (int i = 0; i < a.length(); i++) {
			
			
			if(a.charAt(i) !=' ') {
				
				b = b + a.charAt(i);
				
			}else {
					arr[j] = b;
					j++;
					b = " ";
	
			}
			arr[arr.length-1] = b;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
}
