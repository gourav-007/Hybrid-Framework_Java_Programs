package com.star.patterns;

import java.util.Scanner;

public class UseAccount {

	public static void main(String[] args) {

		System.out.println("Enter Size: ");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		Account [] obj = new Account[n];
		for(int i=0;i<obj.length;i++) {
			System.out.println("Enter Values of acctid, name and bal sequentially: ");
			int acctid = kb.nextInt();
			String name = kb.next();
			double bal = kb.nextDouble();
			obj[i] = new Account(acctid, name, bal);
		}
		for(int i=0;i<obj.length;i++) {
			obj[i].showData();	
		}	

	}

}
