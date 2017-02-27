//Name:Brandon Franco
//Date:2/27/2017
//Class:EG1305A
/* Write a program that randomly generates an integer between 1 and 100, inclusive. The program prompts the user to
enter a number continuously until the number matches the randomly generated number. */

import java.util.Scanner;

public class NumberGuess {
	public static void main(String[] args){
		
		//Initialize Variables
		Scanner keyboard = new Scanner(System.in);
		int userNum = 0;
		int randNum;
		
		//Prompt User
		System.out.print("Enter a number between 1 and 100: ");
		
		//Calculate random number
		randNum = (int)(Math.random()*101);
		
	//while loop till user guesses right number 
	while(userNum != randNum){
		
		userNum = keyboard.nextInt();
		
		//When User Number is equivalent to Random Number
		if(userNum == randNum){
			
			System.out.println("You guessed it right");
		}
		
		//When User Number is greater than Random Number 
		else if ( userNum > randNum){
			
		System.out.println("Guess lower");
		
		}
		
		//When User Number is less than Random Number
		else{ 
			
		System.out.println("Guess higher");
		
	    }
		
	}   // end while loop
  }    
} 
