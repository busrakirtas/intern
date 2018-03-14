package com.project.app.test;

public class Simpson2 {
	
public static void main(String[] args) {
		
		double a = 0;
		double b = 4;
		double n = 9999999.99;
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
			else if(i%3==0) {
				//y = y + x;
				total = total + 2*x;
			}
			else  {
				//y = y + x;
				total = total + 3*x;
			}
		}
		integral = integral + 3*h*total/8;
		System.out.println("result--->"+integral);
		
		
	}

}
