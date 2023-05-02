package PatternsProgrames;

public class CharA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		
		for(int i=1; i<=n; i++) {
			
			
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			char a ='A';
			for(int k=i; k>=1; k--) {
				
					System.out.print(a++ +" ");				
			}
			
			System.out.println();			
		}

	}

}
