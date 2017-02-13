//Name:Brandon Franco 
//Date:2/13/2017
//Class: EG1305 A
/* Instructions: Use a series of if statements to determine the smallest and largest numbers.
   Calculate the sum, product and average, and assign them to variables called sum, product and average. */

import java.util.Scanner;

public class CompareNumbers {
	
	public static void main(String[] args)
	{
		//Scanner Object
		Scanner keyboard = new Scanner(System.in);
		
		//Variables
		int num1;
		int num2;
		int num3;
		int largeNum;
		int smallNum;
		int sum;
		int product;
		int average;
		
		//Prompt User for Input
		System.out.print("Enter First Integer: ");
		num1 = keyboard.nextInt();
		
		System.out.print("Enter Second Integer: ");
		num2 = keyboard.nextInt();
		
		System.out.print("Enter Third Integer: ");
		num3 = keyboard.nextInt();
		
		//Find Largest Value
		largeNum = num1;
		if(num2 > largeNum)
		{
			largeNum = num2;
		}
		
		if (num3 > largeNum)
		{
			largeNum = num3;
		}
		
		//Find Smallest Value
		smallNum = num1;
		if(num2 < smallNum)
		{
			smallNum =num2;
		}
		
		if(num3 < smallNum)
		{
			smallNum = num3;
		}
		
		//Calculations
		sum = num1 + num2 + num3;
		product = num1 * num2 * num3;
		average = (num1 + num2+ num3)/3;
		
		//Print Results
		System.out.println("For the numbers " +num1+ ", " +num2+ " and " +num3);
		System.out.println("Largest is " +largeNum);
		System.out.println("Smallest is " +smallNum);
		System.out.println("Sum is " +sum);
		System.out.println("Product is "+product);
		System.out.println("Average is "+average);
    }
}	
