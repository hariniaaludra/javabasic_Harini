package StringBuilder;

public class Stringcapacity {
	public static void main(String[]args) {
		StringBuilder s=new StringBuilder();
		s.append("Hello");
		s.ensureCapacity(10);
		System.out.println(s.capacity());
	}

}
