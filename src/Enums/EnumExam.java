package Enums;
enum Level{
	EASY,
	MEDIUM,
	HIGH;
}

public class EnumExam {
       public static void main(String[]args) {
    	  Level obj[]=Level.values();
    	  for(Level x:obj);//for each loop
    	  for(Level objx :Level.values()){//loop through an enum
    		  System.out.println(objx);
    	  
    		  System.out.println(Level.valueOf("MEDIUM"));
    	  }
    	  }

}
