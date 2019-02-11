
public class Logger {

	private String driverName;

	public Logger() {
		super();
	}

	public Logger(String driverName) {
		super();
		setDriverName(driverName);
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public void log(Log log) {
		System.out.println(log.getData());
	}

	public Log[] getLogs() {
		return null;
	}

	@Override
	public String toString() {
		return "Logger [driverName=" + driverName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((driverName == null) ? 0 : driverName.hashCode());
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
		Logger other = (Logger) obj;
		if (driverName == null) {
			if (other.driverName != null)
				return false;
		} else if (!driverName.equals(other.driverName))
			return false;
		return true;
	}

}
