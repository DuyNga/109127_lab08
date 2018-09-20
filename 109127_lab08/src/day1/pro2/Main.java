package day1.pro2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import day1.pro2.CProductInfo.SortMethod;

public class Main {

	public static void main(String[] args) {
		List<Product> pros = new ArrayList<>();
		pros.add(new Product("Iphone 8 plus", 850.0, 2018));
		pros.add(new Product("Iphone 8", 800.0, 2018));
		pros.add(new Product("Iphone 8", 780.0, 2017));
		pros.add(new Product("Iphone watch", 200.0, 2018));
		pros.add(new Product("Iphone watch", 180.0, 2017));
		pros.add(new Product("Hifi speaker", 180.0, 2017));
		pros.add(new Product("Logi mouse", 170.0, 2017));

		// a
		Collections.sort(pros, new ACompareProductByPrice());
		pros.sort(new ACompareProductByPrice());
		System.out.println("--------a part--------");
		System.out.println("Sort by price");
		System.out.println(pros);

		// b
		Collections.sort(pros, new BCompareProductByTitle());
		System.out.println("--------b part--------");
		System.out.println("Sort by title");
		System.out.println(pros);
		
		//c
		CProductInfo info = new CProductInfo();
		info.sort(pros, SortMethod.BY_PRICE);
		System.out.println("--------c part--------");
		System.out.println("Sort by price");
		System.out.println(pros);

		info.sort(pros, SortMethod.BY_TITLE);
		System.out.println("Sort by title");
		System.out.println(pros);
		
		//d
		DProductInfo dInfo = new DProductInfo();
		dInfo.sort(pros, SortMethod.BY_TITLE);
		System.out.println("--------d part--------");
		System.out.println("Sort by title and then by model");
		System.out.println(pros);
	}

}
