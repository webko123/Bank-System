import java.util.Arrays;

public class Bank {

	private Client[] clients = new Client[100];
	private Logger logService;
	private float balance;

	public Bank() {
		super();
	}

	public float getBalance() {
		int sum = 0;
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null) {
				sum += clients[i].getFortune();

			}
		}
		return sum + balance;
	}

	public void addClient(int clientId, String name, float balance) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] == null) {
				Log log = new Log(System.currentTimeMillis(), clients[i].getClientId(),
						"new client has benn added to the bank", balance);
				Logger logger = new Logger("C://ofir");
				logger.log(log);
			}
		}
		return;
	}

	public void removeClient(int id) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null && id == clients[i].getClientId()) {
				clients[i] = null;
				Log log = new Log(System.currentTimeMillis(), clients[i].getClientId(),
						"Client has removed from the bank", clients[i].getBalance());
				Logger logger = new Logger("C://ofir");
				logger.log(log);

			}
		}
		return;
	}

	public void getClients() {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null) {
				System.out.println(clients[i]);
			}
		}
	}

	@Override
	public String toString() {
		return "Bank [clients=" + Arrays.toString(clients) + ", logService=" + logService + ", balance=" + balance
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(balance);
		result = prime * result + Arrays.hashCode(clients);
		result = prime * result + ((logService == null) ? 0 : logService.hashCode());
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
		Bank other = (Bank) obj;
		if (Float.floatToIntBits(balance) != Float.floatToIntBits(other.balance))
			return false;
		if (!Arrays.equals(clients, other.clients))
			return false;
		if (logService == null) {
			if (other.logService != null)
				return false;
		} else if (!logService.equals(other.logService))
			return false;
		return true;
	}

}
