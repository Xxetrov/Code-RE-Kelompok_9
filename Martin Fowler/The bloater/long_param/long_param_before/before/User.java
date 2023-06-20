package long_param.before;

import fowler.bloaters.long_parameter_list.after.Wallet;

public class User {
	private String name;
	private String email;
	private Wallet wallet;
	
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		this.wallet = new Wallet();
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Wallet getWallet() {
		return wallet;
	}
}