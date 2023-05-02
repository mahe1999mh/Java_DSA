package StringPrograming;

import java.util.Iterator;

public class ReverseString {
	
	static void reversString(String s) {
		
		
		String arr[] = s.split(" ");
		String s2 = "";
		String s3 = "";
		
		for (int i = 0; i < arr.length; i++) {
			
			s2 = arr[i]+ " " + s2;
			
		}
		System.out.println(s2);
		
		for (int i = 0; i < s2.length(); i++) {
			
			s3 = s2.charAt(i)+ s3;
			
		}
		System.out.println(s3.trim());
	
	}

	
	static void reversString2(String s) {
		
		String s2 = " ";
		
		for (int i = 0; i < s.length(); i++) {
			s2 = s.charAt(i) + s2;
		}
		System.out.println(s2);
	}
	
	static void reversString3(String s) {
		
		String s3 = "";
		
		
		for (int i = 0; i < s.length(); i++) {
			
			s3 = s.charAt(i)+ s3;
			
		}
		System.out.println(s3);

	}
	
	public static void main(String[] args) {
		String s = "i going to offce";
		reversString(s);
//		reversString2(s);
		reversString3(s);
	}

}
