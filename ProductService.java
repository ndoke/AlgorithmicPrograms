import java.util.ArrayList;

public class ProductService {

	ArrayList<String> products;

	public ProductService() {
		// TODO Auto-generated constructor stub
		products = new ArrayList<String>();
		products.add("Apple");
		products.add("Samsung");
		products.add("Nokia");
	}

	public void checkOut(String product) {
		if (!products.contains(product))
			try {
				throw new ProductNotExistingException(product);
			} catch (ProductNotExistingException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		else {
			System.out.println(product + " checked out!");
		}
	}

	public static void main(String args[]) {
		ProductService productService = new ProductService();
		productService.checkOut(args[0]);
	}
}
