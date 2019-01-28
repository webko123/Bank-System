

public class Log {

	long timestamp;
	int clientid;
	String description;
	float amount;
	String data;

	public Log(long timestamp, int clientid, String description, float amount) {
		super();
		setTimestamp(timestamp);
		setAmount(amount);
		setClientid(clientid);
		setDescription(description);

	}
	
	public String getData() {
		return null;
	}
	
	public void setData(String Data) {
		this.data = data;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public int getClientid() {
		return clientid;
	}

	public void setClientid(int clientid) {
		this.clientid = clientid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Log [timestamp=" + timestamp + ", clientid=" + clientid + ", description=" + description + ", amount="
				+ amount + ", data=" + data + ", getData()=" + getData() + ", getTimestamp()=" + getTimestamp()
				+ ", getClientid()=" + getClientid() + ", getDescription()=" + getDescription() + ", getAmount()="
				+ getAmount() + "]";
	}

	

}
