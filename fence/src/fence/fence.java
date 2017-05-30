package fence;

import java.util.Scanner;

public class fence {

	public static void main(String[] args) {
// cost=(1+tax/100)*(2*(length+width)*($25/ft wood | $15/ft chainlink)+numGates(1 to 3 )*$150) + $50 permit
		
		double	cost, length, width, ftWood, ftWire, permit, tax, ftCost;
		String		material;
		int				numGates;
		Scanner	kb = new Scanner(System.in);
		
		ftWood 	= 25;
		ftWire 		= 15;
		
		System.out.println("HOME FENCE ASSISTANT");
		System.out.println(" ");
		System.out.println("Hello! This program will assist you in determining what you need ");
		System.out.println("to build a rectangular fence, and calculate the total cost, ");
		System.out.println("including materials, tax, and permit. ");
		System.out.println(" ");
		System.out.print("Enter yard LENGTH in ft: ");
		length =  kb.nextDouble();
		System.out.print("Enter yard WIDTH in ft: ");
		width =  kb.nextDouble();
		System.out.print("Enter desired number of GATES (1 to 3): ");
		numGates =  kb.nextInt();
		do {
			System.out.print("Enter choice of material for fence (Wood or Wire): ");
			material=  kb.next();
			material = material.toUpperCase();
			} while ( (!material.equals("WOOD")) && (!material.equals("WIRE")) );
		
		if (material.equals("WOOD")){ftCost = ftWood;}
		else {ftCost = ftWire;}
		
		cost = 

	}

}
