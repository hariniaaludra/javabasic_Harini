package MultiThreading;

public class Multithread1 extends Thread {
	 
	public void run() {	
		 try {
	 
		  for(int i=1;i<5;i++){   
		     
		    Thread.sleep(500);
		    System.out.println(i);
		    }
		  }
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    	}  
		 }
		    
	 public static void main(String[]args) {
		 Multithread1 t1=new Multithread1();
		 Multithread1 t2=new Multithread1();
		 
		 t1.start();
		 t2.start();
			 
		 }

}



		
		        
		  
		 
		 

		 
	 
		 
	 

		    
