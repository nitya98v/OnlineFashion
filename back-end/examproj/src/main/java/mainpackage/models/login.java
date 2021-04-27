package mainpackage.models;

public class login {
	String emailid;
	String password;
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public login(String emailid, String password) {
		super();
		this.emailid = emailid;
		this.password = password;
	}
	public login() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "login [emailid=" + emailid + ", password=" + password + "]";
	}
	
}
