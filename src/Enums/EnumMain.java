package Enums;

enum Month{
	JAN(1),FEB(2),MARCH(3),APIRL(4),MAY(5);
	int numbers;
	Month(int no){
	numbers=no;
	
}
}
        public class EnumMain {
		public static void main(String[]args) {
			//calling values
			Month a[]=Month.values();
			for(Month obj:a)
			{//enum with loop
			System.out.println(obj+" at index"+obj.ordinal());
			
		    Month obj1=Month.MARCH;
			System.out.println(obj1);
			}
	        System.out.println(Month.valueOf("JAN"));
		}
		}
	

	
		
