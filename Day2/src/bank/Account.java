package bank;

public class Account{
	private String id;
	private int solde;

	public Account(String id, int solde) {
		this.id = id;
		this.solde = solde;
	}
	
	public void addMoney(int value) {
		this.solde += value;
	}
	
	public void removeMoney(int value) {
		this.solde -= value;
	}
	
	public int viewMoney(int solde) {
		return solde;
	}
	
	public Account createAccount(String id, int solde) {
		Account newAccount = new Account(id,solde);
		return newAccount;
	}
	
	public void deleteAccount(Account compte) {
		// delete account
	}

	
	
	
	
}
