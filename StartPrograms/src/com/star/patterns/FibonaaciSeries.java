package com.star.patterns;

public class FibonaaciSeries {

	public static void main(String[] args) {
		
		/*	Fibonaaci Series
		 * 
		 * 	0 1 2 3 4 5 6
		 * 
		 * Same concept as used in swapping numbvers,
		 */
		
		int a=0, b=1;
		int c;
		
		for(int i=1;i<=10;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
