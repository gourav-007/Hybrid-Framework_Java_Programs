package com.star.patterns;

import java.util.Scanner;

public class RightAngleTriangle {

	public static void main(String[] args) {
		System.out.println("Enter the number of Rows ?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //input = 5
		for(int i=0;i<n;i++) {	// 1,2,3,4,5
			for(int j=0;j<=i;j++) { 
				System.out.print("*"+" ");
			}
			System.out.println();	
		}


	}

}
