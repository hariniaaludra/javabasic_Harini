package Wrapperclass;
import java.util.ArrayList;

public class Autoboxing {//conversion of primitive to an object
	
	public static void main(String[]args) {
		char ch ='a';
		
		Character a=ch;//primitive to character object conversion
		
		ArrayList<Integer> objx =new ArrayList<Integer>();
		
		objx.add(50);//it stores only objects
		
	 System.out.println(objx.get(0));
		
		
		
	}

}
