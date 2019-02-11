



public class Test {

	public static void main(String[] args) {

		Client ofir = new Client(676,"ofir",100);
		
		
		Account a1 = new Account(123,40);
		ofir.addAccount(a1);
		
		
		Account a2 = new Account(1323,440);
		ofir.addAccount(a2);
		
		Account a3 = new Account(12653,430);
		ofir.addAccount(a3);
		
		Account a4 = new Account(126883,330);
		ofir.addAccount(a4);
		
		Account a5 = new Account(1324523,870);
		ofir.addAccount(a5);
		
		System.out.println("***************");
		
		ofir.removeAccount(126883);
		
		System.out.println("***************");
		
		
		ofir.getAccount(123);

		
		
        
		
		
		
		
		
		
		
	}

}
