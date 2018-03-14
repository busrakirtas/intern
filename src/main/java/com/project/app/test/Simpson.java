package com.project.app.test;

import java.math.BigDecimal;

public class Simpson {
	
	private static double round (double value, int precision,boolean up) {
		int scale = (int) Math.pow(10, precision);
		if(up){
		    return (double) Math.ceil(value * scale) / scale;
		}
		else{
		   return (double) Math.floor(value * scale) / scale;
		}
	}

	public static double floorDouble(double sayi, int scale) {
		
		BigDecimal result2 = (new BigDecimal(sayi)).setScale(scale, BigDecimal.ROUND_HALF_DOWN);
		System.out.println("result2--->"+result2);
		return result2.doubleValue();
	}
	
	public static void main(String[] args) {
		
		String sayi ="3.1234567891534567891325";
//		float orj = new Float(sayi);
		double orj1= new Double(sayi); 
		BigDecimal orj3 = new BigDecimal(sayi);
		
		double orj4 = round(orj1,10,true);
		double orj5 = floorDouble(orj1,10);
		System.out.println("orj4--->"+orj4);
		System.out.println("orj5--->"+orj5);
		
		
		
		System.out.println("orj1--->"+orj1);
		System.out.println("orj3--->"+orj3.setScale(10,BigDecimal.ROUND_HALF_DOWN));
		
	}
	
	public static void main2(String[] args) {
		
		double a = 0;
		double b = 4;
		double n = 99999999.99;
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
			else if(i%2==0) {
				//y = y + x;
				total = total + 2*x;
			}
			else if(i%2==1) {
				//y = y + x;
				total = total + 4*x;
			}
		}
		integral = integral + h*total/3;
		System.out.println("result--->"+integral);
		
		
	}

}
