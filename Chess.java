//Name:Brandon Franco 
//Date:3/20/2017
//Class: EG1305 A
/* Instructions: Write a Chess class that will compute the solution to the wheat and chessboard problem. */
public class Chess {
	
	public static void main(String[] args){
		
		double total = 0;
	
		for(int i = 0; i <= 63; i++){
			double rice = Math.pow(2, i);
			total += rice;
			
		}
		
		double s = Math.pow(2, 63);
		System.out.println("The total grains of wheat to cover the whole board: " +total);
		System.out.println("The number of grains on the last square: " +s);	
	}
}
	

