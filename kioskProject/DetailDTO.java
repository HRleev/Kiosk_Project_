package kioskProject;

public class DetailDTO {
	Long id;
	String order ;
	Long price;
	public DetailDTO(Long id, String order, Long price) {
		super();
		this.id = id;
		this.order = order;
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
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "DetailDTO [id=" + id + ", order=" + order + ", price=" + price + "]";
	}
	public void setOrder(BeveregeDTO result) {
		// TODO Auto-generated method stub
		
	}

	
}
