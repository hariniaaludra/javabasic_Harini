package Thread;

public class Thread2 implements Runnable{


	public void run() {
		System.out.println("The Thread is Running Continuously");
		
	}
	public static void main(String[]args) {
		Thread2 t1=new Thread2();
		Thread t2=new Thread(t1);
		
		t2.start();
	}
	

}
