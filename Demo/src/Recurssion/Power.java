package Recurssion;

public class Power {
	// (n) time
	static double printPower(double value, int power) {
		if (power == 0) {
			return 1;
		}
		if (power == 1) {
			return value;
		}
		double result;
		if (power < 0) {
			result = 1 / printPower(value, -power);
		} else {
			result = printPower(value, power - 1);
		}

		if (power % 2 == 0) {
			result = result * result;
			return result;
		} else {
			result = result * value;
			return result;
		}
	}

	// log(n) time
	static double printPowerLogTime(double value, int power) {
		if (power == 0) {
			return 1;
		}

		if (power < 0) {
			printPower(1 / value, -power);
		}
		double result = 0;
		
		if (power < 0) {
			result = 1 / printPowerLogTime(value, -power);
		} else {
			result = printPowerLogTime(value, power - 1);
		}
		//result = printPowerLogTime(value, power / 2);

		if (power % 2 == 0) {
			result = result * result;
			return result;
		} else {
			result = result * result;
			result = result * value;
			return result;
		}

	}

	public static void main(String[] args) {
		System.out.println(printPower(2, -2));
		System.out.println(printPowerLogTime(2, -2));

	}

}
