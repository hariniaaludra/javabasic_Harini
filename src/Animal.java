class dog extends Animal{ // we can declare this in public [eg:public class dog extends Animal]
		void braking() { // this is also we declare in public[eg:public void braking()]
			System.out.println("braking");
		}
	}
		class cat extends Animal{ // create a class with modifiers [eg:public class cat extends Animal]
			void mewo() { // this method also create with modifiers [eg: public void meow]
				System.out.println("Mewo");
			}
		}
			class Lion extends Animal{ // [eg:public class Lion extends Animal]
				void roar() { // create a method with modifier [eg:public void roar]
					System.out.println("Roar");
				}
			}
			public class Animal{
				void eat(){ //[eg:public void eat]
						System.out.println("eating");
				}
	public static void main(String[]args) {
		
					Animal obj=new Animal();
					cat obj1=new cat();
					Lion obj2=new Lion();
					dog obj3=new dog();
			         obj.eat();
			         obj1.mewo();
			         obj2.roar();
			         obj3.braking();
			}
}


			

		
	

				
					

	
