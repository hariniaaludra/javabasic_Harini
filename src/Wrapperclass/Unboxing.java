package Wrapperclass;

import java.util.ArrayList;

public class Unboxing {//conversion of object to primitive type
	
	public static void main(String[]args) {
		
		Character ch = 'a';
		
		char a = ch;//character object to primitive conversion
		
		ArrayList<Integer>  obj=new ArrayList<Integer>();
		
		obj.add(24);
		
		int num= obj.get(0);//get methods returns an Integer object
		
		System.out.println(num);
	
		
		}

}
