//Name:Brandon Franco 
//Date:03/26/2017
//Class: EG1305 A
/*Instructions: Write a TestFan program that asks the user to enter the fan speed, radius, fan status, and color. The program creates a
fan object by using the constructor with four parameters. Then it should display the fan description by invoking their
toString() method */ 

import java.util.Scanner;

public class TestFan {
	public static void main(String[] args){
		
		//variables
		int speed;
		boolean fanStatus;
		double radius;
		String color;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the Speed of the Fan: ");
		speed = keyboard.nextInt();
		
		System.out.println("Please enter the Status of the Fan: ");
		fanStatus = keyboard.nextBoolean();
		
		System.out.println("Please enter the Radius of the Fan: ");
		radius = keyboard.nextDouble();
		
		System.out.println("Please enter the Color of the Fan: ");
		color = keyboard.next();
		
		Fan a = new Fan(speed, fanStatus, radius, color);
		
		System.out.println(a.toString());
		
	}
}
