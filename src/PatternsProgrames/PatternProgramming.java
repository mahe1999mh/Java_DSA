package PatternsProgrames;

public class PatternProgramming {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int a = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				
				if(i==j) {
					System.out.print(i);
				}else {
					System.out.print(a);	
				}	
			}
			System.out.println();
		}
		
		System.out.println();
		
//		output:-
//		11111
//		12111
//		11311
//		11141
//		11115
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {				
				System.out.print(j);	
			}
			   for(int k=1; k<=n-i; k++) {
				   
				   System.out.print("1");
			   }
			System.out.println();
		}
		System.out.println();
//		11111
//		12111
//		12311
//		12341
//		12345
		

		for(int i=5; i>=1; i--) {
			
		for(int j=5; j>=1; j--) {				
			System.out.print(j);	
		}

		System.out.println();
	   }
		
//		54321
//		54321
//		54321
//		54321
//		54321
		
		System.out.println();
		
		for(int i=1; i<=n; i++) {
		
			   for(int j=1; j<=i; j++) {				
			      System.out.print("0");
		      }
			
			   for(int k=1; k<=n-i; k++) {				
			      System.out.print("1");
		      }

           	System.out.println();
        }
		System.out.println();
//		01111
//		00111
//		00011
//		00001
//		00000
		
//		for(int i=1; i<=n; i++) {
//			
//			   for(int j=1; j<=n; j++) {
//				   if((i+j)%2==0) {
//					   System.out.print("1");
//				   }else {
//					   System.out.print("0");
//				   }  
//		      }
//        	System.out.println();
//     }
//		10101
//		01010
//		10101
//		01010
//		10101
		
//		for(int i=1; i<=n; i++) {
//			
//			   for(int j=1; j<=n; j++) {
//				   if(j==i) {
//					   System.out.print(i);
//				   }else {
//					   System.out.print("0");
//				   }  
//		      }
//     	System.out.println();
//  }
//		
//		10000
//		02000
//		00300
//		00040
//		00005
		
		for(int i=1; i<=n; i++) {
			
			   for(int j=1; j<=n-i; j++) {
				   System.out.print(" ");
		      }
			   for(int k=1; k<=i; k++) {
				   System.out.print(k);
			   }
  	             System.out.println();
       }
		System.out.println();
//		
//	     1
//	    12
//	   123
//	  1234
//	 12345
		
		

		for(int i=1; i<=n; i++) {
			
			   for(int j=1; j<=n-i; j++) {
				   System.out.print(" ");
		      }
			   int d=5;  
			   
			   for(int k=i; k>=1; k--) {
				   System.out.print(d--);
			   }
  	             System.out.println();
       }
//	     5
//	    54
//	   543
//	  5432
//	 54321

		
		

	}

}
