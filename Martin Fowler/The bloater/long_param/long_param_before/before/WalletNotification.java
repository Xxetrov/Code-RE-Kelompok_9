package long_param.before;

class WalletNotification {
	public void balanceNotif(String name, String email, int amount, int current) {
		String body = "";
		if(amount == 0) {
			body = String.format(
					"Halo %s, Saldo mu sekarang ada %2d ", name, current);
		}
		
		else if (amount > 0) { 
			body = String.format(
				"Halo %s, ada %2d masuk ke akunmu nih. " + 
				"Sekarang balance-mu menjadi %2d", name, amount, current);
		} 
		
		else{
			body = String.format(
					"Halo %s, ada %2d keluar dari akunmu nih. " + 
					"Sekarang balance-mu menjadi %2d", name, amount, current);
		}
		
		System.out.printf("Email terkirim ke %s\n", email);
		System.out.println("Isi email: ");
		System.out.println(body);
		
	}
}