package assignmentOnConstructor;

public class BankAccountLaunch {

	public static void main(String[] args) {

		BankAccount account= new BankAccount("12324ww3",20000);
		account.deposit(2000);
		System.out.println(account.balance);
		
		account.withdraw(1000);
		System.out.println(account.balance);
	}

}
