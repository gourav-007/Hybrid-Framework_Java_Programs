package com.star.patterns;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		int num1, num2, temp;
		System.out.println("Enter Two Number : ");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;


		System.out.println("After Swapping Numbers are : "+num1);
		System.out.println("After Swapping Numbers are : "+num2);

	}

}
