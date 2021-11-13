package Thread;

public class Startthread extends Thread{
	public void run() {
		System.out.println("the thread is running");
	}
	public static void main(String[]args) {
		Startthread t1=new Startthread();
		t1.start();
	}

}
