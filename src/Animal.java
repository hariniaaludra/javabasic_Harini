class dog extends Animal{
		void braking() {
			System.out.println("braking");
		}
	}
		class cat extends Animal{
			void mewo() {
				System.out.println("Mewo");
			}
		}
			class Lion extends Animal{
				void roar() {
					System.out.println("Roar");
				}
			}
			public class Animal{
				void eat(){
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


			

		
	

				
					

	
