package Synchronization;
class Student{
	synchronized static void school(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(500);
					
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		}
}

	class Maths extends Thread{
	public void run() {
			Student.school(1);
	}
}
class Computer extends Thread{
	public void run() {
		Student.school(10);
	}
}
class Sub3 extends Thread{
	public void run() {
		Student.school(100);
	}
}
class Sub4 extends Thread{
	public void run() {
		Student.school(1000);
	}
}


public class Staticsynchronization {
	public static void main(String[]args) {
		Maths s1=new Maths();
		Computer s2=new Computer();
		Sub3 s3=new Sub3();
		Sub4 s4=new Sub4();
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}

}


