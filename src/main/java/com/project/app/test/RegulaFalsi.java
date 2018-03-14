package com.project.app.test;

public class RegulaFalsi {

	public static void main(String[] args) {
		final double epsilon = 0.01;
		double a, b, p, y_a, y_b, y_p;
		
		a=1; b=2; p=0;
		
		System.out.println("Initial Interval: ["+ a + "," + b + "]");
		
		
//		y_a = Math.sin(2*a)-Math.exp(a-1);
//		y_b = Math.sin(2*b)-Math.exp(b-1);
//		p = (a*y_b-b*y_a)/(y_b-y_a);
//		y_p = Math.sin(2*p)-Math.exp(p-1);

		
		int i = 0;
		
		while((b-a)>epsilon) {
			
			y_a = Math.exp(a*a-1)+10*Math.sin(2*a)-5;
			y_b = Math.exp(b*b-1)+10*Math.sin(2*b)-5;
			p = (a*y_b-b*y_a)/(y_b-y_a);
			y_p = Math.exp(p*p-1)+10*Math.sin(2*p)-5;
			
//			y_a = Math.pow(a, 3)-a-1;
//			y_b = Math.pow(b, 3)-b-1;
//			p = (a*y_b-b*y_a)/(y_b-y_a);
//			y_p = Math.pow(p, 3)-p-1;
//			
		if(Math.abs(y_p)<epsilon) {
			break;
		}
		
			if(y_a*y_p < 0) {
				b = p;
			}
			else {
				a = p;
			}
			System.out.println("New interval: [" + a + " .. " + b + "]");
			i++;
	}System.out.println("Appro vvximate solution = " + p + " iterasyon sayısı = " + i);
	}
}
