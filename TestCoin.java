//Name:Brandon Franco 
//Date:03/26/2017
//Class: EG1305 A
/*Instructions: Write a program that demonstrates the Coin class. 
The program should create an instance of the class and display the side that is initially facing up. 
Then, use a loop to toss the coin 20 times. */ 

public class TestCoin {
	public static void main(String[] args){
		
		// Constant
		final int NUMBEROFTOSSES = 20;
		
		Coin a = new Coin();
		
		//Prints initial toss
		System.out.println("The side initially facing up: " +a.getSideUp());
		
		//Toss coin repeatedly
		System.out.println("Now I will toss the coin " + NUMBEROFTOSSES+ " times.");
		
		int headCounter = 0;
		for(int i = 0; i < NUMBEROFTOSSES; i++){
			
			//Toss coin
			a.toss();
			
			//print side facing up
			System.out.println("Toss:  " + a.getSideUp());
			
			if("heads".equals(a.getSideUp())){
				headCounter++;
			}
		}
	
	
		System.out.println("Total heads facing up: " +headCounter);
		System.out.println("Total tails facing up: " + (NUMBEROFTOSSES - headCounter));
	}
}
