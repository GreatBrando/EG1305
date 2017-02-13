//Name:Brandon Franco 
//Date:2/13/2017
//Class: EG1305 A
/* Instructions: Write a program that the user inputs a year and a month (described by an integer) which outputs the days in that
month and year */

import java.util.Scanner;

public class DaysInMonth {
	
	public static void main(String[] args)
	{
	   Scanner keyboard = new Scanner(System.in);
	   int year;
	   int month;
	   
	   //Prompt User For Year
	   System.out.print("Please Enter a Year: ");
	   year = keyboard.nextInt();
	   
	   //Prompt User for Month
	   System.out.print("Please Enter a Month: ");
	   month = keyboard.nextInt();
	   
	   //Checks for amount of days in the month
	   switch(month)
	   {
	   case(1):
		   System.out.println("There are 31 days in " +month+ "/" +year);
	   	   break;
	   case(2):
		   if((year % 400 == 0 ) || (year % 4 == 0) && (year % 100 != 0))       //Checks if Leap Year
		   {
			   System.out.println("There are 29 days in " +month+ "/" +year);
		   } 
		   else
		   {
			   System.out.println("There are 28 days in " +month+ "/" +year);
		   }
	   	   break;
	   case(3):
		   System.out.println("There are 31 days in " +month+ "/" +year);
	   	   break;
	   case(4):
		   System.out.println("There are 30 days in " +month+ "/" +year);
	   	   break;	
	   case(5):
		   System.out.println("There are 31 days in " +month+ "/" +year);
	   	   break;	
	   case(6):
		   System.out.println("There are 30 days in " +month+ "/" +year);
   	   	   break;
	   case(7):
		   System.out.println("There are 31 days in " +month+ "/" +year);
   	   	   break;	
	   case(8):
		   System.out.println("There are 31 days in " +month+ "/" +year);
   	   	   break;
	   case(9):
		   System.out.println("There are 31 days in " +month+ "/" +year);
   	   	   break;	
	   case(10):
		   System.out.println("There are 31 days in " +month+ "/" +year);
   	   	   break;	
	   case(11):
		   System.out.println("There are 30 days in " +month+ "/" +year);
   	   	   break;
	   case(12):
		   System.out.println("There are 31 days in " +month+ "/" +year);
   	   	   break;
   	   	default:
   	   		System.out.println("This isn't a possible month");
   	   		break;
	   } // end switch statement
	   
    } // end main 
}
