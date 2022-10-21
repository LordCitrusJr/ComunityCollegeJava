// Calulate how many calories per cookie you're eating

public class CookieCalories
{
    public static void main(String[] args)
    {
        final double CALORIESPERBAG = 300;
        final int COOKIESPERBAG = 40;
        final int COOKIESPERSERVING = 10;
        double servingsPerBag = COOKIESPERBAG / COOKIESPERSERVING;

        System.out.print("The amount of calories per a bag of " + COOKIESPERBAG + 
                        " cookies is " + CALORIESPERBAG + ".\nYour calories per serving of " +
                        COOKIESPERSERVING + " cookies is " + CALORIESPERBAG / servingsPerBag +
                         " calories.");
    }
}