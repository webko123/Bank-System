import java.util.Arrays;

public class Client {

	private int clientId;
	private String name;
	private float balance;
	private Account[] accounts = new Account[5];
	private float commissionRate = 0;
	private float interestRate = 0;
	private Logger logger;

	public Client() {
		super();
	}

	public Client(int clientId, String name, float balance) {
		super();
		setClientId(clientId);
		setName(name);	
		setBalance(balance);
		setAccounts(accounts);
		setCommissionRate(commissionRate);
		setInterestRate(interestRate);
		
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
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
	
	public void addAccount(Account account) {
		for (int i=0;i<accounts.length;i++) {
			if (accounts[i]==null) {
				accounts[i]=account;
				
				
				Log log = new Log(System.currentTimeMillis(), getClientId(),String.format( "The Account: %d has been added to Client",accounts[i].getId()), balance);
				Logger logger = new Logger("C://ofir");
				logger.log(log);
				
				return;
			}
		}
		System.out.println("There is no more space for new accounts..");
		
	}
	
	public void removeAccount(int id) {
		for(int i =0;i<accounts.length;i++) {
			if(accounts[i]!=null && accounts[i].getId()==id) {
				accounts[i]=null;
				
				Log log = new Log(System.currentTimeMillis(), getClientId(),String.format( "The Account: %d has been delited from Client",accounts[i].getId()), accounts[i].getBalance());
				Logger logger = new Logger("C://ofir");
				logger.log(log);
				return;
			}
		}
		System.out.println("not found account with this id..");
	}
	
	
	public void getAccount(int id) {
		for (int i=0; i<accounts.length;i++) {
			if(accounts[i]!=null) {
				System.out.println(accounts[i]);
			}
			
			
			
		}
	}
	
	public void deposite (float deposite) {
		balance+= deposite - commissionRate;
	}
	
	public void withdraw(float withdraw) {
		balance-= withdraw+commissionRate;
	}
	
	public float getFortune() {
		float sum=0;
		for (int i =0;i<accounts.length;i++) {
			if(accounts[i]!=null) {
				sum+=accounts[i].getBalance();
				
			}
		}
		return sum+balance;
	}

	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", name=" + name + ", balance=" + balance + ", accounts="
				+ Arrays.toString(accounts) + ", commissionRate=" + commissionRate + ", interestRate=" + interestRate
				+ ", logger=" + logger + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(accounts);
		result = prime * result + Float.floatToIntBits(balance);
		result = prime * result + clientId;
		result = prime * result + Float.floatToIntBits(commissionRate);
		result = prime * result + Float.floatToIntBits(interestRate);
		result = prime * result + ((logger == null) ? 0 : logger.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (!Arrays.equals(accounts, other.accounts))
			return false;
		if (Float.floatToIntBits(balance) != Float.floatToIntBits(other.balance))
			return false;
		if (clientId != other.clientId)
			return false;
		if (Float.floatToIntBits(commissionRate) != Float.floatToIntBits(other.commissionRate))
			return false;
		if (Float.floatToIntBits(interestRate) != Float.floatToIntBits(other.interestRate))
			return false;
		if (logger == null) {
			if (other.logger != null)
				return false;
		} else if (!logger.equals(other.logger))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
