package prog3_1_startup;

class Account {
	public final static String CHECKING = "checking";
	public final static String SAVINGS = "savings";
	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private String acctType;
	private Employee employee;

	Account(Employee emp, String acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, String acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		balance+=deposit;
		// implement
	}

	public boolean makeWithdrawal(double amount) {
		if(balance- amount >0 ) {
			balance -= amount;
		}else System.out.println("balance is insufficient");
		// implement
		if(balance == balance-amount){
			return true;
		}else
		return false;
	}
}
