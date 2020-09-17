package com.Exception;

public class Exception {

	
	
	public static void a1(){
		System.out.println("method a1");
	}

	
	public static void main(String[] args) {
		Exception e=new Exception();
		e.a1();
		int a=10;
		int b=20;
		if(a==b){
			System.out.println("a is Equal to B");
		}
		
		
	}
}
