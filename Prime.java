//Name:Brandon Franco
//Date:2/27/2017
//Class:EG1305A
/* Write a Prime program that receives an integer from the user and prints all the prime numbers smaller than this number */

import java.util.Scanner;

public class Prime {
	
public static void main(String[] args){
	
	//Initialize Variables
	Scanner keyboard = new Scanner(System.in);
	int userNum;
	int i = 0;
	int num = 0;											// Variable to compare with counter to determine if number is prime
	int numCount = 0;										// Holds the number of prime numbers
	String primeNum = "";  								    // Holds the prime numbers in that of a string
	
	//Prompt User 
	System.out.print("Enter a number. The program will print all the prime numbers smaller than this number:");
	userNum = keyboard.nextInt();
	
	//For loop used to find all prime number
	 for (i = 1; i <= userNum; i++)  	   
     { 		 		  
        int counter=0; //counter used to verify if number is prime or not		  
        for(num = i; num >= 1; num--){
        	
	    if(i % num==0) //if i is not prime, update the counter
	    {
	    	
		counter += 1;
	    
	    }
	    
     }   
	 if (counter == 2) //if counter is equal to prime, update string of prime number and total number count
	 
	    {
		 
	    primeNum = primeNum + i + "   ";
	    numCount ++;
	    
	    }	
   
    }
	
	 //Results
     System.out.println("\n"+primeNum);
     System.out.println("\nThere are a total of " +numCount+ " prime numbers.");
     
  }
}
