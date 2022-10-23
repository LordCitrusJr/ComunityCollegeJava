// A program to calculate the percent of gender in a group

import java.util.Scanner;

public class GenderCalc
{
	public static void main(String[] args)
	{
		int mAmount;
		int fAmount;
		int nAmount;
		double total;
				
		var keyboard = new Scanner(System.in);

		System.out.print("Enter the amount of Males in the group: ");
		mAmount = keyboard.nextInt();
		
		System.out.print("Enter the amount of Females in the group: ");
		fAmount = keyboard.nextInt();
		
		System.out.print("Enter the amount of Non-Binaries in the group: ");
		nAmount = keyboard.nextInt();

		total = mAmount + fAmount + nAmount;

		System.out.printf("Out of a group of %.0f", total);
		System.out.println(" people...");
		
		// I could probably make this a function once I learn how to
		System.out.print(mAmount + " people, or ");
		System.out.printf("%.1f%%", (mAmount / total) * 100);
		System.out.println(", identify as male.");
		
		System.out.print(fAmount + " people, or ");
		System.out.printf("%.1f%%", (fAmount / total) * 100);
		System.out.println(", identify as female.");

		System.out.print(nAmount + " people, or ");
		System.out.printf("%.1f%%", (nAmount / total) * 100);
		System.out.println(", identify as non-binary.");
		
		keyboard.close();
	}
}