package PatternsProgrames;

public class CharPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		int n=5;
		for(int i=1; i<=n; i++) {
			
			
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			char a = 65;
			for(int k=1; k<=i; k++) {
				System.out.print(a++ +" ");
			}
			;
			System.out.println();			
		}
		
		
		System.out.println();
		
//	     A 
//	    B C 
//	   D E F 
//	  G H I J 
//	 K L M N O 

       
for(int i=0; i<=n; i++) {
	char a = 65;
			for(int j=0; j<=n-i; j++) {
				System.out.print(a++);
			}
			
			System.out.println();			
		}

 System.out.println();

     for(int i=0; i<n; i++) {
	       char a = 69;
			for(int j=0; j<n-i; j++) {
				System.out.print(a--);
			}
			
			System.out.println();			
		}
     System.out.println();

		
		

	}

}
