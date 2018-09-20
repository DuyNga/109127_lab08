package day2.pro2;

import java.util.function.Supplier;

public class Mainii {

	public static void main(String[] args) {
		Supplier<Double> sup = () -> Math.random();
		System.out.println(sup.get());
	}
}
