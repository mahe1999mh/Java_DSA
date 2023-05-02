package ProgramingClass;

import java.util.Arrays;

public class NonRepeatingValues {

	 static void NonRepeatingValues(int arr[]) {
		
		int count = 1;
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i]==arr[i+1]) {
			     count++;
			}else {
				System.out.println(arr[i]+" - "+count);
				count = 1;
			}
		}
		System.out.println(arr[arr.length -1]);
	}
	 
	 static void countmaxNumber(int arr[]) {
		int count = 1;
		int max =  0;
		int value = 0;
		
		for(int i=0; i<arr.length -1; i++) {
			if(arr[i]==arr[i+1]) {
				count++;
			}else {	
				if(count > max) {
					max = count;
					value = arr[i];
				}	
				count =1;
			}
		}
		
		if(count > max) {
			max = count;
			value = arr[arr.length -1];
		}
		
		System.out.println(value);
	}
	 
	 static void nonrepeatingarray(int arr[]) {
		 int count =1;
		 
		 for (int i = 0; i < arr.length -1; i++) {
			   if(arr[i] == arr[i+1]) {
				   count++;
			   }else{
				   if(count > 1) {
					   System.out.println(arr[i]);    
				   }
			        count = 1;
			   }
		}
		 if(count > 1) {
			   System.out.println(arr[arr.length -1]);    
		   }
		 
	 }
	 
	 static void print2largest(int arr[]) {

//          Arrays.sort(arr);
//          System.out.println(arr[arr.length -2]);
		 
		 int max1 = 0;
		 int max2 = 0;
		 if(arr[0]>arr[1]) {
			 max1 = arr[0];
			 max1 = arr[1];
		 }else{
			 max1 = arr[1];
			 max2 = arr[0];
		 }
		 
		 for (int i = 2; i < arr.length; i++) {
			
			 if(arr[i]>max1) {
				 max2 = max1;
				 max1 = arr[i];
			 }else if(arr[i]>max2) {
				 max2 = arr[i];
			 }
			 
		}
		 
		 System.out.println(max1+" "+max2);
	 }
	 
	 static void printMAxPair(int arr[]) {
		 
		Arrays.sort(arr);
		int max1 = arr[arr.length -1];
		int max2 = arr[arr.length -2];
		System.out.println(max1+max2);
	 }
	 
	 static void printMinpair(int arr[]) {
		 Arrays.sort(arr);
			int max1 = arr[0];
			int max2 = arr[1];
			System.out.println(max1+max2);
	 }
	 
     	 
	 
	public static void main(String[] args) {
     int arr[] = {1,3,12,7,9};
//		  NonRepeatingValues(arr);
//        countmaxNumber(arr);
//        nonrepeatingarray(arr);
//        print2largest(arr);
//        printMAxPair(arr);
//        printMinpair(arr);
	}

}
