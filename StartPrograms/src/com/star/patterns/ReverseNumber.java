package com.star.patterns;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		/*	Number = 12345
		 * reverse=0
		 * number=number%10
		 * reverse*10
		 * 
		 */
		int num,rev=0;
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while(num!=0) {	
			int rem=num%10;
			rev = rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of Number is : "+rev);
		
		
		
		
		
		
		
	}

}
