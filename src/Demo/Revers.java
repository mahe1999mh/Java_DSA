package Demo;

public class Revers {
	
	static String reveresString(String a){
		
		String b ="";
		
//		for(int i=a.length() -1; i>=0; i--) {
//			
//			b = b + a.charAt(i) ;
//		}
	
		
		for(int i=0; i<a.length(); i++) {
			b = a.charAt(i)+b;
		}
		return b;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "reddy";
		System.out.println(reveresString(a));

	}

}
