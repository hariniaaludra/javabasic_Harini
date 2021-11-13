package GetPriority;

public class Getpriority extends Thread {
	public void run() {
		System.out.println("The Thread is:"+Thread.currentThread().getPriority());
	}
	public static void main(String[]args) {
		Getpriority t1=new Getpriority();
		Getpriority t2=new Getpriority();
		Getpriority t3=new Getpriority();
		
		System.out.println("Thread Priority:"+" "+t1.getPriority());
		System.out.println("Thread priority:"+" "+t2.getPriority());
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
