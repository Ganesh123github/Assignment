package com.assign5.practice;

import java.util.Scanner;

public class CheckNumber {
	
	public static  void checkNumber(int no)
  {
	//int a=-100;


	if(no>=0)
	{
	System.out.println("Given number is Positive number");
	}
	else  
	{
	System.out.println("given number is Negative number");
	}
 }
	public static void main(String[] args) {
		
		System.out.println("Enter the no for check = ");
	    Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		checkNumber(x);	
		sc.close();
	}
	}
