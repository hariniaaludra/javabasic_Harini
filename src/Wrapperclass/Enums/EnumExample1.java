package Enums;

enum Color{//outside the class
	RED,
	BLUE,
	GREEN;
}
public class EnumExample1 {
	public static void main(String[]args) {
		Color s=Color.RED;
		Color obj= Color.BLUE;
		Color a=Color.GREEN;
		System.out.println(a);
		System.out.println(s);
		System.out.println(obj);
	}

}
