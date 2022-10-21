// Predict the sales the east coast division will generate this year. 
// They generate 62% of the company sales per year on average.

import java.util.Scanner;

public class SalesPrediction
{
	public static void main(String[] args)
	{
		final double ECSALESAVG = 0.62;
		double projectedSales;
		var keyboard = new Scanner(System.in);

		System.out.print("Input the company's projected sales this year: ");
		projectedSales = keyboard.nextDouble();

		System.out.print("The East Coast Division will generate about $" +
		                 projectedSales * ECSALESAVG + " this year.");

		keyboard.close();		
	}
}