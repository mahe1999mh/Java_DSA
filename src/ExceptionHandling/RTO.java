package ExceptionHandling;

import java.util.Scanner;

class UnderAgeExcation extends Exception{
	 String getMassage(){
		return (" you are too young.");
	}
}
class OverAgeExcepation extends Exception{
	String getMassage() {
		return "you are too old";
	}
}

class Applicant{
	int age;
	
	void acceptAge() {
		System.out.println("Enter the age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
	}
	void validata() throws UnderAgeExcation, OverAgeExcepation{
		
		if(age >= 18 && age <=60) {
			System.out.println("collect you are licence");
		}else if(age < 18) {
			UnderAgeExcation ua = new UnderAgeExcation();
			System.out.println(ua.getMassage());
			throw ua;
		}else if(age >60) {
			OverAgeExcepation oa = new OverAgeExcepation();
			System.out.println(oa.getMassage());
			throw oa;
		}
	}
}

class RTO2{
	void initiate() {
		Applicant a = new Applicant();
		for(;;) {
			System.out.println("do you want to applay YES / NO");
			Scanner sc = new Scanner(System.in);
			String aa = sc.next();
			
			if(aa.equals("YES")) {
				try {
					a.acceptAge();
					 a.validata();
					}catch (Exception e) {
						
					}
			}else {
				try {

					}catch (Exception e) {
						System.out.println("THANK YOU");
					}
			}
			
		}
	}
}

public class RTO {

	public static void main(String[] args) {
		
		RTO2 r = new RTO2();
		r.initiate();

	}

}
