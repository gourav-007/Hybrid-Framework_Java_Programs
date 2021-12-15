package com.star.patterns;

public class FibonacciRecursion {
	
	static int a=0;
	static int b=1;
			int c;

	public void printRecursion(int i) {
		
		if(i>=1) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			printRecursion(i-1);
		}
	}

	public static void main(String[] args) {
		
		FibonacciRecursion fr = new FibonacciRecursion();
		fr.printRecursion(20);
		

	}

}
