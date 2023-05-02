package Demo;

public class SubString {
	
	static void substring(String a) {
		
		for(int i=1; i<a.length(); i++) {
			
			for(int j=0; j<=a.length()-i; j++) {
				
				for(int k=j; k<= ( j + i) -1; k++) {
					System.out.print(a.charAt(k));
				}
				System.out.println();
				
			}
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "MAHI";
		
		substring(a);

	}

}
