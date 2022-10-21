// A program to converts square feet to acres

import java.util.Scanner;

public class LandCalculation
{
	public static void main(String[] args)
	{
		final int ACRE = 43560; // Using a constant
		double squareFeet;
		var keyboard = new Scanner(System.in);

		System.out.print("Please enter number of square feet to calcuate acreage: ");
		squareFeet = keyboard.nextDouble();
		
		System.out.print("Your acreage is: " + squareFeet / ACRE);

		keyboard.close();

	}
}

