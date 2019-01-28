
public class Client {

	
	
	int id;
	String name;
	float balance;
	Account accounts[];
	float commissionRate = 0;
	float interestRate = 0;
	Logger logger;
	
	
	public Client(int id, String name, float balance, Logger logger) {
		super();
		setId(id);
		setName(name);
		setBalance(balance);
		setLogger(logger);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}


	public Account[] getAccounts() {
		return accounts;
	}


	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}


	public float getCommissionRate() {
		return commissionRate;
	}


	public void setCommissionRate(float commissionRate) {
		this.commissionRate = commissionRate;
	}


	public float getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}


	public Logger getLogger() {
		return logger;
	}


	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	
	
	
}
