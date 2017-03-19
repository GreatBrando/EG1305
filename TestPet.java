//Name:Brandon Franco 
//Date:3/20/2017
//Class: EG1305 A
/* Instructions: Write a TestPet class that will ask the user to enter the name, type, and age of the pet.*/


import java.util.Scanner;

public class TestPet {
	
	public static void main(String[] args){
		
		//Variables
		String name;
		String type;
		int age;
		
		//User Input
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt for User Input
		System.out.println("Please enter your pet's name");
		name = keyboard.nextLine();
		
		System.out.println("Please enter your pet's type");
		type = keyboard.nextLine();
		
		System.out.println("Plese enter your pet's age");
		age = keyboard.nextInt();
		
		//Create Pet Object
		Pet a = new Pet(name,type,age);
		
		System.out.println("Pet object created");
		System.out.println("Your pet's name is " +name);
		System.out.println("Your pet's type is " +type);
		System.out.println("Your pet's age is " +age);
		
		
	}
}
