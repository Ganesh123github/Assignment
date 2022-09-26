package com.assign4.practice;

public class Division {

	public int division(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println(c);
		
		return c;
	}
	
	public static void main(String[] args) {
		Division d= new Division();
		d.division(200, 10);
	}

}
