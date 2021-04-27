package mainpackage.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class cart1 {
	
	@Column(name="cartid")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  cartid;
	private String pname;
	private int  price;
    private int  quantity;
//	private int  total;
	private String image;
	public cart1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public cart1(int cartid, String pname, int price, int quantity, String image) {
		super();
		this.cartid = cartid;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
//		this.total = total;
		this.image = image;
	}
	
	
	@Override
	public String toString() {
		return "cart1 [cartid=" + cartid + ", pname=" + pname + ", price=" + price + ", quantity=" + quantity
				+ ", image=" + image + "]";
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
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
//	public int getTotal() {
//		return total;
//	}
//	public void setTotal(int total) {
//		this.total = total;
//	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	}
	
	
	
	


