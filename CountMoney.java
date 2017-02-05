//Name:Brandon Franco
//Date:2/5/2017
//Class: EG1305 A
//Instructions: Write a program that classifies a given amount of money into smaller monetary units.  

import java.util.Scanner;

public class CountMoney {
	
	public static void main(String[] args){
		
		//Declare Variables
		Scanner keyboard = new Scanner(System.in);
		int amount;
		int remainAmount;
		int numOfDollars;
		int numOfQuarters;
		int numOfDimes;
		int numOfNickels;
		int numOfPennies;
		
		//Prompt user for amount
		System.out.print("Enter an amount in integer, for example 1156");
		System.out.print("\nfor 11 dollars and 56 cents: ");
		amount = keyboard.nextInt();
		
		//Sets Amount for Remain Amount
		remainAmount = amount;
		
		//Find Number of Dollars
		numOfDollars = remainAmount /100;
		remainAmount = remainAmount % 100;
		
		//Find Number of Quarters
		numOfQuarters = remainAmount / 25;
		remainAmount = remainAmount % 25;
		
		//Find Number of Dimes
		numOfDimes = remainAmount / 10;
		remainAmount = remainAmount % 10;
		
		//Find Number of Nickels
		numOfNickels = remainAmount / 5;
		remainAmount = remainAmount % 5;
		
		//Find Number of Pennies
		numOfPennies = remainAmount;
		
		//Display Results
		System.out.println("Your amount " +amount+ " consists of");
		System.out.println(numOfDollars +" dollars");
		System.out.println(numOfQuarters +" quarters");
		System.out.println(numOfDimes +" dimes");
		System.out.println(numOfNickels +" nickels");
		System.out.println(numOfPennies +" pennies");
		
	}
}
