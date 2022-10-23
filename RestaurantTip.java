// A program that calculates tax and tip based on user input
import java.util.Scanner;

public class RestaurantTip
{
    public static void main(String[] args)
    {
        final double MEALTAX = 0.0675;
        final double TIP = 0.20;
        
        double priceInput;
        double mTaxCalc;
        double tipCalc;
        double totalPrice;
        
        var keyboard = new Scanner(System.in);

        System.out.print("Please enter the meal price to calculate sales tax and tip: ");
        priceInput = keyboard.nextDouble();
        mTaxCalc = priceInput * MEALTAX;
        tipCalc = priceInput * TIP;
        totalPrice = priceInput + mTaxCalc + tipCalc;

        System.out.printf("""
                              Price Entered: $%,.2f
                              Meal Tax: $%,.2f
                              Tip: $%,.2f
                              Total: $%,.2f
                        """
                , priceInput, mTaxCalc, tipCalc, totalPrice);

        keyboard.close();
    }
}