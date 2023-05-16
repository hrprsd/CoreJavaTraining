
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc1 = new Account();
		acc1.setAccount(12345, "Einstein", 60000);
		acc1.showAccount();
		
		Account acc2 = new Account();
		acc2.setAccount(98765, "Hawking", 15000);
		acc2.showAccount();
		
		double remainingBalance = acc1.deposit(8000);
		System.out.println("remaining balnce is "+ remainingBalance);
		acc1.showAccount();
		
		
		remainingBalance = acc2.withdraw(10000);
		System.out.println("remaining balnce is "+ remainingBalance);
		acc2.showAccount();
		
	}

}
class Account {
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	
	void setAccount(int x, String y, double z) {
		accountNumber = x;
		accountHolderName = y;
		accountBalance = z;
	}
	void showAccount() {
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Name    : "+accountHolderName);
		System.out.println("Account balance : "+accountBalance);
		System.out.println("--------------------------");
	}
	double deposit(double depositAmount) {
		System.out.println("Depositing "+ depositAmount+" to "+ accountHolderName);
		accountBalance = accountBalance + depositAmount;
		return accountBalance;
	}
	double withdraw(double withdrawAmount) {
		System.out.println("Withdrawing "+ withdrawAmount+" from "+ accountHolderName);
		accountBalance = accountBalance - withdrawAmount;
		return accountBalance;
	}
}
