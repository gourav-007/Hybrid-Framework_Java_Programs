package com.star.patterns;

import java.util.Scanner;

public class SqaureWithAlphabetPattern {

	public static void main(String[]args) {

		System.out.println("Enter the number?");
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print((char)(65+i)+" ");
			}
			System.out.println("\n");
		}

	}

}
