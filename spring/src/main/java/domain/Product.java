package domain;

import java.io.Serializable;

public class Product implements Serializable {
	private String description;
	private Double price;

	public Product() {

	}

	public Product(String description, Double price) {
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Description: ").append(description);
		sb.append("\n");
		sb.append("Price: ").append(price);
		return sb.toString();
	}
}
