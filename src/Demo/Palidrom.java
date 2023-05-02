package Demo;

public class Palidrom {
	
	static void palidrom (String a) {
		
		String b ="";		
	
		for(int i=0; i<a.length(); i++) {			
		b = a.charAt(i)+b;
		}
		
		if(a.equals(b)) {
			System.out.println("it is paladrom");
		}else {
			System.out.println("it is paladrom");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String a = "level";
	    palidrom(a);

	}

}
