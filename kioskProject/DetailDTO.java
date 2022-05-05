package kioskProject;

public class DetailDTO {
	Long id;
	String order ;
	String orderside ;
	Long price;
	
	public DetailDTO() {}
	public DetailDTO(Long id, String order, String orderside, Long price) {
		super();
		this.id = id;
		this.order = order;
		this.orderside = orderside;
		this.price = price;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getOrderside() {
		return orderside;
	}
	public void setOrderside(String orderside) {
		this.orderside = orderside;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "DetailDTO [id=" + id + ", order=" + order + ", orderside=" + orderside + ", price=" + price + "]";
	}


	
}
