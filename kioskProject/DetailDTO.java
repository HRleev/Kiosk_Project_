package kioskProject;

public class DetailDTO {
	String order ;
	String orderside ;
	Long detailprice;
	
	public DetailDTO() {}

	public DetailDTO(String order, String orderside, Long detailprice) {
		super();
		this.order = order;
		this.orderside = orderside;
		this.detailprice = detailprice;
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

	public Long getDetailprice() {
		return detailprice;
	}

	public void setDetailprice(Long detailprice) {
		this.detailprice = detailprice;
	}

	@Override
	public String toString() {
		return "DetailDTO [order=" + order + ", orderside=" + orderside + ", detailprice=" + detailprice + "]";
	}

	
	
	
}
