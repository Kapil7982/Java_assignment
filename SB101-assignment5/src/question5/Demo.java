package question5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> product = new ArrayList();
		
		product.add(new Product(1, "Jeans", 2,2000));
		product.add(new Product(2, "Shirt", 4,1600));
		product.add(new Product(3, "T-shirt", 6,1800));
		product.add(new Product(4, "Shorts", 2,1000));
		product.add(new Product(5, "Cap", 6,300));
	
		Collections.sort(product, (s1,s2) -> s1.getPrice() > s2.getPrice() ? +1: -1);
		
		product.forEach(System.out::println);
		
		
	}

}
