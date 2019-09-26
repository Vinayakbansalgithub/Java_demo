package Recurssion;

public class Power {
	// (n) time
	static int printPower(int value, int power) {
		if (power == 1) {
			return value;
		}
		int result = printPower(value, power - 1);
		return value * result;
	}

	
	// log(n) time
	static int printPowerLogTime(int value, int power) {
		// TODO Auto-generated method stub
//		if (power == 2) {
//			return value * value;
//		}
//		if (power == 1) {
//			return value;
//		}
		if (power == 0) {
			return 1;
		}
		int result = 0;
		result = printPowerLogTime(value, power / 2);

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
		System.out.println(printPower(2, 17));
		System.out.println(printPowerLogTime(2, 17));

	}

	
}
