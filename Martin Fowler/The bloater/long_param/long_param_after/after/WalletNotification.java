package long_param.after;

class WalletNotification {
    
    
    
	public void balanceNotif(User user, int amount, int current) {
		String body = "";
		if(amount == 0) {
			body = String.format(
					"Halo %s, Saldo mu sekarang ada %2d ", user.getName(), current);
		}
		
		else if (amount > 0) { 
			body = String.format(
				"Halo %s, ada %2d masuk ke akunmu nih. " + 
				"Sekarang balance-mu menjadi %2d", user.getName(), amount, current);
		} 
		
		else{
			body = String.format(
					"Halo %s, ada %2d keluar dari akunmu nih. " + 
					"Sekarang balance-mu menjadi %2d", user.getName(), amount, current);
		}
		
		System.out.printf("Email terkirim ke %s\n", user.getEmail());
		System.out.println("Isi email: ");
		System.out.println(body);
		
	}
}