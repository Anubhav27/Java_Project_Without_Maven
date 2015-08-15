package com.shypz.DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * 
 * Understanding System class of java
 * 
 * use System class to get current time in milliseconds and to get environment variables
 * 
 * 
 */

public class SystemClass_Java_Demo {
	
	public static void main(String[] args){
		
		System.out.println("Starting the demo of System class of java");
		
		
		try {
			while(true){
				
				System.out.println("Enter your choice : ");
				
				System.out.println("1" + " " + "for Printing system time");
				System.out.println("2" + " " + "for Printing system console");
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				int choice = Integer.parseInt(br.readLine());
				
				
				switch(choice){
				case 1 : 
					      System.out.println(System.currentTimeMillis());
					      break;
				case 2 :
						  //HashMap<String,String> hm = new HashMap<String,String>();
						  
						  Map<String,String> map = System.getenv();
						  
						  for(Map.Entry m : map.entrySet()){
							  System.out.println(m.getKey() + " " + m.getValue());
						  }
						  //System.out.println(System.getenv());
						  break;
				}
			
				System.out.println("Do you wish to Continue");
				BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			
				if(br1.readLine().equalsIgnoreCase("y")){
					continue;
				}
				else{
					break;
				}
			}
			
			
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
