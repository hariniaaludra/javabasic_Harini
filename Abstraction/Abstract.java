package Abstraction;
 
interface Month{
	public void Jan();
	public void Feb();
	public void March();
	
}
 abstract class Jan implements Month{
	public void Feb() {
		System.out.println("This is Jan Month");
	}
 }
 
class  May extends Jan{ // declare this in modifier [eg:public class May extends Jan]
	public void Jan() {
      System.out.println("This is March Month");
	}

public void Apirl() {
	System.out.println("This is Feb Month");
	}
	
	public void March() {
	System.out.println("This is March Month");
			} 
	}
public class Abstract {
	public static void main(String[]args) {
		Month obj=new May();
		obj.Jan();
		obj.Feb();
		obj.March();
	}
}

	


