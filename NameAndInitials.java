import java.util.Scanner;

public class NameAndInitials
{
	public static void main(String[] args)
	{
		String firstName,
		       middleName,
		       lastName;

		char firstInitial,
		     middleInitial,
		     lastInitial;

		var keyboard = new Scanner(System.in);
		
		System.out.print("Please enter your first name: ");
		firstName = keyboard.nextLine();
		firstInitial = firstName.charAt(0);

		System.out.print("Please enter your middle name: ");
		middleName = keyboard.nextLine();
		middleInitial = middleName.charAt(0);

		System.out.print("Please enter your last name: ");
		lastName = keyboard.nextLine();
		lastInitial = lastName.charAt(0);

		System.out.println("Your name is: " + firstName + " " +
		                 middleName + " " + lastName);
		System.out.println("Your initals are: " + firstInitial + middleInitial +
		                   lastInitial);

		keyboard.close();
	}
}