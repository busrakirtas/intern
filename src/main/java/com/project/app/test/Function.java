package com.project.app.test;

public class Function {
	
	public static void main(String[] args) {
	
	double e = Math.E;
	double pi = Math.PI;
	double y = 0;
	double x = pi/4;
	double a = 0;
	double net = 0;
	
	String function ="exp(x)";
	
	String[] f = function.split("\\+");
	for(String t : f) {
	System.out.println("function:" + t);
	
	if(t.contains("exp")) {
		net = Math.exp(x);
	//	net = Math.pow(e,x);
		y = y + net;
	}
	if(t.contains("sin")) {
		net = Math.sin(x*pi/180);
		y = y + net;
	}
	if(t.contains("cos")) {
		net = Math.cos(x*pi/180);
		y = y + net;
	}
	if(t.contains("tan")) {
		net = Math.tan(x*pi/180);
		y = y + net;
	}
	if(t.contains("asin")) {
		net = Math.asin(x*pi/180);
		y = y + net;
	}
	if(t.contains("acos")) {
		net = Math.acos(x*pi/180);
		y = y + net;
	}
	if(t.contains("atan")) {
		net = Math.atan(x*pi/180);
		y = y + net;
	}
	if(t.contains("sqrt")) {
		net = Math.sqrt(x);
		y = y + net;
	}
	if(t.contains("root")) {
		net = Math.pow(x,a);
		y = y + net;
	}
	if(t.contains("ln")) {
		net = Math.log(x);
		y = y + net;
	}
	if(t.contains("log")) {
		net = Math.log10(x);
		y = y + net;
	}
	if(t.contains("\\^")) {
		net = Math.pow(x,a);
		y = y + net;
	}
	}
	System.out.println("y="+y);
	
	}
	}
