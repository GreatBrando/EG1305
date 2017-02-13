//Name:Brandon Franco 
//Date:2/13/2017
//Class: EG1305 A
//Instructions: Write a program that plays the paper-rock-scissors game 


import java.util.Scanner;
import java.util.Random;

public class PaperRockScissors {
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();
		
		int userMove;
		int compMove;
		
		System.out.print("scissors (0), rock (1), paper (2): ");
		userMove = keyboard.nextInt();
		
		//Generate computers move (0-2)
		compMove = generator.nextInt(3);
		
		//If User Selects Scissors..............
		if(userMove == 0 && compMove == 0)
		{
		    System.out.println("Sorry, It's a Tie!");
		}
		if(userMove == 0 && compMove == 1)
		{
			System.out.println("You Lose: Rock Beats Scissors");
		}
		if(userMove == 0 && compMove == 2)
		{
			System.out.println("You Win: Scissors Beats Paper");
		}
		
		//If User Selects Rock.................
		if(userMove == 1 && compMove == 0)
		{
		    System.out.println("You win: Rock Beats Scissors");
		}
		if(userMove == 1 && compMove == 1)
		{
			 System.out.println("Sorry, It's a Tie!");
		}
		if(userMove == 1 && compMove == 2)
		{
			System.out.println("You Lose: Paper Beats Rock");
		}
		
		//If User Selects Paper.................
		if(userMove == 2 && compMove == 0)
		{
		    System.out.println("You Lose: Scissors Beats Paper");
		}
		if(userMove == 2 && compMove == 1)
		{
			 System.out.println("You Win: Paper Beats Rock");
		}
		if(userMove == 2 && compMove == 2)
		{
			System.out.println("Sorry, It's a Tie!");
		}
	}
}
