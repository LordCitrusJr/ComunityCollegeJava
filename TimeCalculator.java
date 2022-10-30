// This program will tell convert seconds into days/hours/minutes.
import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] arg)
    {
        // Declare and assign variables
        final int SECONDSINDAY = 86400;
        final int SECONDSINHOUR = 3600;
        final int SECONDSINMINUTE = 60;
        int remainder;
        var keyboard = new Scanner(System.in);

        // Welcome message and user input
        System.out.print("Please enter the number of seconds you'd like to convert: ");
        int secondsInput = keyboard.nextInt();

        // Procedurally divide seconds out, with modulo to leave what's left
        int dayOutput = secondsInput / SECONDSINDAY;
        remainder = secondsInput % SECONDSINDAY;
        int hourOutput = remainder / SECONDSINHOUR;
        remainder = remainder % SECONDSINHOUR;
        int minuteOutput = remainder / SECONDSINMINUTE;
        remainder = remainder % SECONDSINMINUTE;
        int secondOutput = remainder;

        // Output Message
        System.out.printf("""
                        There are\s
                        %4d day(s)
                        %4d hour(s)
                        %4d minute(s)
                        %4d second(s)
                        within %,d seconds."""
                ,dayOutput,hourOutput,minuteOutput,secondOutput,secondsInput);
    }

}
