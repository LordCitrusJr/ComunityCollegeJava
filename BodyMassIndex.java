// This program will calculate a users BMI
import java.util.Scanner;

public class BodyMassIndex
{
	public static void main(String[] args)
	{
		// Declare variables
		String bmiClass;
		var keyboard = new Scanner(System.in);

		// Welcome message and ask for input. Declare/assign variables to calculate bmi
		System.out.println("This program will determine your " + 
					"Body Mass Index (BMI) and Classification.");
		
		System.out.print("Please enter your weight in pounds: ");
		double weight = keyboard.nextDouble();
		
		System.out.print("Please enter your height in inches: ");
		double height = keyboard.nextDouble();

		double bmi = weight * (703 / Math.pow(height, 2.0));
		
		// If clause to determine class
		if ( bmi < 18.5 )
			bmiClass = "Underweight";
		else if ( bmi >= 18.5 && bmi < 25 )
			bmiClass = "Optimal";
		else if ( bmi >=25 && bmi < 30 )
			bmiClass = "Overweight";
		else
			bmiClass = "Obese";
		
		// Output result
		System.out.printf("BMI: %.1f \nClassification: \"%s\"", bmi, bmiClass);

		keyboard.close();
	}
}