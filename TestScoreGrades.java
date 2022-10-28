/***************************************************/
/*Program: Test Score and Grade                    */
/*CIS163AA                                         */
/*David Wylie                                      */
/*10-27-2022                                       */
/*Purpose of program: Average scores and give grade*/
/***************************************************/
// User enters number of tests to average and then proceeds to enter scores per each test.

import java.util.Scanner; // Import user input

public class TestScoreGrades
{
	public static void main(String[] args)
	{
		int inputCount = 0; // Set counter for the average and loops.
		double cumulativeScore = 0.00; // Adds up the score on each loop.
		int numberOfTests = 3; // Sets count for the loop.
		double testAvg; // Test average to determine letter grade.
		char letterGrade = '0'; // Letter grade for the final conditional check

		var keyboard = new Scanner(System.in); // Create keyboard input

		System.out.println("This program will average " + numberOfTests + " test scores for you."); //Intro message
       
		while ( inputCount < numberOfTests ) // Loop to take user input.
		{
			inputCount++;
			System.out.print("Enter test " + inputCount + " score: ");
			cumulativeScore += keyboard.nextDouble(); 
		}
        	testAvg = cumulativeScore / numberOfTests; //Assign value to testAvg

		if (testAvg < 60) // Else If to determine letter grade.
			letterGrade = 'F';
		else if (testAvg < 70)
			letterGrade = 'D';
		else if (testAvg < 80)
			letterGrade = 'C';
		else if (testAvg < 90)
			letterGrade = 'B';
		else if (testAvg <= 100)
			letterGrade = 'A';
		else
		{
			letterGrade = 'S'; // Trailing else in case user averages > 100% Gives S grade and exits.
			System.out.println("Your grade is over 100%! Superior!");
			System.exit(0);
		}			
		
		System.out.printf("Your average test score is: %.2f%%\nYour grade is: %C", testAvg, letterGrade); // Final result and output

		keyboard.close(); // Closing the keyboard
    }
}