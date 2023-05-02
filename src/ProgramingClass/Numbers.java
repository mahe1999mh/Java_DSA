package ProgramingClass;

public class Numbers {
	
	static void printFactor(int n) {
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

	static void printNumber(int n) {
		
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("prime");
		}else {
			System.out.println("not print");
		}
	}
	
	public static void main(String[] args) {
		
//		printFactor(7);
		printNumber(6);
		
	}

}
