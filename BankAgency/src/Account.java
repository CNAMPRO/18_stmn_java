public class Account {
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private double value;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	/**
	 * Ctor
	 * @param value
	 * @param id
	 */
	public Account(double value, int id) {
		this.value = value;
		this.id = id;
	}

	
	public void addFunds(Account acc, double val) {
		setValue(getValue() + val);
	}
	
	
	/**
	 * 
	 * @param acc
	 * @param val
	 * @return
	 */
	public double whiteDraw(Account acc, double val) {
		setValue(getValue() - val);
		return val;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Account createAccount(int id) {
		Account acc = new Account(0, id);
		return acc;
}
}
