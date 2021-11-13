package Thread;

public class Currentthread extends Thread {
	public void run() {

			System.out.println("Thread is:"+" "+Thread.currentThread().getName());
		
	}
	public static void main(String[]args) {
		Currentthread t1=new Currentthread();
		Currentthread t2=new Currentthread();
		Currentthread t3=new Currentthread();
		
		t1.setName("Hello Thread");
		t2.setName("Thread is running");
		t3.setName("Java");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		System.out.println("Current Thread is:"+" "+t2.getPriority());
		System.out.println("Current Thread is:"+" "+t3.getPriority());
	}

}
