import java.util.Scanner;

public class Age {
	public static void main(String[ ] args) {
		System.out.println("AGE CALCULATOR");
		System.out.println(" ");
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter birth YEAR (4 digits): ");
		int birthYear = kb.nextInt();
		System.out.print("Enter birth MONTH (2 digits): ");
		int birthMonth = kb.nextInt();
		System.out.print("Enter birth DAY (2 digits): ");
		int birthDay = kb.nextInt();
	}
}
