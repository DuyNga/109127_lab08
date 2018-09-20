package day2.pro4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] names = { "Alexis", "Tim", "Kyleen", "KRISTY" };
		Arrays.sort(names, String::compareToIgnoreCase);

		System.out.println(Arrays.asList(names));
	}

}
