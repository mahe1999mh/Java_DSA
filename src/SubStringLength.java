
public class SubStringLength {
    public static void main(String[] args) {
		
    	
    	
    	String s = "Coding";
    	int n = s.length();
    	int k=2;
    	
    	for(int i=0; i<=n-k; i++) {
    		for(int j=i; j<=(i+k)-1; j++) {
    			System.out.print(s.charAt(j));
    		}
    		System.out.println();
    	}
	}
}
