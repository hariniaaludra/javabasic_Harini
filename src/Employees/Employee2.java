package Employees;
import java.util.*;
public class Employee2 {
  public static void main(String[]args) {
	  ArrayList<String>list=new ArrayList<String>();
  
	    list.add("Harini");
		list.add("Gomathi");
		list.add("Aswathy");
		list.add("Gladson");
		list.add("Suriya");
		list.add("Pradeep");
		list.add("Santhosh");
		list.add("Suresh");
		list.add("Pooja");
		list.add("Preethika");
		
		for(int i=0;i<1;i++) {
		list.set(0,"Harini");
		System.out.println("Name="+" "+list.get(0));
		list.set(0,"21");
		System.out.println("Dateofjoining="+" "+list.get(0));
		list.set(0,"10,000");
		System.out.println("Salary="+" "+list.get(0));
		
		
  }
  }
}


