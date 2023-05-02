package Collections;

import java.util.LinkedList;

public class LL {
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		
		System.out.println(ll.pop());
		System.out.println(ll.indexOf("C"));
		System.out.println(ll.size());
		
		System.out.println(ll.peekFirst());
		System.out.println(ll);
	}

}
