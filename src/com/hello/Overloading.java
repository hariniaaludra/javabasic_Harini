package com.hello;

public class Overloading {
	int id;
	String name;
	int age;
	
Overloading(String n,int i){
	name=n;
	id=i;
}
Overloading(String n,int i,int a){
	name=n;
	id=i;
	age=a;

}
void display() {
System.out.println(name+" "+id+" "+age);

}
public static void main(String[]args) {
	
	Overloading obj1=new Overloading("Harini",13);
	Overloading obj2=new Overloading("Harini",13);
	obj1.display();
	obj2.display();
}
}

	
	
	



