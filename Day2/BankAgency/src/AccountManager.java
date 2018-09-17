import java.util.Hashtable;

public class AccountManager {
	private final Hashtable<String, Account> accounts = new Hashtable<>();
	
	public Account getAccount(String accountId) {
		return accounts.get(accountId);
	}
	
	public Account createAccount(String accountId) throws Exception {
		Account account = getAccount(accountId);
		if (account != null) throw new Exception("An account for id "+accountId+ " already exists");
		account = new Account(accountId);
		accounts.put(account.id, account);
		return account;
	}
	
	public void closeAccount(String accountId) throws Exception {
		Account account = getAccount(accountId);
		if (account == null) throw new Exception("Account with id "+accountId+ " does not exist");
		accounts.remove(accountId);
	}
}
