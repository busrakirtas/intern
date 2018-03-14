package com.project.app.test;

public class Bisection01{
	
//	public double floorDouble(double sayi, int scale) {
//	System.out.println("floorDouble1--->"+sayi);
//	BigDecimal result2 = (new BigDecimal(sayi)).setScale(scale, BigDecimal.ROUND_HALF_DOWN);
//	System.out.println("floorDouble--->"+result2);
//	
//	return result2.doubleValue();
//}
	
		public static void main(String[] args)
		{
		   final double epsilon = 0.00001;
		   double a, b, m, y_m, y_a;
		
		   a = 0;  b = 4;
		   System.out.println("Initial interval: [" + a + " .. " + b + "]");
		
		   while ( (b-a) > epsilon )
		   {
		      m = (a+b)/2;          
		
		      y_m = Math.exp(m)+Math.sin(m*Math.PI/180);       
		      y_a = Math.exp(a)+Math.sin(a*Math.PI/180);       
		      if(y_m == 0) {
		    	  break;
		      }
		      if ( y_m*y_a<0 )
		      {  
		         b = m;
		      }
		      else
		      {  
		         a = m;
		      }
		   
		      System.out.println("New interval: [" + a + " .. " + b + "]");
		   }
		
		   System.out.println("Approximate solution = " + (a+b)/2 );
		}
		}