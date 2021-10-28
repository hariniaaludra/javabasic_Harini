package Enums;

enum Day{
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THRUSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY;

	private Day() {
	System.out.println("Constructor called for : "+this.toString());
}
public void Weekend() {
	System.out.println("SUNDAY");
	
}
}
public class EnumMethod {
	public static void main(String[]args) {
		Day obj=Day.TUESDAY;
		System.out.println(obj);	
		obj.Weekend();
	}

}

	
		
		
	

