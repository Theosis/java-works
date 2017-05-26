import java.util.Scanner;

public class Mow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		double length, width, surface, minutes;
		int hours, minutesRemainder;
		
		
		System.out.println(" ");
		System.out.print("Enter Lawn LENGTH in yards: ");
		length = kb.nextDouble();
		System.out.println(" ");
		System.out.print("Enter Lawn WIDTH in yards: ");
		width = kb.nextDouble();
		System.out.println(" ");
		
		surface = length * width;
		minutes = surface / 20;
		
		hours	= (int)(minutes / 60);
		minutesRemainder = (int)((int)minutes % 60);
			
		System.out.println(" ");
		System.out.println("Mowing "+length+" yrds by "+width+" yrds ("+surface+" sq yrds) takes "+hours+" hr(s) and "+minutesRemainder+" minutes.");
		System.out.println(" ");
		System.out.println(" ");
		kb.close();
	}

}
