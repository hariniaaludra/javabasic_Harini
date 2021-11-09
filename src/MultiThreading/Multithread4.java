package MultiThreading;

public class Multithread4 extends Thread {
	public void run() {
		System.out.println("thread is running");
	}
	public static void main(String[]args) {
		Multithread1 t1=new Multithread1();
		Multithread1 t2=new Multithread1();
		t1.start();
		t2.start();
		t1.setName("Hello");
		t2.setName("World");
		System.out.println("changing name:"+t1.getName());
		System.out.println("changing name:"+t2.getName());
	}

}
