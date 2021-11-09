package MultiThreading;

public class Multithreading2 {
	public void run() {
		System.out.println("Thread is Running");
	}
	public static void main(String[]args) {
		Multithreading t1=new Multithreading();
		Thread t2=new Thread("My new Thread is:");
		t1.start();
		String str=t2.getName();
		System.out.println(str);
		
	}

}
