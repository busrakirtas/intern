package com.project.app.model;

public class FonksiyonModel {
	
	private String fonksiyon;
	private double altSinir;
	private double ustSinir;
	private double bolen;
	private double result;
	
	public String getFonksiyon() {
		return fonksiyon;
	}
	public void setFonksiyon(String fonksiyon) {
		this.fonksiyon = fonksiyon;
	}
	public double getAltSinir() {
		return altSinir;
	}
	public void setAltSinir(double altSinir) {
		this.altSinir = altSinir;
	}
	public double getUstSinir() {
		return ustSinir;
	}
	public void setUstSinir(double ustSinir) {
		this.ustSinir = ustSinir;
	}
	public double getBolen() {
		return bolen;
	}
	public void setBolen(double bolen) {
		this.bolen = bolen;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "FonksiyonModel [fonksiyon=" + fonksiyon + ", altSinir=" + altSinir + ", ustSinir=" + ustSinir
				+ ", bolen=" + bolen + ", result=" + result + "]";
	}
	
}
