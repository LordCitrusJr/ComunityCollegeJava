/******************************************************************/
/*Program: DistanceTraveled                                       */
/*CIS163AA                                                        */
/*David Wylie                                                     */
/*10-30-22                                                        */
/*Program calculates distance traveled over the course of 3 hours */
/******************************************************************/

import java.util.Scanner;

public class DistanceTraveled
{
    public static void  main(String[] args)
    {
        // Declare Variables
        int hourCounter = 0;
        var keyboard = new Scanner(System.in);

        // Take User Input, declare and assign MPH variable
        System.out.print("This program calculates distance traveled over the course of 3 hours" +
                "\nPlease enter your speed in Miles per Hour (MPH): ");
        int milesPerHour = keyboard.nextInt();

        // Input Validation for an integer that is one or greater
        while ( milesPerHour < 1 )
        {
            System.out.print("Please enter a whole number of 1 or greater to continue: ");
            milesPerHour = keyboard.nextInt();
        }

        // Display output message
        System.out.println("""
                
                Hour        Distance Traveled
                -----------------------------""");

        // Loop to calculate and output distance traveled each hour
        while ( hourCounter < 3 )
        {
            hourCounter++;
            int distanceTraveled = hourCounter * milesPerHour; // Declare-assign distance traveled
            System.out.printf("%d %,20d\n", hourCounter, distanceTraveled);
        }
        keyboard.close();
    }
}
