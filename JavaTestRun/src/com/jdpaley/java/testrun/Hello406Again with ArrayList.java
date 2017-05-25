/*
package com.jdpaley.java.testrun;

import java.util.Scanner;
import java.util.ArrayList;

public class Hello406Again 
{
	public static void main(String[] args) 
	{		
		int indexMo;
		String mo;
		
		ArrayList<String> months = new ArrayList<String>(Arrays.asList("JAN","FEB","MAR","APR","JUN","JUL","AGO","SEP","OCT","NOV","DEC"));
		
		System.out.println("Enter a month (3-letters): ");
		Scanner sc = new Scanner(System.in);
		
		do
		{
			mo = sc.nextLine();
			mo = mo.toUpperCase();
			indexMo = months.indexOf(mo);
			
		} while (indexMo < 0);
		
		System.out.println(" ");		
		System.out.println("Month: " + mo + " is number " + indexMo);
		System.out.println(" ");
	}

}

*/