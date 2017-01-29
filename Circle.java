import java.text.DecimalFormat;

public class Circle {
	
	public static void main(String[] args)
	{
		
		//declare variables
		int radius = 10;   // holds radius
		int diameter;      // holds diameter
		double area;	   // holds area
		DecimalFormat df = new DecimalFormat("#0.0000");  //holds formater
		
		//Calculations
		diameter = radius * 2; //Calculates diameter
		area = Math.PI*(radius * radius); //Calculates area
		
		//Print Results
		System.out.println("The circle's radius is " + radius + ", the area is "  +df.format(area)); //prints radius and area 
		System.out.println("The diameter is " + diameter); //prints diameter
		
	}

}
