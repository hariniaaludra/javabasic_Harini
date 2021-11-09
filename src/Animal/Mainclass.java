package Animal;
public class Mainclass {
	private String name;                  
	void setName(String name) {
		this.name=name;

	}
	public String getName() {
		return name;
	}

	public static void main(String[]args) {
		Mainclass myobj=new Mainclass();
		myobj.setName("Harini");

		System.out.println(myobj.getName());


		}


	}
		
			
		
	


