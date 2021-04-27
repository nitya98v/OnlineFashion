package mainpackage.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class cart2 {
	
	@Column(name="cid")
	@Id
	private int  cid;
	private String  fullname;
	private String  email;
	private String  address;
	private String  city;
	private String  state;
	private String  nameoncard;
	private String  creditcardno;
	private String  expirymonth;
	private int  zip;
	private int  cvv;
	private int  expiryyear;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getNameoncard() {
		return nameoncard;
	}
	public void setNameoncard(String nameoncard) {
		this.nameoncard = nameoncard;
	}
	public String getCreditcardno() {
		return creditcardno;
	}
	public void setCreditcardno(String creditcardno) {
		this.creditcardno = creditcardno;
	}
	public String getExpirymonth() {
		return expirymonth;
	}
	public void setExpirymonth(String expirymonth) {
		this.expirymonth = expirymonth;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getExpiryyear() {
		return expiryyear;
	}
	public void setExpiryyear(int expiryyear) {
		this.expiryyear = expiryyear;
	}
	public cart2(int cid, String fullname, String email, String address, String city, String state, String nameoncard,
			String creditcardno, String expirymonth, int zip, int cvv, int expiryyear) {
		super();
		this.cid = cid;
		this.fullname = fullname;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.nameoncard = nameoncard;
		this.creditcardno = creditcardno;
		this.expirymonth = expirymonth;
		this.zip = zip;
		this.cvv = cvv;
		this.expiryyear = expiryyear;
	}
	public cart2() {
		super();
		// TODO Auto-generated constructor stub
	}

		
	}
	
	
	
	


