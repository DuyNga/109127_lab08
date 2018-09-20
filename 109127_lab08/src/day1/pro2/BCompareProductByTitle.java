package day1.pro2;

import java.util.Comparator;

public class BCompareProductByTitle implements Comparator<Product> {

	@Override
	public int compare(Product e1, Product e2) {
		return e1.title.compareToIgnoreCase(e2.title);
	}

}
