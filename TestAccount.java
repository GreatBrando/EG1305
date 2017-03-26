//Name:Brandon Franco 
//Date:03/26/2017
//Class: EG1305 A
/*Instructions: Write a TestAccount program that creates an Account object with an account id of 1122, a balance of
$20,000, and an annual interest rate of 4.5%. Use the withdraw method to withdraw $2,500, use the deposit
method to deposit $3,000. Print the balanace, Monthly Interest, and the date created*/ 

public class TestAccount {
	public static void main(String[] args){
		Account a = new Account(1112, 20000, .045);
		a.withdraw(2500);
		a.deposit(3000);
		System.out.println("Balance: $" +a.getBalance());
		System.out.println("Monthly Interest: " +a.getMontlyInterestRate());
		System.out.println("Date Created: " +a.getDateCreated());
	}
}
