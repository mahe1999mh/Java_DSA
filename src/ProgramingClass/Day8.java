package ProgramingClass;

import java.util.*;

public class Day8 {
	
	static void largestNumber() {
		int arr[] = {2,5,1,4,3,4,1,5,1,3};
		int count = 0;
		int n =0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]> count) {
				count = arr[i];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==count) {
				n++;
			}
		}
		System.out.println(n);
	}

	static void largestNumberUsingOneloop() {
		
		int count =0;
		int max =0;
		int arr[] = {2,5,1,4,3,4,1,5,1,3};
		for(int i=0; i<arr.length; i++) {
			
			
			if(arr[i]>max ) {
				max = arr[i];
				count=1;
			}else if(arr[i]==max){
				count++;
			}
		}
//		System.out.println(max);
		System.out.println(count);
	}
	
	static void printIndex(int n) {
		
		//print fist index of value one
		int arr[] = {2,5,1,4,3,4,1,5,1,3};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==n) {
				System.out.println(i);
				break;
			}
		}
	}

	static void printLastIndex(int n) {
		int arr[] = {2,5,1,4,3,4,1,5,1,3};
		for(int i=arr.length -1; i>=0; i--) {
			if(arr[i]==n) {
				System.out.println(i);
				break;
			}
		}
	}
	
	static void printStar(){
		
		int count =0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
				count++;
			}
			System.out.println(count);
		}
		
	}
	
	
	public static void main(String[] args) {
		
//		largestNumber();
//		largestNumberUsingOneloop();
//		printIndex(3);
//		printLastIndex(1);
		printStar();
		
		
	}

}
