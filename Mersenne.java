//Name:Brandon Franco
//Date:2/27/2017
//Class:EG1305A
/* Write a  program that receives an integer from the user and prints all the Mersenne numbers smaller than this number */

import java.util.Scanner;


public class Mersenne {
	public static void main(String[] args){

			Scanner keyboard = new Scanner(System.in);
			int mp;
			int numCount = 0;
			String merseNum = "";
			
		 	//Prompt User
	        System.out.println("Enter a number. The program will print all the Mersenne numbers smaller than this number:");
	        int userNum = keyboard.nextInt();
	        
	        for(int j = 1; j < userNum; j++)
	        {
	        	
	        	if(isPrime(j) && isPrime((int)(Math.pow(2, j)-1)))
	        	{
	        		mp = (int)Math.pow(2,j)-1;
	        		if(mp > userNum){
	        			break;
	        		}
	        		
	        		else{
	        		merseNum = merseNum + mp + " ";
	        		numCount++;
	        	   }
	        	}
	        
	        }
	      
	        //Print Results 
          System.out.println(merseNum);
	      System.out.println("There are a total of " +numCount+ " Mersenne numbers.");
}

	public static boolean isPrime(int j) {
		int i;
		if(j == 1)
			return false;
		for(i = 2; i <= Math.sqrt(j); i++)
		   {
		       if(j % i == 0){
		        return false;
		       }
		   }
		          return true;
	}
}

	
	       
          
	        		
	        	
