package MultiThreading;

public class Multithread2 extends Thread {
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
			}
	
		public static void main(String[]args) {
			Multithread1 t1=new Multithread1();
			Multithread1 t2=new Multithread1();
			
			t1.start();
			t2.start();
			
		}
	}


