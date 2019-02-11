
public class Account {

	private int id;
	private float balance;
	private Logger logger;

	public int getId() {
		return id;
	}

	public Account() {
		super();
	}

	public Account(int id, float balance) {
		super();
		setId(id);
		setBalance(balance);
	}
	
	

	public void setId(int id) {
		this.id = id;
	}

	public float getBalance() {
		return balance;
	}
	

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}


	public void setBalance(float balance) {
		this.balance = balance;
		Log log = new Log(System.currentTimeMillis(), getId(), "Set new balance", balance);
		Logger logger = new Logger("C://ofir");
		logger.log(log);
	}
	
	
	
	

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(balance);
		result = prime * result + id;
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
		Account other = (Account) obj;
		if (Float.floatToIntBits(balance) != Float.floatToIntBits(other.balance))
			return false;
		if (id != other.id)
			return false;
		return true;
	}



}
