//Name:Brandon Franco
//Date:2/5/2017
//Class: EG1305 A
/*Instructions: Write a program with the name ComputeBMI that prompts the user to
enter a weight in pounds and height in inches and display the BMI. */ 

import javax.swing.JOptionPane;

public class ComputeBMI {
	
	public static void main(String[] args){
		
		//Declare variables
		final double KILO_PER_POUND = 0.45359237; // Constant for Conversion
		final double METER_PER_INCH = 0.0254;    //Constant for Conversion
		String inputString;                      //Reading Input
		double weight;                           
		double height;
		double weightInKilos;
		double heightInMeters;
		double BMI;
		
		//Prompt user for weight in pounds
		inputString = JOptionPane.showInputDialog("Enter your weight in pounds.");
		weight = Double.parseDouble(inputString);
		
		//Prompt user for height in inches
		inputString = JOptionPane.showInputDialog("Enter your height in inches.");
		height = Double.parseDouble(inputString);
		
		//Calculations
		weightInKilos = weight * KILO_PER_POUND;
		heightInMeters = height * METER_PER_INCH;
		BMI = weightInKilos / (heightInMeters * heightInMeters);
		
		//Display the Results
		JOptionPane.showMessageDialog(null, "Your Body Mass Index is " +BMI);
		
		//End the program
		System.exit(0);
		
	}
}
