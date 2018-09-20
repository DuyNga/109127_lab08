package day2.pro1;

import java.util.function.Predicate;

public class MyClass {
	int x;
	int y;

	public MyClass(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean myMethod(MyClass cl) {
		Predicate<MyClass> fun = this::equals;
		return fun.test(cl);
	}

	@Override
	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (ob.getClass() != getClass())
			return false;
		MyClass e = (MyClass) ob;
		return e.x == x && e.y == y;
	}

	public static void main(String[] args) {
		MyClass m1 = new MyClass(1, 2);
		MyClass m2 = new MyClass(1, 2);
		MyClass m3 = new MyClass(3, 4);
		System.out.println(m1.myMethod(m2));
		System.out.println(m3.myMethod(m2));
	}
}
