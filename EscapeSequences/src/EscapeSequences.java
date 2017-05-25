import java.util.Scanner;

public class EscapeSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println(" ");
			System.out.println("Select from Menu to print:");
			System.out.println(" ");
			System.out.println("1. Box");
			System.out.println("2. Oval");
			System.out.println("3. Diamond");
			System.out.println(" ");
			System.out.print("Option? ");
			choice = kb.nextInt();
			System.out.println(" ");
		} while ( (choice < 1) || (choice > 3) );
		
		if (choice == 1) {

			System.out.println("Box:");
			System.out.println(" ");
			System.out.println("*********");
			System.out.println("*\t*");
			System.out.println("*\t*");
			System.out.println("*\t*");
			System.out.println("*\t*");
			System.out.println("*********");

		} else if (choice == 2) {

			System.out.println("Oval:");
			System.out.println(" ");
			System.out.println("   ***   ");
			System.out.println("  *   *  ");
			System.out.println(" *     * ");
			System.out.println(" *     * ");
			System.out.println("  *   *  ");
			System.out.println("   ***   ");

		} else {
			System.out.println("Diamond:");
			System.out.println(" ");
			
			System.out.println("    *    ");
			System.out.println("  *   *  ");
			System.out.println("*\t*");
			System.out.println("  *   *  ");
			System.out.println("    *    ");
			
		}
						
	}

}
