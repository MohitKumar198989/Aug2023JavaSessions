package assignmentOnConstructor;

public class BankAccount {
	String accountNumber;
	double balance;
	
	public BankAccount(String accountNumber, double balance){
	this.accountNumber=accountNumber;
	this.balance=balance;
	}
	
	public double deposit(double a){
		balance =balance+a;
		return balance;
		
	}
	
	public double withdraw(double a){
		balance =balance-a;
		return balance;
		
	}

}
