package ProgramingClass;

import java.util.Scanner;

public class EvenOrOdd {
	
	static void evenorodd(int n) {
		
		if(n%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("odd");
		}
		
	}
	
	static void endwithZero(int n) {
		
		
		int a = n%100;
		System.out.println(a);
		if(a==0) {
		   System.out.println("yse");
		}else {
			System.out.println("no");
		}
	}
	
	static void endwithFive(int n) {
		if(n%5==0 && n%10!=0) {
			   System.out.println("end with five");
			}else {
				System.out.println("not five");
			}
	}
	
	static void lastTwoNumbers(int n) {
		//printing last two numbers
		
	    //System.out.println(n%100);
		if(n%100==0) {
			System.out.println("00");
		}else {
			System.out.println(n%100);
		}
		
		
		//printing last thee numbers
		System.out.println(n%1000);
	}
	
	static void numberIsTwoDigitOrNot(int n) {
		
		if(n>=10 && n<=99) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	
	static void printchar(int  n) {
		System.out.println((char)n);
	}
	
	static void printEvenNO(int n) {
		
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	
public static void main(String[] args) {

	try (Scanner scan = new Scanner(System.in)) {
		int n = scan.nextInt();
	}
	
//	evenorodd(n);
//	endwithZero(n);
//	endwithFive(n);
//	lastTwoNumbers(n);
//	numberIsTwoDigitOrNot(n);
//	printchar(n);
//	printEvenNO(n);


//	System.out.println(20%100);
	
}
}
