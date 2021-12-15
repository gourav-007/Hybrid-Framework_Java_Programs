package com.star.patterns;

public class FactorialRecurrsion {
	
	static int factorial(int n){
	
		if(n==0) {
			return 1;
		}
	
		else {
			return(n*factorial(n-1));
		}
	}
		
	public static void main(String[] args) {
		
		int i, num=5, fact=1;
		fact=factorial(num);
		System.out.println("Number is "+fact);

	}

}
