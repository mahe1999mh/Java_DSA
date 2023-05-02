package ExceptionHandling;

import java.util.Scanner;


class InvalidUserException extends Exception{

	public String getMassage() {
		return("Invalid Pin");
	}
}

class Atm{
	int pin = 8888;
    int p;
	
	void Pin() {
		System.out.println("Enter the pin");
		Scanner sc = new Scanner(System.in);
		p = sc.nextInt();
	}
	
	void Varify() throws Exception {
		if(p == pin) {
			System.out.println("login is successful");
		}else {
			InvalidUserException in = new InvalidUserException();
			System.out.println(in.getMassage());
			throw in;
		}
	}
}

class Bank{
	void initiate(){
		Atm a = new Atm();
		
		
		try {
			a.Pin();
			a.Varify();
		} catch (Exception e) {
			
			try {
				a.Pin();
				a.Varify();
			} catch (Exception f) {
				
				try {
					a.Pin();
					a.Varify();
				} catch (Exception g) {
					
					System.out.println("Try again after 24hrs");
				}
			}
		}
	}
}


public class AtmCostomExcepation {

	public static void main(String[] args) {
		
             Bank b = new Bank();
             b.initiate();
	}

}
