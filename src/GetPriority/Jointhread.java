package GetPriority;
class Threadjoin extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			try {
				Thread.sleep(500);
				System.out.println("Thread is:"+" "+Thread.currentThread().getName());
				
			}catch(Exception e) {
				System.out.println(e);
				System.out.println(i);
			}
		}
	}
}
public class Jointhread {
	public static void main(String[]args) {
		Threadjoin t1=new Threadjoin();
		t1.start();
		t1.setName("Thread running");
		try {
			System.out.println("Current Thread is:"+" "+Thread.currentThread().getName());
			t1.join();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
