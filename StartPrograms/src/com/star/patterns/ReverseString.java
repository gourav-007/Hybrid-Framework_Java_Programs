package com.star.patterns;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		String rev="";
		//String
		//012345
		for(int i=text.length()-1;i>=0;i--) {
			rev=rev+text.charAt(i);
		}
		System.out.println(rev);
	}

}
