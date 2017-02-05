//Name:Brandon Franco
//Date:2/5/2017
//Class: EG1305 A
/*Instructions: Write a program with the name MilesPerGallon that asks the user for the number of miles driven and the gallons of gas
used. */ 

import java.util.Scanner;

public class MilesPerGallon{
	
	public static void main(String[] args){
		
		//Declare Variables
		int miles;
		int gallons;
		double MPG;
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt User
		System.out.print("Enter the miles driven: ");
		miles = keyboard.nextInt(); 
		
		System.out.print("Enter the gallons of fuel used: ");
		gallons = keyboard.nextInt();
		
		//Calculations
		MPG = (double)miles/gallons;
		
		//Prints Results
		System.out.println("The miles-per-gallon is " +MPG);
	}

}
