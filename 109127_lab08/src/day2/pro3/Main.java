package day2.pro3;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");
		// a
		System.out.println("--------Lambdas--------");
		fruits.forEach(x -> System.out.println(x));
		//b
		System.out.println("--------method reference--------");
		fruits.forEach(System.out::println);
	}
}
