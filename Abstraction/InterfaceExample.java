package Abstraction;

interface Animal{
	public void Animalsound();
	public void sleep();
}
	
 class Pig implements Animal{
	public void Animalsound() {
		System.out.println("The pig says wee wee");
	}
    public void sleep()
    {
    	System.out.println("Zzzzz");
    }
 }
	public class InterfaceExample {
		public static void main(String[]args) {
			Animal myobj=new Pig();
			myobj.Animalsound();
		    myobj.sleep();
		}
	}
 
	
	

	

