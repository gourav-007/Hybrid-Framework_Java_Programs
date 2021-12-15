package com.star.patterns;

public class Panildrome {

	public static void main(String[] args) {

		int rem;
		int rev=0;
		int n=135;
		int temp=n;
		
		while(temp!=0) {
			
				rem = temp%10;
				rev=rev*10+rem;
				temp=temp/10;
		}
		
		if(n==rev)
		{
			System.out.println("Panildrome.");
		}
		
		else {
			System.out.println("Not Panildrome.");
		}

	}

}
