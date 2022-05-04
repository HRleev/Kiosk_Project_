package kioskProject;

public class KioskDTO {
	Long id;
	String mobile;
	String coupon;
	public KioskDTO(Long id, String mobile, String coupon) {
		super();
		this.id = id;
		this.mobile = mobile;
		this.coupon = coupon;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCoupon() {
		return coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	@Override
	public String toString() {
		return "KioskDTO [id=" + id + ", mobile=" + mobile + ", coupon=" + coupon + "]";
	}
	
	
}
