package com.star.patterns;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//calculating length
		int no=163;
		int temp=no;
		int len=0;

		while(temp!=0) {

			temp=temp/10;
			len=len+1;
		}

		//rev a no.

		int temp1=no;
		int rem, arm=0;

		while(temp1!=0) {

			rem=temp1%10;
			int mul=1;

			for(int i=1;i<=len;i++) {
				mul=mul*rem;
			}

			arm=arm+mul;
			temp1=temp1/10;
		}
		if(no==arm) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}

	}
}

