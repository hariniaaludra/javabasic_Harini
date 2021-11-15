package Synchronization;
class School{  
synchronized void student(int n){ 
	synchronized(this){
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e)
     {
    	 System.out.println(e);}  
   }  
	}
 }  
}  
  
class Subject1 extends Thread{  
School s;  
Subject1(School s){  
this.s=s;  
}  
public void run(){  
s.student(5);  
}  
  
}  
class Subject2 extends Thread{  
School s1;  
Subject2(School s1){  
this.s1=s1;  
}  
public void run(){  
s1.student(100);  
}  
}  
  
public class Synchronization1 {
public static void main(String args[]){  
School obj = new School(); 
Subject1 t1=new Subject1(obj);  
Subject2 t2=new Subject2(obj);  
t1.start();  
t2.start();
}

}
