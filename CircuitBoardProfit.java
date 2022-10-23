// A program that caluclates profit on a user input
// Proift margin is 40% (0.4)

import java.util.Scanner;

public class CircuitBoardProfit
{
	public static void main(String[] args)
	{
		final double PROFITMARGIN = 0.40;
		double retailPrice;

		var keyboard = new Scanner(System.in);

		System.out.print("Please enter the retail price of the circuit board " +
		                 "\nto calculate profit margin: ");
		retailPrice = keyboard.nextDouble();

		System.out.printf("Your profit margin is: $%.2f", retailPrice * PROFITMARGIN);

		keyboard.close();
	}
}