package com.project.app.test;

public class Integral {
	
	public static void main(String[] args) {
		
		//f(x) = x fonkiyonunun integrali
	    //double pi = Math.PI;
		double a = 0;
		double b = 4;
		double n = 999999999.99;
		double t = (b-a)/n;
		double x = 0;
		double y = 0;
		double integral = 0; 
		
		for (double i=0; i<=n; i++) {
			x = a + i*t;
			y = y + x;
			}
			integral = integral + y*t;
	
		System.out.println("integral--->" + integral);
		
	}
	
	

}
