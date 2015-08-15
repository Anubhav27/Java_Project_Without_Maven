package com.shypz.hello;

import java.io.IOException;

/*
 * 
 * Understanding java control statements switch
 */

public class ControlStatements {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter 1 : ");
		System.out.println("Enter 2 : ");
		
		
		
		System.out.println("Enter the choice");
		
		char ch = (char)System.in.read();
		System.out.println(ch);
		
		switch(ch){
		
		case '1' : 
			     System.out.println("hello");
			     
		case '2' :
				System.out.println("world");
				
		}
		
		
	}

}
