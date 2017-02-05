//Name:Brandon Franco
//Date:2/5/2017
//Class: EG1305 A
/*Instructions: Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
  For example, if an integer is 837, the sum of all digits is 18.*/ 

import java.util.Scanner;

public class SumDigits {
	
	public static void main(String[] args){
		
		//Declare Variables
		Scanner keyboard = new Scanner(System.in);
		int number;
		int sum;
		int remainingNum;
		int thirdDigit;
		int secondDigit;
		int firstDigit;
		
		//Prompt user for number
		System.out.print("Enter an integer between 0 and 1000: ");
		number = keyboard.nextInt();
		
		//Finds Digit within the number
		thirdDigit = number % 10; 				//extracts the digit in the hundreds place
		remainingNum = number / 10;				//removes extracted digit
		secondDigit = remainingNum % 10; 		//extracts the digit in the tens place
		remainingNum = remainingNum / 10;		//removes extracted digit
		firstDigit = remainingNum % 10;   		//extracts  the digit in the ones place
		remainingNum = number /10;				//removes extracted digit 
		
		//Calculates Sum
		sum = thirdDigit + secondDigit + firstDigit;
		
		//Results
		System.out.println("The sum of all digits in " +number+ " is " +sum);
	}

}
