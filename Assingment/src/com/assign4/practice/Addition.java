package com.assign4.practice;

public class Addition {
        
	public int add(int a, int b)
	{
		int c;
		c=a+b;
		
		return c;
	}
	public static void main(String[] args) {
		
	Addition ad = new Addition();
	int i = ad.add(10, 20);
	
    System.out.println("Addition of two number is = " +i);
		
	
	}
	
}
