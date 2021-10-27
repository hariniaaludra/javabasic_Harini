package Polyexample;

public class Overloading {
	int RollNo;
	String name;
	
Overloading(String n,int i){
	name=n;
	RollNo=i;
}
void display() {
	System.out.println(name+" "+RollNo);
}
}

