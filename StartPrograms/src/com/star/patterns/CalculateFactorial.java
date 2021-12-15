package com.star.patterns;

import java.util.Scanner;

public class CalculateFactorial {

	public static void main(String[] args) {

		int num,i,fact=1;
		System.out.println("Enter the number : ");
		Scanner sc =  new Scanner(System.in);
		num = sc.nextInt();


		for(i=1;i<=num;i++) {
			fact = fact*i;
		}

		System.out.println("Factorial of given number is : "+fact);

	}

}
