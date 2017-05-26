package com.jdpaley.java.testrun;

import java.util.Scanner;

public class DaysInMonth3Letter 
{
	public static void main(String[] args) 
	{		
		int days = 0;
		String mon = "";
		boolean invalidMonth;
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			invalidMonth = false;
			System.out.println(" ");
			System.out.print("Enter the FIRST 3 LETTERS of a month (JAN-DEC): ");		
			mon = sc.nextLine();
			mon = mon.toUpperCase();
			
			if (mon == "JAN") {
	            days = 31;
	        } else if (mon == "FEB") {
	        	days = 28;
	        } else if (mon == "MAR") {
	        	days = 31;
	        } else if (mon == "APR") {
	        	days = 30;
	        } else if (mon == "MAY") {
	        	days = 31;
	        } else if (mon == "JUN") {
	        	days = 30;
	        } else if (mon == "JUL") {
	        	days = 31;
	        } else if (mon == "AGO") {
	        	days = 31;
	        } else if (mon == "SEP") {
	        	days = 30;
	        } else if (mon == "OCT") {
	        	days = 31;
	        } else if (mon == "NOV") {
	        	days = 30;
	        } else if (mon == "DEC") {
	        	days = 31;
	        } else { 
	        	invalidMonth = true; 
	        }
						
		} while (invalidMonth);
	
		System.out.println(" ");		
		System.out.println("Month " + mon + " has " + days + " days.");
		System.out.println(" ");
		
		sc.close();
	}

}
