package com.shypz.DataStructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

/*
 * 
 * 
 * 
 * go into the directory show file based on contents searched
 */

public class Dropbox_Progamming {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		final String folder = "C:\\Shypz\\Java_Project_Without_Maven";
		
		
		File fo = new File(folder);
		
		File files[] = fo.listFiles();
		for(int i=0;i<files.length;i++){
			
			//System.out.println(files[i]);
	
			if(files[i].isDirectory()){
				continue;
			}
			else{
				//System.out.println(files[i]);
				
				FileReader fr = new FileReader(files[i]);
				
				BufferedReader br = new BufferedReader(fr);
				
				String s;
				
				while((s = br.readLine()) != null){
					
					if(s.contains("not")){
						System.out.println(files[i]);
					}
					
				}
				
				
			}
		
		}
		
		
		
		
		
		

	}

}
