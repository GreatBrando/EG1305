import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(){
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}
	
	public Account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
		
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	public double getMontlyInterestRate(){
		return annualInterestRate/12;
	}
	
	public double withdraw(double amount){
		return balance -= amount;
	}
	
	public double deposit(double amount){
		return balance += amount;
	}
	
	
}
