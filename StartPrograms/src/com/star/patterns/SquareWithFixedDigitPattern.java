package com.star.patterns;

import java.util.Scanner;

public class SquareWithFixedDigitPattern {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number ? ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(i+1+" ");
			}
			System.out.println("\n");
			
		}

		
	}

}
