package day1.pro2;

import java.util.Collections;
import java.util.List;

import day1.pro2.CProductInfo.SortMethod;

public class DProductInfo {
//	static enum SortMethod {
//		BY_PRICE, BY_TITLE
//	}

	public void sort(List<Product> pros, final SortMethod method) {
//		Collections.sort(pros, (p1,  p2) -> {
//			if (p1.title.equalsIgnoreCase(p2.title)) {
//				if (p1.model == p2.model)
//					return 0;
//				if (p1.model < p2.model)
//					return -1;
//				return 0;
//			}
//			return p1.title.compareToIgnoreCase(p2.title);
//		});

		pros.sort((p1, p2) -> {
			if (method == SortMethod.BY_PRICE) {
				return Double.compare(p1.price, p2.price);
			}
			if (p1.title.equalsIgnoreCase(p2.title)) {
				return Integer.compare(p1.model, p2.model);
			}
			return p1.title.compareToIgnoreCase(p2.title);
		});

	}
}
