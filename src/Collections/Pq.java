package Collections;

import java.util.PriorityQueue;

public class Pq {
	
	public static void main(String[] args) {
		
		
		PriorityQueue pq = new PriorityQueue();
		
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.remove();
		pq.peek();
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.contains(1));
	}

}
