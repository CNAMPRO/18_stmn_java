
public class Account {
	public final String id;
	double balance;
	
	public Account(String id) {
		this.id = id;
		balance = 0;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double money) {
		balance += money;
	}
	
	public void draw(double money) throws Exception {
		if (money>balance) throw new Exception("Cannot draw more than current balance");
		balance -= money;
	}

}
