//Name:Brandon Franco 
//Date:4/17/2017
//Class: EG1305 A
/* Instructions: Write the Array program so that it asks the user to enter a series of number.  */
import java.util.Scanner;

public class Array {
	public static void main(String[] args){
		
		int input;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("This program will find the highest, lowest, average and the sum of the numbers that you will enter");
		
		System.out.print("How many numbers do you want to enter? ");
		input = keyboard.nextInt();
		
		System.out.println("Enter a series of " +input+ " numbers");
		int [] numbers = new int[input];
		
		getValues(numbers);
		System.out.println("Highest element is " +showHighest(numbers));
		System.out.println("Lowest element is " +showLowest(numbers));
		System.out.println("The sum of the elements is " +showTotal(numbers));
		System.out.println("The average of the elements is " +showAverage(numbers));
		
	}

	

	public static int[] getValues(int[] numbers) {
		
		Scanner keyboard = new Scanner(System.in);
		
		for(int i = 0; i < numbers.length; i++){
			System.out.print("Enter number " + (i + 1)+ ": ");
			numbers[i] = keyboard.nextInt();
		}

		return numbers;	
	}
	
	public static int showHighest(int[] numbers) {
		int highest = numbers[0];
		for (int i = 1; i < numbers.length; i++)
		{
			if (numbers[i] > highest)
				highest = numbers[i];
		}	
		
		return highest;
	}
	
	public static int showLowest(int[] numbers) {
		int lowest = numbers[0];
		for (int i = 1; i < numbers.length; i++)
		{
			if (numbers[i] < lowest)
				lowest = numbers[i];
		}	
		
		return lowest;
	}
	
	public static int showTotal(int[] numbers) {
		int sum = 0; 
		for (int i = 0; i < numbers.length; i++){
			sum += numbers[i];
		}
		 	return sum;
	}
	
	public static double showAverage(int[] numbers) {
		double sum = 0; 
		double average = 0;
		for (int i = 0; i < numbers.length; i++){
			sum += numbers[i];
		average = sum / numbers.length;
		}
			return average;
	}
		
}
