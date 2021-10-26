package Animal;


	class dog extends Animal1{
		void braking() {
			System.out.println("braking");
		}
	}
		class cat extends Animal1{
			void mewo() {
				System.out.println("mewo");
			}
		}
			class Lion extends Animal1{
				void Roar() {
					System.out.println("Roar");
				}
			}
	       public class Animal1 {
	        void eat() {
		     System.out.println("eating");
	        }
	       
	            public static void main(String[]args) {
					Animal1 obj=new Animal1();
					dog obj1=new dog();
					cat obj2=new cat();
					Lion obj3=new Lion();
					obj.eat();
					obj1.braking();
					obj2.mewo();
					obj3.Roar();
	            }
}
				
			
		
		
		


