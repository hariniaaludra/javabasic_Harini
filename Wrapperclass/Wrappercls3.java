package Wrapperclass;
//primitive to wrapper
public class Wrappercls3 {
	public static void main(String[]args) {
		Integer obj=new Integer(4);//wrapper to primitive
		int i=obj.intValue();
		int j=obj;
		int a=250;
		Integer A=Integer.valueOf(a);
		Integer B=a;
		System.out.println(a+" "+A+" "+B);
		System.out.println(obj+" "+i+" "+j);
	}

}
