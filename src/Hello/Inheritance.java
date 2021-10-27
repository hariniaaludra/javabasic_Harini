package com.Hello;
class name{
	void harini() {
		System.out.println("harini");
	}
}
class age extends name{
	void age() {
		int age=22;
		System.out.println(age);
	}
}
	class id extends name{
		void id() {
			int id=13;
			System.out.println(id);
	
		}
	}
		public class Inheritance{
			
		
		public static void main(String[]args) {
			name obj1=new name();
			age obj2=new age();
			id obj3=new id();
			obj3.harini();
			obj2.age();
			obj3.id();
		}
	}

	
	










