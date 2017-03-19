//Name:Brandon Franco 
//Date:3/20/2017
//Class: EG1305 A
/* Instructions: Write a TestCircle class that will ask the user to enter a radius.  */

import java.util.Scanner;
import java.text.DecimalFormat;


public class TestCircle {
	
	public static void main(String[] args){
		
		double radius;
		DecimalFormat df = new DecimalFormat("#0.0000");
		
		//Create Scanner Object for Keyboard
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the radius of the circle: ");
		radius = keyboard.nextDouble();
		
		// Create circle object
		Circle a = new Circle(radius);
		
		//Display information
		System.out.println("This circle's radius is: " +df.format(a.getRadius()));
		System.out.println("This circle's diameter is: " +df.format(a.getDiameter()));
		System.out.println("This circle's area is: " +df.format(a.getArea()));
		System.out.println("This circle's circumference is " +df.format(a.getCircumference()));
		
	}
}
