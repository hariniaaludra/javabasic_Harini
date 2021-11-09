package MultiThreading;

public class Multithreading extends Thread {
	public void run(){
		System.out.println("Thread is Running");
	}
	public static void main(String[]args) {
		Multithreading t1=new Multithreading();
		Thread t2=new Thread(t1);
		t1.start();
	}

}
