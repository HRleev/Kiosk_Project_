package kioskProject;

public class KioskDTO {

	String mobile;
	String beverege;
	String shot;
	Long price;
	int coupon;
	public KioskDTO() {}
	public KioskDTO(String mobile, String beverege, String shot, Long price, int coupon) {
		super();
		this.mobile = mobile;
		this.beverege = beverege;
		this.shot = shot;
		this.price = price;
		this.coupon = coupon;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getBeverege() {
		return beverege;
	}
	public void setBeverege(String beverege) {
		this.beverege = beverege;
	}
	public String getShot() {
		return shot;
	}
	public void setShot(String shot) {
		this.shot = shot;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	@Override
	public String toString() {
		return "KioskDTO [mobile=" + mobile + ", beverege=" + beverege + ", shot=" + shot + ", price=" + price
				+ ", coupon=" + coupon + "]";
	}
	
	
}