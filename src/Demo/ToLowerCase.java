package Demo;

public class ToLowerCase {
	
	static String toLowerCase(String a) {
		
		String b ="";
		for(int i=0; i<a.length(); i++) {
			char c = a.charAt(i);
			if(c>= 'A' && c<='Z') {
				
				b = b + (char) (c+32);
				
			}else {
				b = b + a;
			}
		}
		
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="MAHENDRA";
		System.out.println(toLowerCase(a));

	}

}
