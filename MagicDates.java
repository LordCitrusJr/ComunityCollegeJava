// Takes user input to determine if  the date they entered is magic.
// A magic date is when the day * month = year.

import java.util.Scanner;

public class MagicDates
{
	public static void main(String[] args)
	{
	int month;
	int day;
	int year;

	var keyboard = new Scanner(System.in);

	System.out.println("Let's see if the date you enter is MAGIC!");
	
	System.out.print("Enter the the month number: ");
		month = keyboard.nextInt();
	
	System.out.print("Enter the the day number: ");
		day = keyboard.nextInt();

	System.out.print("Enter the the two-digit year number: ");
		year = keyboard.nextInt();

	System.out.printf("The date %d/%d/%d is " +
				(day * month == year ? "MAGIC!" : "not magic."), month, day, year);
	}
}