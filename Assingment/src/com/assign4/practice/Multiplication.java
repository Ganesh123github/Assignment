package com.assign4.practice;

public class Multiplication {
	
	public int mult(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println(c);
		
		return c;
	}
	
 public static void main(String[] args) {
	 
	 Multiplication m= new Multiplication();
	 m.mult(10, 20);
}
}
