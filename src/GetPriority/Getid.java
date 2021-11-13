package GetPriority;

public class Getid extends Thread {
	public void run() {
		System.out.println("Thread is Running");
	}
	public static void main(String[]args) {
		Getid t1=new Getid();
		
		System.out.println("Thread is:"+" "+t1.getName());
		System.out.println("Thread is:"+" "+t1.getId());
		t1.start();
	}

}
