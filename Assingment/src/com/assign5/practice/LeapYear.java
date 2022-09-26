package com.assign5.practice;

import java.util.Scanner;

public class LeapYear {
	
	public static void checkLeapYear(int yr)
	{
	//int yr =2009;
		
	if((yr%4==0)  || ( yr%100==0) || (yr%400==0))
	{
	System.out.println("given yr is leap yr \n");	
		
	}
	else {
		System.out.println("given yr is not leap yr \n");
	}	
		
	}

	 public static void main(String[] args) {
		
		 
		 for(int i =1; i<=3; i++)
		 {
		 System.out.println("Enter yr for checking weather it is leap OR not : ");
		 
		 Scanner sc = new Scanner(System.in);
		 int x = sc.nextInt();
		 checkLeapYear(x);
		 
		 //sc.close();
		 System.out.println("================================\n");
		 }
	 
	}
}
