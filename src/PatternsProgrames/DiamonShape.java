package PatternsProgrames;

public class DiamonShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=4;
		
//		int a =1;
		for(int i=0; i<=n; i++) {
			for(int j=i; j<=n-1; j++) {
				System.out.print("  ");
			}
//			int a1 =1;
			for(int k=0; k<=i*2; k++) {
					System.out.print("*" +" ");	
			}
			System.out.println();
		}
		
		int n1 = 6;
		
		for(int i=0; i<=n1; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("  ");
			}
			
			for(int k=i; k<=n1-i; k++) {
				
				
				System.out.print("*" +" ");
			}
			System.out.println();
		}

	}

}
