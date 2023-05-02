package PatternsProgrames;

public class Starpattern {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int n=5;
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		output:-
//		*****
//		*****
//		*****
//		*****
//		*****
		

//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				
//				if(j==0 || j==n-1 || i==0 || i==n-1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
//		output
//		*****
//		*   *
//		*   *
//		*   *
//		*****
		
//		int count = 1;
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//			
//				if(count<10) {
//					System.out.print("0"+count+" ");
//					count++;
//				}else {
//					System.out.print(count+" ");
//					count++;
//				}
//				
//			}
//			System.out.println();
//		}
//		output:-
//		01 02 03 04 05 
//		06 07 08 09 10 
//		11 12 13 14 15 
//		16 17 18 19 20 
//		21 22 23 24 25 
		
		
		
//		for(int i=1; i<=n; i++) {
//			
//		for(int j=1; j<=n; j++) {
//			
//			if(i*j<10) {
//				System.out.print("0"+i*j+" ");
//			}else {
//				System.out.print(i*j+" ");
//			}
//			
//		}
//		     
//		System.out.println();
//	}
//		01 02 03 04 05 
//		02 04 06 08 10 
//		03 06 09 12 15 
//		04 08 12 16 20 
//		05 10 15 20 25 
		
//		int a =1;
//		
//		for(int i=0; i<n; i++) {
//			
//			for(int j=0; j<n; j++) {
//				System.out.print(i+j+1);
//				
//			}
//			System.out.println();
//			
//		}
//		12345
//		23456
//		34567
//		45678
//		56789
		
//		for(int i=0; i<n; i++) {
//			
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println();
//			
//		}
//
//*
//**
//***
//****
		
//	for(int i=0; i<n; i++) {
//			
//			for(int j=0; j<i; j++) {
//				System.out.print(j+1);
//				
//			}
//			System.out.println();
//			
//		}
//	1
//	12
//	123
//	1234

//	      for(int i=0; i<n; i++) {
//			
//			for(int j=0; j<=n-i; j++) {
//				System.out.print(" ");
//				
//			}
//			for(int k=0; k<=i; k++) {
//				System.out.print("*");
//				
//			}
//			System.out.println();
//			
//		}
//	       *
//	      **
//	     ***
//	    ****
//	   *****
		
	      for(int i=0; i<n; i++) {
				
			for(int j=0; j<=n-1-i; j++) {
				System.out.print(" ");
				
			}
			for(int k=0; k<=i; k++) {
				if(k==0 || i==k|| i == n-1) {
					System.out.print(k+1+" ");
				}else {
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
			
		}
		
		
		

	}

}
