package Thread;

public class Thread5 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
			public static void main(String[]args) {
				Thread5 t1=new Thread5();
				Thread5 t2=new Thread5();
				
				t1.start();
				try {
					
					t1.join();
					
				}catch(Exception e) {
					System.out.println(e);
				}
				t2.start();
			
				
			}
		
	}
	


