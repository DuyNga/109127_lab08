package day1.pro1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		BiFunction<Double, Double, List<Double>> func = (x, y) -> {
			List<Double> list = new ArrayList<Double>();
			list.add(Math.pow(x, y));
			list.add(x * y);
			return list;
		};

		System.out.println(func.apply(2.0, 3.0));
	}

}
