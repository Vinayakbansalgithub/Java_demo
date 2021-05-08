package Arrays;


//There are ‘p’ balls of type P, ‘q’ balls of type Q and ‘r’ balls of type R.
//Using the balls we want to create a straight line such that no two balls of same type are adjacent.

public class ImpBallArrangement {

	static int arrangement(int red, int blue, int green) {

		int rr = count(red, blue, green, 0) + count(red, blue, green, 1) + count(red, blue, green, 2);

		return rr;
	}

	static int count(int red, int blue, int green, int last) {

		System.out.println("total balls " + (red + blue + green));

		int rr = 0;

		if (red == -1 || blue == -1 || green == -1)
			return 0;

		// base case
		if (red == 1 && blue == 0 && green == 0 && last == 0) {
			return 1;
		}
		// base case
		if (red == 0 && blue == 1 && green == 0 && last == 1) {
			return 1;
		}
		// base case
		if (red == 0 && blue == 0 && green == 1 && last == 2) {
			return 1;
		}

		if (last == 0) {
			rr = count(red - 1, blue, green, 1) + count(red - 1, blue, green, 2);
			return rr;
		} else if (last == 1) {
			rr = count(red, blue - 1, green, 0) + count(red, blue - 1, green, 2);
			return rr;
		} else if (last == 2) {
			rr = count(red, blue, green - 1, 0) + count(red, blue, green - 1, 1);
			return rr;
		}
		return rr;

	}

	public static void main(String[] args) {
		int red = 1;
		int blue = 1;
		int green = 1;
		int res = arrangement(red, blue, green);
		System.out.println("total arrangements possible " + res);
	}

}
