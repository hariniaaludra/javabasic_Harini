package MultiThreading;

class ThreadJoin extends Thread{
	public void run() {
	 try {
		 for(int i=1;i<5;i++) {
			 System.out.println("Thread is :"+Thread.currentThread().getName());
		 }
	 
				 
			 }catch(Exception e) {
				 System.out.println(e);
			 }
	}
	 
	public class Multithreadjoin {
			 public static void main(String[]args) {
				 ThreadJoin t1=new ThreadJoin();
				 ThreadJoin t2=new ThreadJoin();
				 ThreadJoin t3=new ThreadJoin();
				 t1.start();
				 try {
					 System.out.println("thread is:"+Thread.currentThread().getName());
				 
			 
				 t1.join();
		 }
			 catch(Exception e) {
				 System.out.println(e);
			 }
			 
				 t2.start();
				 try {
					 System.out.println("thread is:"+Thread.currentThread().getName());
					 t2.join();
				 }
				 catch(Exception e) {
					 System.out.println(e);
				 }
			 
				 t3.start();
			 }		 
	 }
	}





