
public class Log {

	private long timestamp;
	private int clientid;
	private String description;
	private float amount;

	public Log(long timestamp, int clientid, String description, float amount) {
		super();
		setTimestamp(timestamp);
		setClientid(clientid);
		setDescription(description);
		setAmount(amount);
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
	
	public String getData() {
		return String.format("Client %d just %s with the amount of %f, it happend at %d",clientid,description,amount,timestamp );
	}

	@Override
	public String toString() {
		return "Log [timestamp=" + timestamp + ", clientid=" + clientid + ", description=" + description + ", amount="
				+ amount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(amount);
		result = prime * result + clientid;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + (int) (timestamp ^ (timestamp >>> 32));
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
		Log other = (Log) obj;
		if (Float.floatToIntBits(amount) != Float.floatToIntBits(other.amount))
			return false;
		if (clientid != other.clientid)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (timestamp != other.timestamp)
			return false;
		return true;
	}

}
