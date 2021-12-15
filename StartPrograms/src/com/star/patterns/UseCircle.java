package com.star.patterns;

import java.util.Scanner;

public class UseCircle {
	
	private static int radius;

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Radius of Circle");
		radius = kb.nextInt();
		
		Circle cir = new Circle();
		cir.setRadius(radius);
		cir.calculateArea();
		cir.calculateCircumference();
	}

}
