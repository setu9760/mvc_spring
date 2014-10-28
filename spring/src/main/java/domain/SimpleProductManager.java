package domain;

import java.util.ArrayList;
import java.util.List;

public class SimpleProductManager implements Productmanager {

	private List<Product> products;

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void increasePrice(int percentage) {
		if (products != null) {
			for (Product product : products) {
				double newPrice = product.getPrice().doubleValue()
						* (100 + percentage) / 100;
				product.setPrice(newPrice);
			}
		}
	}

	public List<Product> getproducts() {
		return products;
	}

	public void addProduct(Product product) {
		if (products == null) {
			products = new ArrayList<Product>();
		}
		products.add(product);

	}

	public void addproducts(Product[] products) {
		if (this.products == null) {
			this.products = new ArrayList<Product>();
		}
		for (int i = 0; i < products.length; i++) {
			this.products.add(products[i]);
		}
	}

}
