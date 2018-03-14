package com.project.app.test;

public class Trapez {

public static void main(String[] args) {
		
		double a = 0;
		double b = 4;
		double n = 4;
		double h = (b-a)/n;
		double x = 0;
		//double y = 0;
		double integral = 0;
		double total = 0;
		
		for (double i = 0; i <= n; i++) {
			x = a + i*h;
			if(i==0) {
				//y=y+x;
				total = total + x;
			}
			else if(i==n) {
				//y=y+x;
				total = total + x;
			}
			else {
				//y = y + x;
				total = total + 2*x;
			} 
			//System.out.println("total:"+total);
		}
		integral = integral + h*total/2;
		System.out.println("result--->"+integral);
		
	}
	
}
