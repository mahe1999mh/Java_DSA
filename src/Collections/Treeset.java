package Collections;

import java.util.TreeSet;

public class Treeset {
public static void main(String[] args) {
	
	TreeSet t = new TreeSet();
	t.add(4);
	t.add(2);
	t.add(1);
	t.add(2);
	System.out.println(t.last());
	
//	t.remove(4);
    t.pollFirst();
//	t.pollLast();
	TreeSet t2 = new TreeSet();
	t2.add(4);
	t2.add(2);
	t2.add(1);
	t2.add(2);
	System.out.println(t.equals(t2));
	System.out.println(t);
	
}
}
