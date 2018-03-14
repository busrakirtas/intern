package com.project.app.math;

import com.project.app.model.FonksiyonModel;

public class Calculations {

	public double calculateIntegral(FonksiyonModel im) {

		double x = 0;
		double y_m = 0;
		double a = im.getAltSinir();
		double b = im.getUstSinir();
		double n = 10.00;
		double t = (b - a) / n;
		double integral = 0;
		double pi = Math.PI;
		double e = Math.E;
		boolean isTrig = false;

		for (double i = 0; i <= n; i++) {
			int l, m;
			double y = 0;
			int p = 0;
			double net = 0;

			String[] f = im.getFonksiyon().split("\\-|\\+");
			x = a + i * t;
			for (String t1 : f) {
				System.out.println("function:" + t1);

				if (t1.contains("exp")) {
					net = Math.exp(x);
					y = y + net;
				} else if (t1.contains("asin")) {
					net = Math.asin(x);
					y = y + net;
				} else if (t1.contains("acos")) {
					net = Math.acos(x);
					y = y + net;
				} else if (t1.contains("atan")) {
					net = Math.atan(x);
					y = y + net;
				} else if (t1.contains("sin")) {
					isTrig = true;
					net = Math.sin(pi * (x / 180));
					y = y + net;
				} else if (t1.contains("cos")) {
					isTrig = true;
					net = Math.cos(pi * (x / 180));
					y = y + net;
				} else if (t1.contains("tan")) {
					isTrig = true;
					net = Math.tan(pi * (x / 180));
					y = y + net;
				} else if (t1.contains("sqrt")) {
					net = Math.pow(x, 2);
					y = y + net;
				} else if (t1.contains("root")) {
					l = t1.indexOf(",");
					m = t1.indexOf(")");
					p = Integer.parseInt(t1.substring(l + 1, m));
					System.out.println("p--->" + p);
					net = Math.pow(x, (1.0 / p));
					y = y + net;
				} else if (t1.contains("ln")) {
					net = Math.log(x);
					y = y + net;
				} else if (t1.contains("log")) {
					net = Math.log10(x);
					y = y + net;
				} else if (t1.contains("^")) {
					l = t1.indexOf("^");
					p = Integer.parseInt(t1.substring(l + 1));
					System.out.println("p--->" + p);
					net = Math.pow(x, p);
					y = y + net;
				} else {
					y = x;
				}
			}
			y_m = y_m + y;
		}
		if (isTrig) {
			t = pi * (t / 180);
		}
		integral = integral + y_m * t;
		System.out.println("y_m-->" + y_m);
		System.out.println("integral--->" + integral);
		double result = integral;
		return result;
	}

	public double calculateTrapezoid(FonksiyonModel tm) {

		double y_m = 0;
		double a = tm.getAltSinir();
		double b = tm.getUstSinir();
		double n = 10.00;
		double h = (b - a) / n;
		double x = 0;
		double integral = 0;
		double total = 0;
		boolean isTrig = false;
		double e = Math.E;
		double pi = Math.PI;
		for (double i = 0; i <= n; i++) {

			double y = 0;
			int l, m;

			int p = 0;
			double net = 0;

			String[] f = tm.getFonksiyon().split("\\+");
			x = a + i * h;
			for (String t1 : f) {
				System.out.println("function:" + t1);

				if (t1.contains("exp")) {
					net = Math.exp(x);
					y = y + net;
				} else if (t1.contains("asin")) {
					net = Math.asin(x);
					y = y + net;
				} else if (t1.contains("acos")) {
					net = Math.acos(x);
					y = y + net;
				} else if (t1.contains("atan")) {
					net = Math.atan(x);
					y = y + net;
				} else if (t1.contains("sin")) {
					isTrig = true;
					net = Math.sin(pi * (x / 180));
					y = y + net;
				} else if (t1.contains("cos")) {
					isTrig = true;
					net = Math.cos(pi * (x / 180));
					y = y + net;
				} else if (t1.contains("tan")) {
					isTrig = true;
					net = Math.tan(pi * (x / 180));
					y = y + net;
				} else if (t1.contains("sqrt")) {
					net = Math.pow(x, 2);
					y = y + net;
				} else if (t1.contains("root")) {
					l = t1.indexOf(",");
					m = t1.indexOf(")");
					p = Integer.parseInt(t1.substring(l + 1, m));
					System.out.println("p--->" + p);
					net = Math.pow(x, (1.0 / p));
					y = y + net;
				} else if (t1.contains("ln")) {
					net = Math.log(x);
					y = y + net;
				} else if (t1.contains("log")) {
					net = Math.log10(x);
					y = y + net;
				} else if (t1.contains("^")) {
					l = t1.indexOf("^");
					p = Integer.parseInt(t1.substring(l + 1));
					System.out.println("p--->" + p);
					net = Math.pow(x, p);
					y = y + net;
				} else {
					y = x;
				}
			}
			if (i == 0) {
				y_m = y_m + y;
				total = total + y;
			} else if (i == n) {
				y_m = y_m + y;
				total = total + y;
			} else {
				y_m = y_m + y;
				total = total + 2 * y;
			}

			System.out.println("total:" + total);
		}
		if (isTrig) {
			System.out.println("h = " + h);
			h = pi * (h / 180);
			System.out.println("h = " + h);
		}
		integral = integral + h * total / 2;
		System.out.println("result--->" + integral);
		double result = integral;
		return result;
	}

	public double calculateSimpson(FonksiyonModel sm) {

		double a = sm.getAltSinir();
		double b = sm.getUstSinir();
		double n = 10.00;
		double h = (b - a) / n;
		double x = 0;
		double integral = 0;
		double total = 0;
		boolean isTrig = false;
		double y_m = 0;
		double e = Math.E;
		double pi = Math.PI;
		
		for (double i = 0; i <= n; i++) {

			double y = 0;
			int l, m;
			int p = 0;
			double net = 0;

			String[] f = sm.getFonksiyon().split("\\+");
			x = a + i * h;
			for (String t1 : f) {
				System.out.println("function:" + t1);

				if (t1.contains("exp")) {
					net = Math.exp(x);
					y = y + net;
				} else if (t1.contains("asin")) {
					net = Math.asin(x);
					y = y + net;
				} else if (t1.contains("acos")) {
					net = Math.acos(x);
					y = y + net;
				} else if (t1.contains("atan")) {
					net = Math.atan(x);
					y = y + net;
				} else if (t1.contains("sin")) {
					isTrig = true;
					net = Math.sin(pi * (x / 180));
					y = y + net;
				} else if (t1.contains("cos")) {
					isTrig = true;
					net = Math.cos(pi * (x / 180));
					y = y + net;
				} else if (t1.contains("tan")) {
					isTrig = true;
					net = Math.tan(pi * (x / 180));
					y = y + net;
				} else if (t1.contains("sqrt")) {
					net = Math.pow(x, 2);
					y = y + net;
				} else if (t1.contains("root")) {
					l = t1.indexOf(",");
					m = t1.indexOf(")");
					p = Integer.parseInt(t1.substring(l + 1, m));
					System.out.println("p--->" + p);
					net = Math.pow(x, (1.0 / p));
					y = y + net;
				} else if (t1.contains("ln")) {
					net = Math.log(x);
					y = y + net;
				} else if (t1.contains("log")) {
					net = Math.log10(x);
					y = y + net;
				} else if (t1.contains("^")) {
					l = t1.indexOf("^");
					p = Integer.parseInt(t1.substring(l + 1));
					System.out.println("p--->" + p);
					net = Math.pow(x, p);
					y = y + net;
				} else {
					y = x;
				}
			}
			if (i == 0) {
				y_m = y_m + y;
				total = total + y;
			} else if (i == n) {
				y_m = y_m + y;
				total = total + y;
			} else if (i % 2 == 0) {
				y_m = y_m + y;
				total = total + 2 * y;
			} else if (i % 2 == 1) {
				y_m = y_m + y;
				total = total + 4 * y;
			}
		}
		if (isTrig) {
			h = pi * (h / 180);
		}

		integral = integral + ((h * total) / 3);
		System.out.println("result--->" + integral);
		double result = integral;
		return result;
	}

	public double calculateSimpsonAlternative(FonksiyonModel sam) {

		double a = sam.getAltSinir();
		double b = sam.getUstSinir();
		double n = 9.00;
		double h = (b - a) / n;
		double x = 0;
		double integral = 0;
		double total = 0;
		double y_m = 0;
		boolean isTrig = false;
		double pi = Math.PI;
		double e = Math.E;

		for (double i = 0; i <= n; i++) {

			double y = 0;
			int l, m;
			int p = 0;
			double net = 0;

			String[] f = sam.getFonksiyon().split("\\+");
			x = a + i * h;
			for (String t1 : f) {
				System.out.println("function:" + t1);

				if (t1.contains("exp")) {
					net = Math.exp(x);
					y = y + net;
				} else if (t1.contains("asin")) {
					net = Math.asin(x);
					y = y + net;
				} else if (t1.contains("acos")) {
					net = Math.acos(x);
					y = y + net;
				} else if (t1.contains("atan")) {
					net = Math.atan(x);
					y = y + net;
				} else if (t1.contains("sin")) {
					isTrig = true;
					net = Math.sin(pi * (x / 180));
					y = y + net;
				} else if (t1.contains("cos")) {
					isTrig = true;
					net = Math.cos(pi * (x / 180));
					y = y + net;
				} else if (t1.contains("tan")) {
					isTrig = true;
					net = Math.tan(pi * (x / 180));
					y = y + net;
				} else if (t1.contains("sqrt")) {
					net = Math.pow(x, 2);
					y = y + net;
				} else if (t1.contains("root")) {
					l = t1.indexOf(",");
					m = t1.indexOf(")");
					p = Integer.parseInt(t1.substring(l + 1, m));
					System.out.println("p--->" + p);
					net = Math.pow(x, (1.0 / p));
					y = y + net;
				} else if (t1.contains("ln")) {
					net = Math.log(x);
					y = y + net;
				} else if (t1.contains("log")) {
					net = Math.log10(x);
					y = y + net;
				} else if (t1.contains("^")) {
					l = t1.indexOf("^");
					p = Integer.parseInt(t1.substring(l + 1));
					System.out.println("p--->" + p);
					net = Math.pow(x, p);
					y = y + net;
				} else {
					y = x;
				}
			}
			if (i == 0) {
				y_m = y_m + y;
				total = total + y;
			} else if (i == n) {
				y_m = y_m + y;
				total = total + y;
			} else if (i % 3 == 0) {
				y_m = y_m + y;
				total = total + 2 * y;
			} else {
				y_m = y_m + y;
				total = total + 3 * y;
			}
		}
		if (isTrig) {
			h = pi * (h / 180);
		}
		integral = integral + ((3 * h * total )/ 8);
		System.out.println("result--->" + integral);
		double result = integral;
		return result;
	}
}
