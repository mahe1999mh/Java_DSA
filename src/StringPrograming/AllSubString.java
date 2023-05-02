package StringPrograming;

public class AllSubString {
	
public static void main(String[] args) {
	
	String s = "abcd";
	int n = s.length();
	
	for (int i = 1; i <= n; i++) {
		
		for (int j = 0; j <= n-i; j++) {
			
			for(int k=j; k<=i+j-1; k++) {
				
				System.out.print(s.charAt(k));
			}
			System.out.println();
		}
		
	}
  }
}
