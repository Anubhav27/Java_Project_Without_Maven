package com.shypz.hello;

public class BasicThread {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "anubhav";
		
		System.out.println(calculateLength(str));
		
		E e = (E)new D();
		e.print();
		
	}
	
	public static void javaHungry(Object o){
		System.out.println("Object");
	}
	
	/*public static void javaHungry(String s){
		System.out.println("string");
	}*/
	
	public static int calculateLength(String str){
		
		char a[] = str.toCharArray();
		
		int length = 0;
		for(int i=0;i<a.length;i++){
			if(a[i] != '\0'){
				length++;
			}
		}
		
		
		return length;
	}

}

class T1{
	
	public int f1;
	public int f2;
	public int f3;
	
	
	public T1(int f4,int f5,int f6){
		
		f1 = f4;
		f2 = f5;
		f3 = f6;
		
	}
	
	public void setF1(int newValue){
		f1 = newValue;
	}
	
	public void setF2(int newValue){
		f2 = newValue;
	}
	
	
}


class D{
	void print(){}
}

class E extends D{
	
	void print(){}
}





