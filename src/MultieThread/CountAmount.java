package MultieThread;
import java.util.Scanner;


public class CountAmount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
         
		String S = sc.nextLine();
		
		String s1[] = S.split(" ");
		
		for(int i=0; i<s1.length; i++) {
			System.out.print(s1[i]);
	   } 
		
		
	}
}
