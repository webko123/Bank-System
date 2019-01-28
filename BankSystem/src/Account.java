

public class Account {

	int id;
	float balance;
	
	
	
	
	public Account(int id, float balance) {
		super();
		setBalance(balance);
		setId(id);
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", getId()=" + getId() + ", getBalance()=" + getBalance()
				+ "]";
	}
	
	
	
	
}
