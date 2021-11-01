package com.program1;
import java.util.Arrays;

public class Arraymulti {
	public static void main(String[]args) {
		int arr1[][]= {{10,20,30},{40,50,60}};
		int arr2[][]= {{110,120,130},{140,150,160}};
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++)
			{
	
				System.out.println(Arrays.toString(arr1[i]));
				System.out.println(Arrays.toString(arr2[j]));
			}
			
			
		
		}
		
	}
}


