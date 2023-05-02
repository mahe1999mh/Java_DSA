package StringPrograming;

public class SubStringOfLengthFour {

	public static void main(String[] args) {
		
		String s = "abcdefg";
		
		for(int i=0; i<s.length()-4; i++) {
			
			for(int j=i; j<(i+4); j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
			
		}

	}

}
