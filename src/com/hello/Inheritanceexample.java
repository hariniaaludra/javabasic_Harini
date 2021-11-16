package com.hello;
class Name{  //class name changed 
	void student() { 
		System.out.println("harini");
	}
}
class Age extends Name { //class name changed
	void studentage() {
		int age=22;
		System.out.println(age);
	}
}
	class Id extends Name{ //class name changed
		void id() {
			int id=13;
			System.out.println(id);
	
		}
	}
		public class Inheritanceexample{
			
		
		public static void main(String[]args) {
			Name obj1=new Name(); //unused 
			Age obj2=new Age();
			Id obj3=new Id();
			obj3.student();
			obj2.studentage();
			obj3.id();
		}
	}

	
	










