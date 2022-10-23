// THE STRING MANIPULATOR! LOCK UP YOUR KIDS AND TELL YOUR FOLKS TO STAY AT HOME!

import java.util.Scanner;

public class Manipulator
{
	public static void main(String[] args)
	{
	String cityName;
	String noSpaceCityName; // For city names with spaces i.e. San Jose

	var keyboard = new Scanner(System.in);

	System.out.print("Please enter a city name to be...MANIPULATED!: ");
	cityName = keyboard.nextLine();
	noSpaceCityName = cityName.replaceAll(" ", "");

	System.out.println("Letters in the City Name: " + noSpaceCityName.length());
	System.out.println("UPPERCASE: " + cityName.toUpperCase());
	System.out.println("lowercase: " + cityName.toLowerCase());
	System.out.println("First letter: " + cityName.charAt(0));

	keyboard.close();
	}
}