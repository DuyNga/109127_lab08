package day1.pro2;

import java.util.Collections;
import java.util.List;

import day1.pro2.CProductInfo.SortMethod;

public class DProductInfo {

	public void sort(List<Product> pros, final SortMethod method) {

		Collections.sort(pros, (p1, p2) -> {
			if (method == SortMethod.BY_PRICE) {
				return Double.compare(p1.price, p2.price);
			}
			int compare = p1.title.compareToIgnoreCase(p2.title);
			return compare == 0 ? Integer.compare(p1.model, p2.model) : compare;
		});

	}
}
