package bankAccountApp;

public class BankAccountApp {

	public static void main(String[] args) {
		// 4
		BankAccount acc1 = new BankAccount("465329874", 1000); // 9 add initial balance (1000)
		BankAccount acc2 = new BankAccount("654256226", 2000);
		BankAccount acc3 = new BankAccount("145612552", 2500);
		BankAccount acc4 = new BankAccount("544655416", 500);

		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.deposit(500);
		acc1.deposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());

	}

}
					// 12. create interface interest put there interest rate and accrue() method
class BankAccount implements IInterest {
	// 1 Properties of bank account
	// 2 put in to encapsulation (made them private)
	// that will ensure that the client doesn't have access to these variables
	// except
	// through the methods that we provide them
	private static int iD = 1000; // 5 internal iD if we want to have a unique ID for each person new account we
									// want this to be static because we want this property to belong to the class
									// not a particular person.
	private String accountNumber; // 2.5 iD + random 2-digit number + 2 of SSN
	private static final String routingNumber = "005400657"; // 7 routing number is also going to be static. We CAN'T
																// change this String
	private String name;
	private String SSN;
	private double balance;

	// 3 Constructor
	public BankAccount(String SSN, double initDeposit) {
		// System.out.println("New Account Created");
		// 6.5
		this.SSN = SSN;
		iD++;
		// System.out.println(iD);
		setAccountNumber();
		// 10
		balance = initDeposit;

	}

	// 6:
	private void setAccountNumber() {
		// System.out.println("generating account Number");
		int random = (int) (Math.random() * (99 - 10)) + 10;
		accountNumber = iD + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account Number: " + accountNumber);
		// System.out.println(random);
	}

	// 8: setting name
	public void setName(String name) {
		this.name = name;
	}

	// 8.5: getting name
	public String getName() {
		return name;
	}

	// 11:
	public void payBill(double amount) {
		System.out.println("Withdraw:  $" + amount);
		balance -= amount;
		showbalance();
	}

	public void deposit(double amount) {
		System.out.println("Deposit:  $" + amount);
		balance += amount;
		showbalance();
	}

	public void showbalance() {
		System.out.println("Balance:  $" + balance);
	}
	// 13:
	@Override
	public void accrue() {
		balance = balance * (1 + rate / 100);
		showbalance();

	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n[Routing Number: " + routingNumber +  "]\n[Balance: $" + balance + "]";
	}

}
