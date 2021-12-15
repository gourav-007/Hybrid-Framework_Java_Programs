package com.star.patterns;

import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) { //1,2,3
			for(int j=i;j<n;j++) {
				System.out.println(" ");
			}	
			for(int j=n-i;j<=i;j++) {
				System.out.println("*");
			}
		System.out.println();	
		}

	}

}
