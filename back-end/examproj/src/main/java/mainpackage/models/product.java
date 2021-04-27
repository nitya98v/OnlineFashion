package mainpackage.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class product {
	@Column(name="pid")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid; 
	private String pname;
	private String image;
	private int price;
	private int quantity;
	private int discount;
	private String cid;
	public product(int pid, String pname, String image, int price, int quantity, int discount, String cid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.image = image;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	
	

}
