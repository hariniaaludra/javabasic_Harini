package com.string;

public class Stringfunctions {


	    public static void main(String[] args) {
	        

	        if ("Paris".equals("Paris")) {
	            System.out.println("Paris was typed in.");
	        } else {
	            System.out.println("The text typed in is: " );
	        }

	        if ("Paris".equalsIgnoreCase("PARIS")) {
	            System.out.println("Paris was typed in.");
	        } else {
	            System.out.println("The text typed in is: " );
	        }

	        if ("Paris".contains("ris")) {
	            System.out.println("The input text contains Par.");
	        }

	        if ("Paris".isEmpty()) {
	            System.out.println("The input text is empty.");
	        }

	        System.out.println("The input text's length is: " +"Paris" .length());
	        System.out.println("The input text with uppercase: " + "paris".toUpperCase());
	        System.out.println("The input text with lowercase: " +"Paris" .toLowerCase());

	        if ("Paris".startsWith("P") || "Paris".endsWith("r")) {
	            System.out.println("The input text starts or ends with a P letter.");
	        }

	        System.out.println("The replaced text: " + "Paris".replace("N", "D"));
	    }

		
		
	}


