// A Program that calculates stock stuff for Katherine

public class StockCommission {
    public static void main(String[] args)
    {
        double commission = 0.02;
        int stocksPurchased = 600;
        double pricePerShare = 21.77;
        double totalStockPurchase = stocksPurchased * pricePerShare;
        double commissionFee = totalStockPurchase * commission;
        double transactionCost = totalStockPurchase + commissionFee;

        System.out.printf("Katherine,\nYou bought %s shares at " + 
                          "$%.2f per share, totaling $%,.2f.\nWith your commission fee of %.1f%%, " +
                          "your commission cost for purchase of the shares is $%,.2f." +
                          "\nYour total cost for this transaction is $%,.2f."
                          , stocksPurchased, pricePerShare, totalStockPurchase, commission * 100, commissionFee, transactionCost);
    }
}
