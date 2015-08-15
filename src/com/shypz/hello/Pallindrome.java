package com.shypz.hello;

public class Pallindrome {
	
	public static void checkForPallindrome(String str){
		
		int count = 0;
		int length = str.length();
		
		char a[] = str.toCharArray();
		
		for(int i=0;i<length/2;i++){
			
			   if(a[i] == a[(length/2) + i]){
				   count++;
			   }
		}
		
		System.out.println(count);
		
		
	}
	
	public static void main(String[] args){
			checkForPallindrome("jenajena");
	}

}
