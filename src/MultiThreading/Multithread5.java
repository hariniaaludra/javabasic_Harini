package MultiThreading;

public class Multithread5 {
	public void run() {
		System.out.println("Thread is Running");
	}
	public static void main(String[]args) {
		Multithread5 t1=new Multithread5();
		t1.run();
	}

}
