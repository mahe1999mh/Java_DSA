package StringPrograming;

public class IndexOfString {

	public static void main(String[] args) {
		
		String a = "monday";
		char b = 'o';
		
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)== b) {
				System.out.println(i);
			}
		}

	}

}
