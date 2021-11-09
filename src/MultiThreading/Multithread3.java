package MultiThreading;

public class Multithread3 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main (String[]args)
	{
		Multithread3 t1=new Multithread3();
		Multithread3 t2=new Multithread3();

		System.out.println("thread 1 priority:"+t1.getPriority());
		System.out.println("thread 2 priority:"+t1.getPriority());
		t1.start();
		t2.start();
	}
}
