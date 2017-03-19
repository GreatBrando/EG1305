//Name:Brandon Franco 
//Date:3/20/2017
//Class: EG1305 A
/* Instructions: Write a Distance class that has a static method called getDistance to return the distance from one point to another. */

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Distance {
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		int x1;
		int y1;
		int x2;
		int y2;
		double distance;
		
		System.out.println("The program will calculate the distance between two points");
		System.out.print("Please enter the x and y values for the first point: ");
		System.out.println("\nx: ");
		x1 = keyboard.nextInt();
		System.out.println("y: ");
		y1 = keyboard.nextInt();
		
		System.out.print("Please enter the x and y values for the second point: ");
		System.out.println("\nx: ");
		x2 = keyboard.nextInt();
		System.out.println("y: ");
		y2 = keyboard.nextInt();
		
		double answer = getDistance(x1, y1, x2, y2);
		
		System.out.println("The distance between these two points is " +df.format(answer));
	
	}
	
	public static double getDistance(int num1, int num2, int num3, int num4){
		double result;
		result = (double)Math.sqrt((num2-num1) * (num2-num1) + (num4-num3)*(num4-num3));
		return result;
				
	}

}
