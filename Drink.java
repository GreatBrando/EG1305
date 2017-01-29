
public class Drink {
	
	public static void main(String[] args)
	{
		//declare variables
		int surveyedCustomers = 12467;    // holds customers
		double energyDrinks = 0.14 * surveyedCustomers; //holds customers who drink one or more energy drinks
		double citrusDrinks = 0.64 * energyDrinks;     // holds customers who prefer citrus flavored energy drinks
		
		//print results
		System.out.println("Out of the 12,467 customers surveyed, the approximate number of customers in the survey who purchaed one or more energy drinks was " +(int)energyDrinks);
		System.out.println("Out of the 12,467 customers surveyed, the approximate number of customers in the survey who prefer citrus flavored energy drinks was " +(int)citrusDrinks);
		
	}
}

