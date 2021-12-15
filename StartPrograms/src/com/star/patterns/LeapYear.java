package com.star.patterns;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		//Check Leap Year
		//number%400
		//number%4 && number%100
		
		int num;
		System.out.println("Enter the year : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if((num%400==0)||(num%4==0 && num%100!=0)) {
			System.out.println("Given year is leap year.");
		}
		else {
			System.out.println("Not a leap year.");
		}
		
	}

}
