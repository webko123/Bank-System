

public class Logger {

	
	String driverName;

	
	
	

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
	
	
	public void log(Log l1) {
		System.out.println(l1.getData);
	}

	public Log getlog() {
		return null;
	}

	@Override
	public String toString() {
		return "Logger [driverName=" + driverName + ", getDriverName()=" + getDriverName() + ", getlog()=" + getlog()
				+ "]";
	}
	
	
	
	
}
