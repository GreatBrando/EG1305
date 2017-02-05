
public class StockTransaction {
	
	public static void main(String[] args)
	{
		// declare and initialize variables
		int numSharesPurchased = 1000; 												 // Number of shares purchased 
		double pricePerSharePurchased =  32.87; 									 // price of the purchased stock
		final double COMMISSION_RATE = 0.02; 										 // Constant for commission Rate of Stocks 
		double amountPaidForStocks = numSharesPurchased * pricePerSharePurchased;    // Amount of Money Joe Paid for Buying Stocks
		double commissionForBuying =  COMMISSION_RATE  * amountPaidForStocks;		 // Amount of Commision Joe Paid his broker when he bought stocks
		
		int numSharesSold = 1000; 													 // number of shares sold
		double PricePerShareSold =  33.92;											 // price of the stock sold
		double amountReceivedFromStocks =  numSharesSold * PricePerShareSold;        // Amount Joe Recieved From Selling Stocks
		double commissionForSelling = COMMISSION_RATE * amountReceivedFromStocks;    // Amount Of Commission Joe paid his broker when he was selling stocks
		
		double profitMade = ( amountReceivedFromStocks - commissionForSelling) - ( amountPaidForStocks - commissionForBuying);  // Total Profit Joe Made
		//This formula is not correct. First calculate the profit: sold - bought, then take off the commissions to find the net profit.
		
		//Prints out information
		System.out.println("The Amount of Money Joe Paid For The Stocks: $" + amountPaidForStocks);                                
		System.out.println("The Amount of Commision Joe Paid His Broker For Buying Stocks: $" + commissionForBuying);
		System.out.println("The Amount of Money Joe Recieved From Selling Stocks: $" + amountReceivedFromStocks);
		System.out.println("The Amount of Commission Joe Paid His Broker For Selling Stocks: $" +commissionForSelling);
		System.out.println("The Amount of profit Joe Made: $" + profitMade);
		
	}
}
