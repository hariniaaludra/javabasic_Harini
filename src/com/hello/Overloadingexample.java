package com.hello;

public class Overloadingexample {
	int id;
	String name;
	int age;
	
Overloadingexample(String n,int i){
	name=n;
	id=i;
}
Overloadingexample(String n,int i,int a){
	name=n;
	id=i;
	age=a;

}
void display() {
System.out.println(name+" "+id+" "+age);

}
public static void main(String[]args) {
	
	Overloadingexample obj1=new Overloadingexample("Harini",13);
	Overloadingexample obj2=new Overloadingexample("Harini",13);
	obj1.display();
	obj2.display();
}
}

	
	
	



