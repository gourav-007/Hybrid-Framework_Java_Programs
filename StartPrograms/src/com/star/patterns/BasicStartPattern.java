package com.star.patterns;

import java.util.Scanner;

public class BasicStartPattern {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number ?");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i=0;i<input;i++) {
			System.out.println("*");
		}
		
		
		
		

	}

}
