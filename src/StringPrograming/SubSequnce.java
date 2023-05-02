package StringPrograming;

public class SubSequnce {
	
	static void subsequnce(String s1,String s2) {
		
int i=0, j=0;
		
		while(i<s1.length() && j<s2.length())
		{
			if(s1.charAt(i)==s2.charAt(j)) {
				j++;
				
			}
			i++;
		}
		
		System.out.println(j==s2.length());
	
	}
	
	public static void main(String[] args) {
		
		String s1 ="ahbgdc";
		String s2 = "abc";
		subsequnce(s1,s2);
		
	}

}
