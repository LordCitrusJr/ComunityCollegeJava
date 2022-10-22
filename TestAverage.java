import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args)
    {
        int inputCount = 0;
        double cumulativeScore = 0.00;

        var keyboard = new Scanner(System.in);

        System.out.println("Please Enter Your Three Test Scores to determine your average.");
        System.out.print("Test 1 Score: ");
        cumulativeScore += keyboard.nextDouble();
        inputCount++;

        System.out.print("Test 2 Score: ");
        cumulativeScore += keyboard.nextDouble();
        inputCount++;

        System.out.print("Test 3 Score: ");
        cumulativeScore += keyboard.nextDouble();
        inputCount++;

        System.out.printf("Your Average test score is: %.2f", cumulativeScore / inputCount);

        keyboard.close();
    }
}
