/************************************************************/
/*Program:  MilesPerGallon*/
/*CIS163AA*/
/*David Wylie*/
/*10-20-2022*/
/*Purpose of program: 
To calculate a user's Miles Per Gallon based on inputs*/
/************************************************************/
import java.util.Scanner; // Import scanner to listen for inputs

public class MilesPerGallon
{
	public static void main(String[] args)
	{
		// Declare variables
		double milesDriven;
		double gasUsed;
		double milesPerGallon;

		// Create keyboard variable
		var keyboard = new Scanner(System.in);
		
		// Take in user input and assign to variables
		System.out.print("Enter number of miles driven: ");
		milesDriven = keyboard.nextDouble();

		System.out.print("Enter gallons of gas used: ");
		gasUsed = keyboard.nextDouble();

		// Calculate and display Miles Per Gallon
		milesPerGallon = milesDriven / gasUsed;
		System.out.println("Your Miles Per Gallon is: " + 
		                   milesPerGallon);
		
		// Turn of keyboard
		keyboard.close();
	}
}