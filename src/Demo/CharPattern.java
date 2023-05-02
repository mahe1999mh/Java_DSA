package Demo;

public class CharPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=5;
		
		int a =65;
for(int i=1; i<=n; i++) {
			
			
			for(int j=1; j<=i; j++) {
				System.out.print((char)a++ +" ");
			}
			
			System.out.println();
		}

	}

}
