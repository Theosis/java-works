/*
package com.jdpaley.java.testrun;

import java.util.Scanner;

public class Hello406Again 
{
	public static void main(String[] args) 
	{		
		int mo;
		int days;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println(" ");
			System.out.print("Enter the NUMBER of a month (1-12): ");		
			mo = sc.nextInt();
			
		} while ( (mo < 1) || (mo>12) );
		
		if (mo == 1) {
            days = 31;
        } else if (mo == 2) {
        	days = 28;
        } else if (mo == 3) {
        	days = 31;
        } else if (mo == 4) {
        	days = 30;
        } else if (mo == 5) {
        	days = 31;
        } else if (mo == 6) {
        	days = 30;
        } else if (mo == 7) {
        	days = 31;
        } else if (mo == 8) {
        	days = 31;
        } else if (mo == 9) {
        	days = 30;
        } else if (mo == 10) {
        	days = 31;
        } else if (mo == 11) {
        	days = 30;
        } else {
        	days = 31;
        }
		
		System.out.println(" ");		
		System.out.println("Month " + mo + " has " + days + " days.");
		System.out.println(" ");
		
		sc.close();
	}

}

*/