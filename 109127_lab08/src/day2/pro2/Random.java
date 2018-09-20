package day2.pro2;

import java.util.function.Supplier;

public class Random {
	public void printRandomNumber() {
		class InnerClass implements Supplier<Double> {

			@Override
			public Double get() {
				return Math.random();
			}
		}
		System.out.println(new InnerClass().get());
	}
}
