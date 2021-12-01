package program;
 
interface Month{
	public void jan();
	public void feb();
	public void march();
	
}
 abstract class Jan implements Month{
	public void feb() {
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

	@Override
	public void jan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void march() {
		// TODO Auto-generated method stub
		
	} 
	}
public class Abstract {
	public static void main(String[]args) {
		Month obj=new May();
		obj.jan();
		obj.feb();
		obj.march();
	}
}

	


