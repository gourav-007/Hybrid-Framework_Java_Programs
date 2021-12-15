package com.star.patterns;

public class Account {

	private int acctid;
	private String name;
	private double bal;

	public Account(int acctid, String name, double bal) {

		this.acctid=acctid;
		this.name=name;
		this.bal=bal;
	}

	public void showData() {
		System.out.println("Your details for "+name+" as: "
				+acctid+", "+name+", "+bal);
	}
	
	  
	
}
