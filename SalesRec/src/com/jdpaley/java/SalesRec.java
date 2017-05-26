package com.jdpaley.java;

import java.text.NumberFormat;
import java.util.Scanner;

public class SalesRec {

	public static void main(String[] args) {
		// Sales Record
		
		Scanner 			kb = new Scanner(System.in);
		long					custNum;
		String 				custName, taxCode, another;
		double		 	salesAmt, tax=0, totalAmt;
		boolean			invalidTax;
		
		System.out.println("CREATION OF SALES RECORDS");
		System.out.println("Enter requested field values.");

		do {
			another="N";
			System.out.println(" ");
			System.out.print("Customer NUMBER: ") ;
			custNum =  Long.parseLong(kb.nextLine());
			System.out.print("Customer Name: ");
			custName = kb.nextLine();
			System.out.print("Sales Amount:  $ "); 
			salesAmt = Double.parseDouble(kb.nextLine());
			
			do {
				invalidTax = false;
				System.out.print( "Tax Code: "); 
				taxCode = kb.nextLine();
				taxCode = taxCode.toUpperCase();
				
				if (taxCode.equals("NRM")) {
					tax = 6;
				} else if (taxCode.equals("BIZ")) {
					tax = 4.5;
				} else if (taxCode.equals("NPF")) {
					tax = 0;
				} else {
					invalidTax=true;
				}
			} while (invalidTax);
			
			totalAmt = salesAmt * (1 + tax / 100);
			System.out.println("Total Amount Due: " + NumberFormat.getCurrencyInstance().format(totalAmt)+ " (after " + tax + "% tax)");
			System.out.println(" ");
			do {
				System.out.print("Do you want to enter another record? (Y/N) ");
				another = kb.nextLine();
				another = another.toUpperCase();
			} while ( (!another.equals("Y")) && (!another.equals("N")) );	
			
			System.out.println(" ");			
		} while (another.equals("Y"));
		kb.close();
	}
}
