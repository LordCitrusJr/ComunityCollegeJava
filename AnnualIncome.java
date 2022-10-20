import java.util.Scanner;

public class AnnualIncome
{
	public static void main(String[] args)
	{
		String userName;
		int userAge;
		double userAnnualPay;
		var keyboard = new Scanner(System.in);

		System.out.print("Please enter your name: ");
		userName = keyboard.nextLine();

		System.out.print("Please enter your age: ");
		userAge = keyboard.nextInt();

		System.out.print("Please enter your annual income per year: ");
		userAnnualPay = keyboard.nextDouble();

		System.out.print("My name is " + userName +
		                 ", my age is " + userAge +
		                 ".\nI hope to earn " + userAnnualPay +
		                 " per year.");
	
		keyboard.close();
	}
}