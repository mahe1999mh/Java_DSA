package Recursion;

public class Nnatural {
	
	static void nnatural(int n) {
		
		if(n==0) {
			return ;
		}		
		nnatural(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
	     nnatural(5);
	}

}
