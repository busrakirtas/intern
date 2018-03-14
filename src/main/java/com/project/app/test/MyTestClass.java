package com.project.app.test;

import java.util.HashMap;

public class MyTestClass {
	
	
//	private static void selectDb() {
//		try {
//			//Class.forName("");
//			String url = "jdbc:mysql://localhost:3306/springbootdb";
//			Connection conn = (Connection) DriverManager.getConnection(url,"root","");
//			Statement stmt = conn.createStatement();
//	        ResultSet rs;
//		
//	        rs = stmt.executeQuery("SELECT * FROM TEXT WHERE id=1");
//	        while ( rs.next()) {
//	        	String text = rs.getString("text_value");
//                System.out.println(text);
//	        }
//	        
//            conn.close();
//	        System.out.println("Basarili");
//	        
//	        
//		} catch (Exception e) {
//			System.out.println("hata aldi");
//			e.printStackTrace();
//		}
//	}

	public static void main(String[] args) {
		//selectDb();
		
		System.out.println("Simple Java Word Count Program");
		String rs="bfjvsj ksknsdv skdkns";
		int wordCount=1;
		for (int i = 0; i < rs.length(); i++) {
			if (rs.charAt(i)==' ') 
			{
				wordCount++;
			}
		}
		System.out.println("word count = " + wordCount);
		
		
		System.out.println("Simple Java Word Count Program");
		String rs2="efse sfkekgs fkeskskef foeskfe kf ekfoskf sefkef";
		
		HashMap<Integer, Double> wcUserAverageList = new HashMap<Integer, Double>();
		wcUserAverageList.put(1, 25.3);
		wcUserAverageList.put(2, 88.0);
		
		int wordCount2=1;
		for (int i = 0; i < rs2.length(); i++) {
			if (rs2.charAt(i)==' ') 
			{
				wordCount2++;
			}
		}
		System.out.println("word count = " + wordCount2);
		
		if(wordCount<wordCount2) {
			System.out.println("rs2 daha uzun");
		}
		else {
			System.out.println("rs daha uzun");
		}
		
		System.err.println("*****************************************************");
		
		
		
		
//		System.out.println("Simple Java Word Count Program");
//
//        String str1 = "Today is Holdiay Day";
//
//        int wordCount = 1;
//
//        for (int i = 0; i < str1.length(); i++) 
//        {
//            if (str1.charAt(i) == ' ') 
//            {
//                wordCount++;
//            } 
//        }
//
//        System.out.println("Word count is = " + wordCount);
		
	}
	
	
	
	
	
	
//	
//	public Boolean compareLogic(String str1, String str2) {
//		
//		/*
//		 * TODO: Buraya karþýlaþtýrma algoritmasý gelecek
//		 */
//		
//		
//		
//		int wordCount=1;
//		for (int i = 0; i < str1.length(); i++) 
//		        {
//		            if (str1.charAt(i) == ' ') 
//		            {
//		                wordCount++;
//		            } 
//		        }
//
//		if(str1.equals(str2)) {
//			return true;
//		} 
//		else{
//			return false;
//		}
//		
//	}

	
	
	
	
	
//	public static void getTextFromDatabaseAndCompare(String sorguText) {
//		MyTestClass mtc = new MyTestClass();
//		
//
//		/*
//		 * TODO: database deki bütün stringler ile karþýlaþtýr
//		 */
//		String dbText = mtc.getTextFromDB();
//		
//		
//		
//		System.out.println("ikisi benzer mi ?:"+mtc.compareLogic(sorguText, dbText).toString());
//		
//	}
//	
//	public String getTextFromDB() {
//		/*
//		 * TODO: Database den stringleri çek
//		 */
//		return "";
//	}
//	
//	public Boolean compareLogic(String str1, String str2) {
//		/*
//		 * TODO: Buraya karþýlaþtýrma algoritmasý gelecek
//		 */
//		
//		if(str1.equals(str2)) {
//			return true;
//		} else {
//			return false;
//		}
//		
//	}
	
}