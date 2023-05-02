package MultieThread;

class Demo extends Thread{
	public void run() {
		for(int i=65; i<=75; i++) {
			System.out.print((char)i);
		}
	}
}

class Demo1 extends Thread{
	public void run() {
		
		for(int i=1; i<=10; i++) {
			System.out.print(i);
		}
		
	}
}
public class ThreadUsingExteand {
   public static void main(String[] args) {
	   Demo d = new Demo();
       Demo1 d2 = new Demo1();
       
       
       d.start();
       d2.start();
}
}



