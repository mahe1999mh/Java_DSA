package Demo;

public class Paladrom2 {
	
	static boolean paladrom1(String a) {
				
		int i=0, j= a.length()-1;
		
		while(i <= j) {
			
			if(a.charAt(i) != a.charAt(j))
			{
				return false;
			
			}
			
			i++;
			j--;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "level";
		System.out.println(paladrom1(a));
		

	}

}
