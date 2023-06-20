package Incomplete;

public class SmtpEmailService implements EmailService {
	private String host;
	private int post;
	private String username;
	private String password;
	
	public SmtpEmailService(String host, int post, String username, String password) {
		this.host = host;
		this.post = post;
		this.username = username;
		this.password = password;
	}
	
	public void printservice(){
		System.out.println("Host : " + this.host);
		System.out.println("Post : " + this.post);
		System.out.println("Username : " + this.username);
		System.out.println("Password : " + this.password);
	}
	
	public void sendEmail(String to, String Subject, String Body) {
		System.out.println("Email sent to " + to + ". Subject: " + Subject + ". Body:" + Body);
		
	}
}
