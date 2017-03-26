import java.util.Random;

public class Coin {

	private String sideUp;
	
	public Coin(){
		
		toss();
	}
	
	public String getSideUp(){
		return sideUp;
	}
	
	public void toss(){
		Random num = new Random();
		
		//collects random value of 0 or 1
		int value = num.nextInt(2);
		
		if(value == 0){
			this.sideUp = "heads";
		} else {
			this.sideUp = "tails";
		}
	}
}
	
