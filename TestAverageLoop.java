// User enters number of tests to average and then proceeds to enter scores per each test.

import java.util.Scanner;

public class TestAverageLoop
{
	public static void main(String[] args)
	{
		int inputCount = 0;
		double cumulativeScore = 0.00;
		int numberOfTests = 0;

		var keyboard = new Scanner(System.in);

		while ( numberOfTests <= 0 ) 
	  	{
			System.out.print("Please enter the number of test scores you'd like to average: ");
			numberOfTests = keyboard.nextInt();
		}	  
        
		while ( inputCount < numberOfTests ) 
		{
			inputCount++;
			System.out.print("Enter test " + inputCount + " score: ");
			cumulativeScore += keyboard.nextDouble(); 
		}
        
		System.out.printf("Your average test score is: %.2f%%", cumulativeScore / inputCount);

		keyboard.close();
    }
}
