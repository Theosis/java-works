import java.time.*;
import java.util.Scanner;

public class Age {

	public static void main(String[ ] args) {
		System.out.println("AGE CALCULATOR");
		System.out.println(" ");
		Scanner kb = new Scanner(System.in);
		
		String another = "";
		LocalDate currDate = LocalDate.now();
		int currYear					= currDate.getYear();
		int currMonth 			= currDate.getMonth().getValue();
		int currDay 					= currDate.getDayOfMonth();
		int birthYear, birthMonth, birthDay;
		//System.out.println("curr date: "+currYear+" "+currMonth+" "+currDay);
		//System.out.println(" ");
	do {		
		do {
				System.out.print("Enter birth YEAR (4 digits): ");
				birthYear = kb.nextInt();
				} while ((birthYear < 1897) || (birthYear > currYear));  //There has to be a reasonable limit to valid age range. Here set at 120.
		
		System.out.println(" ");
		do {
				System.out.print("Enter birth MONTH (2 digits): ");
				birthMonth = kb.nextInt();
				if ((birthYear == currYear) && (birthMonth > currMonth)) {birthMonth = 0;}  //If unborn, force re-entry of valid month.
		} while ((birthMonth < 1) || (birthMonth > 12));
		
		YearMonth birthYearMonth = YearMonth.of(birthYear, birthMonth);
		int daysInBirthMonth = birthYearMonth.lengthOfMonth();
		
		System.out.println(" ");
		do {
				System.out.print("Enter birth DAY (2 digits): ");
				birthDay = kb.nextInt();
				if ((birthYear == currYear) && (birthMonth == currMonth) && (birthDay > currDay)) {birthDay = 0;}  //If unborn, force re-entry of valid day.
		} while ((birthDay < 1) || (birthDay > daysInBirthMonth));

		System.out.println(" ");
		//System.out.println("birth date: "+birthYear+" "+birthMonth+" "+birthDay);
		//System.out.println(" ");
		
		int age = currYear - birthYear;
		if ( (currMonth < birthMonth) || ((currMonth == birthMonth) && (currDay < birthDay)) ) {
			age-- ;
		}
		
		if (age == 0) {System.out.println("Age = Less than a  year.");}
		else if (age ==1) {System.out.println("Age = " + age + " year.");}
		else	{System.out.println("Age = " + age + " years.");}
			
		System.out.println(" ");
		
		do {
			System.out.print("Would you like to enter details for another client?  (Y/N) ");

			another = kb.next();
			another = another.toUpperCase();

		} 	while ( (!another.equals("Y")) && (!another.equals("N")) );
		
		System.out.println(" ");			
	} while (another.equals("Y"));
	
	System.out.println("Thanks for using the age calculator!");

	kb.close();
	}
}
