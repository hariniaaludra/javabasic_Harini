package com.program1;

public class Mainclass {
	private String name;                  
	public void setName(String name) { // we declare the modifier for the setNmae function as public [eg:public void setName]
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

		
	

	
		
	
	


