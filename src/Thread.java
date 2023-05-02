

class Demo extends Thread{
	void run() {
		for(int i=65; i<=75; i++) {
			System.out.println((char)i);
		}
	}
}

class Demo1 extends Thread{
	void run() {
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
	}
}
public class Thread {

	public static void main(String[] args) {
	
       Demo d = new Demo();
       Demo1 d2 = new Demo1();
       
       d.run();
       d2.run();
       
	}

}
