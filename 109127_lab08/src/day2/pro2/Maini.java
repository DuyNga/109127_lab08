package day2.pro2;

import java.util.function.Supplier;

public class Maini {

	public static void main(String[] args) {
		Supplier<Double> sup = Math::random;
		System.out.println(sup.get());
	}
}
