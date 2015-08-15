package com.shypz.hello;

public class EMCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "979325635";
		
		String b = "56784243242424";
		
		int cresult = compare(a,b);
		System.out.println(cresult);
		
		if(cresult > 0){
			System.out.println(a + " is larger than " + b);
		}
		else if(cresult < 0){
			System.out.println(a + " is smaller than " + b);
		}
		else if(cresult == 0){
			System.out.println(a + " and  " + b + "are equal");
		}
	}
	
	public static int compare(String a,String b){
		
		return a.compareTo(b);
	}

}