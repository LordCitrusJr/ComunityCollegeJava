import java.util.Scanner;

public class RomanNumerals
{
	public static void main(String[] args)
	{
		int number;
		String romanNumeral;
		var keyboard = new Scanner(System.in);

		System.out.print("Enter a number 1 through 10 to disover its Roman numeral: ");
		number = keyboard.nextInt();

		romanNumeral = switch (number)
			{
			case 1 -> "I";
			case 2 -> "II";
			case 3 -> "III";
			case 4 -> "IV";
			case 5 -> "V";
			case 6 -> "VI";
			case 7 -> "VII";
			case 8 -> "VIII";
			case 9 -> "IX";
			case 10 -> "X";
			default -> "Invalid";
			};
		if (romanNumeral.equals("Invalid"))
			System.out.println("Please enter a valid number next time.");
		
		else
			System.out.println("The Roman numeral for the number " + number +
					" is " + romanNumeral + ".");
	}
}