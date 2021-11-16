package com.enum1;

enum Date{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FIRDAY,SATURDAY,SUNDAY;
	
}

public class Enumprogram {
	Date date=Date.SUNDAY;
	
	public void  main(Date date) {
	
		this.date=date;
	}

	public void method()
	{
	
	switch(date) 
	{
	case MONDAY:
	{
		System.out.println(" This is MONDAY");
		break;
	}
	case TUESDAY:
	{
		System.out.println("This is TUESDAY");
		break;
	}
	case WEDNESDAY:
	{
		System.out.println("This is WEDNESDAY");
		break;
	}
	case THURSDAY:
	{
		System.out.println("This is THURSDAY");
		break;
	}
	case FIRDAY:
	{
		System.out.println("This is FIRDAY");
		break;
	}
	case SATURDAY:
	{
		System.out.println("This is SATURDAY");
		break;
	}
		default: 
			System.out.println("SUNDAY is a Weekend");
	}
	}
	public static void main(String[]args) {
		String str="SUNDAY";
		System.out.println(Date.valueOf(str));
		Enumprogram obj=new Enumprogram();
		obj.method();
	}
	}
	
	


		
		
	
	


