package StringPrograming;

public class SubStringOfGivenString {
    public static void main(String[] args) {

    	String str = "12345";
    	int n = str.length();
    	
    	
    	for(int i=1; i<=n ; i++) {
    		
    		for(int j=0; j<=n-i; j++) {
    			
    			for(int k=j; k<=(j+i)-1; k++) {
    				
    				System.out.print(str.charAt(k));
    			}
    			System.out.println();
    		}
    	}
	}
}
