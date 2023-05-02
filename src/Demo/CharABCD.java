package Demo;

public class CharABCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int ch = 'A';
		
        for(int i=1; i<=n; i++) {
			 
        	
        	if (i%2==0) {
        		
        		char chrev = (char) (ch + i -1);
        		for(int j=1; j<=i; j++) {
        			System.out.print((char)chrev-- +" ");
        			ch++;
        		}
				
			} else {
                   
				for(int j=1; j<=i; j++) {
					System.out.print((char)ch++ +" ");
				}
			}
			System.out.println();
		}

	}

}
