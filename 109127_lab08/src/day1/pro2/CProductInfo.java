package day1.pro2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CProductInfo {
	static enum SortMethod {
		BY_PRICE, BY_TITLE
	}

	public void sort(List<Product> pros, final SortMethod method) {
		class ProductCompare implements Comparator<Product> {
			@Override
			public int compare(Product e1, Product e2) {
				if (method == SortMethod.BY_TITLE) {
					return e1.title.compareToIgnoreCase(e2.title);
				} else {
					return Double.compare(e1.price, e2.price);
				}
			}
		}
		Collections.sort(pros, new ProductCompare());
	}
}
