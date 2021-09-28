package Recurssion;

// freshworks
public class Power {
	// (n) time
	static double printPower(double value, int power) {

		long tempPower = power;

		if (tempPower < 0) {
			tempPower = -1 * tempPower;
		}

		double result = 1.0;

		while (tempPower > 0) {

			if (tempPower % 2 == 0) {
				value = value * value;
				tempPower = tempPower / 2;
			} else {
				result = result * value;
				tempPower = tempPower - 1;
			}
		}

		if (power < 0) {
			result = 1 / result;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(printPower(2, 3));

	}

}
