//*************************/
//*Program:  RectangleArea*/
//*CIS163AA               */
//*David Wylie            */
//*11-04-2022             */
//*Purpose of program: To calculate the area of a */
// rectangle only using methods and user's input  */

import java.util.Scanner; // Import scanner to get user input.

public class RectangleArea
{
   /**
    * Displays a welcome message and then
    * executes the following methods to get user inputs
    * to calculate and display area of a rectangle.
    * @param args  Stores java command line arguments.
    */
   public static void main(String[] args)
   {
      System.out.println("This program will calculate the " +
              "area of a rectangle for you."); // Welcome message
      double length = getLength();
      double width = getWidth();
      double area = getArea(length, width);
      displayData(length, width, area);
   }
   /**
    * This method captures the user's input to
    * return length of the rectangle
    * @return This will be the length of the rectangle
    */
   public static double getLength()
   {
      System.out.print("Please enter the length of your rectangle: ");
      var lengthInput = new Scanner(System.in);
      return lengthInput.nextDouble();
   }
   /**
    * This method captures the user's input to
    * return width of the rectangle
    * @return This will be the width of the rectangle
    */
   public static double getWidth()
   {
      System.out.print("Please enter the width of your rectangle: ");
      var widthInput = new Scanner(System.in);
      return widthInput.nextDouble();
   }
   /**
    * This method calculates the user's input and
    * returns the area.
    * @param length Is the user's length input
    * @param width Is the user's width input
    * @return This returns the area of the user's input
    */
   public static double getArea(double length, double width)
   {
      return length * width;
   }
   /**
    * This method summarizes and displays the user's
    * inputs/calculations
    * @param length Is the user's length input
    * @param width Is the user's width input
    * @param area Is the getArea method result
    */
   public static void displayData(double length, double width, double area)
   {
      System.out.printf("""
                           \nHere are your results:
                           The length of your rectangle is: %,.2f
                           The width of your rectangle is: %,.2f
                           The area of your rectangle is: %,.2f
                           """
                        ,length, width, area);
   }
}

