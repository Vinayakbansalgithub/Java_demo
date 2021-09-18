package Recurssion;

public class Factorial {

	static int fact(int i) {

		if (i == 1)
			return 1;

		int value = fact(i - 1);

		value = i * value;
		return value;

	}

	public static void main(String[] args) {
		System.out.println(fact(4));
	}
}
