import java.util.Scanner; // Needed for the Scanner class

/**
   This program demonstrates a switch statement. I adjusted to convert characters to upper case.
*/

public class PetFood
{
   public static void main(String[] args)
   {
      String input;     // To hold the user's input
      char firstChar;   // To grab the first letter of input
	char foodGrade;   // Converted grade of pet food

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Prompt the user for a grade of pet food.
      System.out.println("Our pet food is available in " +
                         "three grades:");
      System.out.print("A, B, and C. Which do you want " +
                       "pricing for? ");
      input = keyboard.nextLine();
      firstChar = input.charAt(0);
	foodGrade = Character.toUpperCase(firstChar);

      // Display pricing for the selected grade.
      switch(foodGrade)
      {
         case 'A' -> System.out.println("30 cents per lb.");
         case 'B' -> System.out.println("20 cents per lb.");
         case 'C' -> System.out.println("15 cents per lb.");
         default -> System.out.println("Invalid choice.");
      }
   }
}
