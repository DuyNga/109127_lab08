package day1.pro2;

import java.util.Comparator;

public class ACompareProductByPrice implements Comparator<Product> {

	@Override
	public int compare(Product e1, Product e2) {
		return Double.compare(e1.price, e2.price);
	}

}
