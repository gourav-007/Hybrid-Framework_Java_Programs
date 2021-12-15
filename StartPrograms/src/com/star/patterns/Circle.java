package com.star.patterns;

public class Circle {
	
	private int radius;
	
	public void setRadius(int radius) {
		this.radius = radius;		
	}
	
	public void calculateArea() {
		double area = Math.PI*Math.pow(radius, radius);
		System.out.println("Área of Circle is: "+area);
	}
	
	public void calculateCircumference() {
		double circum = 2*Math.PI*radius;
		System.out.println("Circumference of Circle is: "+circum);
	}

}
