package Thread;

public class Thread4 extends Thread {
	public void run() {
		
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		}
			public static void main(String[]args) {
				Thread4 t1=new Thread4();
				Thread4 t2=new Thread4();
				t1.start();
				t2.start();
				
			}
		
	}


