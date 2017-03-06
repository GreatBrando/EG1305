

import java.util.Scanner;
import java.text.DecimalFormat;

public class FindPI {
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		double pi = 0;
		int counter;
		int iterations = 0;
		long difference = 0;
		DecimalFormat df = new DecimalFormat("0.000");
		
		
		System.out.println("Enter The Amount of Iterations: ");
		iterations = keyboard.nextInt();
		
		if (iterations >= 0){
			Long startTime = System.nanoTime();
		for (counter = 0; counter <= iterations - 1; counter++)
		{
			if(counter % 2 == 0)
			{
				pi = pi + (1/ (1 + (2.0 * counter)));
			}
			else
			{
				pi = pi - (1/ (1 + (2.0 * counter)));
			}
		}
		Long endTime = System.nanoTime();
		pi = pi * 4; // Returns True Value of Pi
		System.out.println("PI = " +pi+ " after " +iterations+ " iterations");
		
		
		difference = endTime - startTime;
		double seconds = difference / 1000000000.0;
		System.out.println("It takes " +df.format(seconds)+ " to complete this operation.");
	 }
	
  }

}
