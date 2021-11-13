package com.array;

import java.util.Scanner;

public class Subarray {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[j]);
			}
		}
	}

}
