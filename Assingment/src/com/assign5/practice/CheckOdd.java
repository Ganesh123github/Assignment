package com.assign5.practice;

public class CheckOdd {
	
	void check()
	{
		int a=103;
		if(a%2==0)
		{
			
			System.out.println("Given no is even");
		}
		else 
		{
			System.out.println("Given no is odd");
		}
	}
	public static void main(String[] args) 
	{
		CheckOdd c= new CheckOdd();
		c.check();
	}

}
