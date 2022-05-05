package kioskProject;

public class BeveregeDTO {
	Long id;
	String menu;
	Long price;

	public BeveregeDTO() {}

	public BeveregeDTO(Long id, String menu, Long price) {
		super();
		this.id = id;
		this.menu = menu;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BeveregeDTO [id=" + id + ", menu=" + menu + ", price=" + price + "]";
	}

	
}


