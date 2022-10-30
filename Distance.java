/***************************************************************************/
/*Program: DistanceTraveledFile                                            */
/*CIS163AA                                                                 */
/*David Wylie                                                              */
/*10-30-22                                                                 */
/*Program creates a report on distance traveled over the course of 3 hours.*/
/***************************************************************************/

import java.io.*;
import java.util.Scanner;

public class Distance
{
    public static void  main(String[] args) throws IOException
    {
        // Declare Variables (Creates text file for output)
        int hourCounter = 0;
        PrintWriter outputFile = new PrintWriter("DistanceTraveled.txt");
        var keyboard = new Scanner(System.in);

        // Take User Input, declare and assign MPH variable
        System.out.print("This program creates a report on distance traveled over the course of 3 hours." +
                "\nPlease enter your speed in Miles per Hour (MPH): ");
        int milesPerHour = keyboard.nextInt();

        // Input Validation for an integer that is one or greater
        while ( milesPerHour < 1 )
        {
            System.out.print("Please enter a whole number of 1 or greater to continue: ");
            milesPerHour = keyboard.nextInt();
        }

        // Outputs to created file
        outputFile.println("""
                Hour        Distance Traveled
                -----------------------------""");

        // Loop to calculate and output distance traveled each hour
        while ( hourCounter < 3 )
        {
            hourCounter++;
            int distanceTraveled = hourCounter * milesPerHour; // Declare-assign distance traveled
            outputFile.printf("%d %,20d\n", hourCounter, distanceTraveled);
        }

        // Display output message. Close up shop
        System.out.println("Your report named \"DistanceTraveled.txt\" is now available to view.");
        outputFile.close();
        keyboard.close();
    }
}
