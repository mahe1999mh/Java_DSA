package LinkedList;

import java.util.*;

import StringPrograming.Reverse;

public class Arraylist {
	
	static ArrayList<Integer> reveres (int a[]){
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		 
		res.add(a[0]);
		
		for(int i=1; i<a.length; i++) {
			
			if(a[i] != a[i-1]) {
				res.add(i);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		int a[] = {1,1,2,3,4,5};
		System.out.println(reveres(a));
		
		ArrayList<Integer> res = reveres(a);
		for(int i=0; i<res.size(); i++) {
			System.out.print(res.get(i)+"  ");
		}
	}
}
