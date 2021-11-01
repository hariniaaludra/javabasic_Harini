
public class constructor {
	int student1=3;
	String Name="Harini";
	void display() { //In this the method ic called by object so we declare this in public [eg:public void display]
		System.out.println(student1+" "+Name);
	}
		
			public static void main(String[]args) {
				constructor s1=new constructor();
				constructor s2=new constructor();// the s1 object is enough to call the display method [eg:s1.display]
				s1.display();
				s2.display();
			}
		
	}


