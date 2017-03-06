//Name:Brandon Franco 
//Date:3/06/2017
//Class: EG1305 A
//Instructions: Write a program that generates a password based on the number of digits provided by the user

import java.util.Random;
import java.util.Scanner;

public class GeneratePassword {
	
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many digits you like to use for a numeric password? ");
		int userNum = keyboard.nextInt();
		
		System.out.println("Your password is");
		randomGenerator(userNum);
		
	}


	
	public static int randomGenerator(int j){
		
		int n = 0;
		Random num = new Random();
		
		for (int i =1; i <= j; i++){
			n = 1+num.nextInt(j);
			System.out.print(n + " ");
		}
		
		return n;
		
	}
}
	



