package Demo;

public class ToupperCase {
	
	static String toupperCase(String a) {
		
		String b ="";
		for(int i=0; i<a.length(); i++) {
			
//			char c = a.charAt(i);
			if(a.charAt(i)>= 'a' && a.charAt(i)<='z') {
				b = b + (char) (a.charAt(i)-32);
			}else {
				b = b+a.charAt(i);
			}
		}
		return b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "mahendea";
		System.out.println(toupperCase(a));

	}
	

}
