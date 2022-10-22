// A program that calculates sales tax based on user input
import java.util.Scanner;

public class SalesTax
{
    public static void main(String[] args)
    {
        final double STATETAX = 0.02;
        final double COUNTYTAX = 0.04;
        
        double priceInput;
        double sTaxCalc;
        double cTaxCalc;
        double totalPrice;
        
        var keyboard = new Scanner(System.in);

        System.out.print("Please enter the price of goods sold to calculate sales tax: ");
        priceInput = keyboard.nextDouble();
        sTaxCalc = priceInput * STATETAX;
        cTaxCalc = priceInput * COUNTYTAX;
        totalPrice = priceInput + sTaxCalc + cTaxCalc;

        System.out.printf("""
                              Price Entered: $%,.2f
                              Sales Tax: $%,.2f
                              County Tax: $%,.2f
                              Price Entered: $%,.2f
                        """
                , priceInput, sTaxCalc, cTaxCalc, totalPrice);

        keyboard.close();
    }
}