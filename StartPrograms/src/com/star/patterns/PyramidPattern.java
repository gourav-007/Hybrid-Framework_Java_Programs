package com.star.patterns;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		System.out.println("Enter the number of Rows ? ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			
			//handle no. of spaces.
			for(int j=n-i;j>1;j--) {
				System.out.print(" ");			
			}
			//print stars
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
				
			}
			
		System.out.println();
		}

	}

}
