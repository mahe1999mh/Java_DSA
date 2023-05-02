package Collections;

import java.util.LinkedList;

public class CollectionsInto {


	public static void main(String[] args) {
		
		LinkedList<Integer> al = new LinkedList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		
		al.add(1,100); 
		System.out.println(al);
		
//		LinkedList b = new LinkedList();
//		b.add(20);
//		b.add(200);
//		b.add(2000);
//		b.add(20000);
//		al.addAll(b);
//		System.out.println(al);al.remove(2)
//		
      System.out.println(al.get(2));
		
      System.out.println(al.remove(3));
      
      System.out.println(al);
      
      System.out.println(al.indexOf(50));
      System.out.println(al.lastIndexOf(50));
      System.out.println(al.remove(2));
      System.out.println(al.subList(0, 3));

      System.out.println(al);
      
	}

}
