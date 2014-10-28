package domain;

import java.io.Serializable;
import java.util.List;

public interface Productmanager extends Serializable {

	public void increasePrice(int percentage);

	public List<Product> getproducts();

	public void addProduct(Product product);

	public void addproducts(Product[] products);
}
