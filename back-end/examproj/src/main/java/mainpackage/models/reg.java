package mainpackage.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class reg {
	
	@Column(name="regid")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int regid;
	@Column(name="name")
	private String name;
	
	@Column(name="emailid")
	private  String emailid;
	
	@Column(name="address")
	private String address;
	
	@Column(name="mobileno")
	private int mobileno;
	
	@Column(name="password")
	private String password;
		public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public reg(int regid, String name, String emailid, String address, int mobileno, String password) {
		this.regid = regid;
		this.name = name;
		this.emailid = emailid;
		this.address = address;
		this.mobileno = mobileno;
		this.password = password;
	}
	public reg() {
		super();
		// TODO Auto-generated constructor stub
	}	
}
