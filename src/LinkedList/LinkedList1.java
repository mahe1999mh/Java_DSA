package LinkedList;

class Node{
	int data;
	Node next;
	
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}


class Linkedlst{
	Node head;
	void printlinked() {
		Node curr = head;
		
		while(curr != null) {
			System.out.println(curr.data);
//			System.out.println(curr.next); //node adders
			curr = curr.next;
		}
	}
	
    //Add element
	void add(int e) {
		Node temp = new Node(e);
		//if linkedList is emty
		if(head == null) {
			
			head = temp;
			
		}else {
//			if linkedList is not emty
			Node curr = head;
			
			while(curr.next != null) {
				curr = curr.next;
			}
			  curr.next = temp;
			
		}
	}
	
	//Add Fist
	void addFirst(int e) {
		Node temp = new Node(e);
		if(head == null) {
			head = temp;
		}else {
			temp.next = head;
			head = temp;
		}
	}
 

}

public class LinkedList1 {
	public static void main(String[] args) {
           
		Linkedlst ll = new Linkedlst();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.addFirst(5);
		ll.printlinked();
		
		
	}

}
