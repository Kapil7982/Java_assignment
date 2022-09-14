package question1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> list = new ArrayList<>();
		
		list.add(new Product(1, "Shirt", 500, 14));
		list.add(new Product(2, "T-shirt", 350, 12));
		list.add(new Product(3, "Jeans", 800, 5));
		list.add(new Product(4, "Short", 250, 16));
		list.add(new Product(5, "Cap", 150, 15));
		
		List<Product> filter= list.stream()
											.filter(s -> s.getQuantity() > 10)
											.sorted(Comparator.comparing(Product::getPrice))
											.collect(Collectors.toList());


				System.out.println(list);
				System.out.println("====================================================================");
				
				
				System.out.println(filter);
	}

}
