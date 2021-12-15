package com.star.patterns;

public class CheckPrime {

	public static void main(String[] args) {
		
		int num=7,temp=0;
		for(int i=2;i<=num-1;i++) {
			
			if(num%i==0) {
				temp=temp+1;
			}
		}
		
		if(temp>0) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime ");
		}
			
		}
		
	}