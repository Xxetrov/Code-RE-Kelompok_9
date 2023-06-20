package Incomplete;

public class Main {
	 public static void main(String[] args) {
		    SmtpEmailService emailService = new SmtpEmailService("smptp.gmail.com", 5267, "username", "password");
		    emailService.printservice();
		    emailService.sendEmail("john.doe@example.com", "Hello", "This is a test email.");
		}
}
