package Extra;

// this was asked in hacker earth test
public class PendingArrangemetNotMoreThen {

	static int arrangement(int red, int blue, int lastN) {
		int rr = 0;
		for (int i = 1; i <= lastN; i++) {
			for (int j = i; j <= lastN; j++) {

				// invalid case
				if ((i > red) || (i > blue))
					continue;

				// invalid case
				if ((j > red) || (j > blue))
					continue;

				int redLast = count(red, blue, 0, i, j);
				int blueLast = count(red, blue, 1, i, j);
				rr += redLast + blueLast;
				System.out.println("for max togather " + i + " result is " + rr);
			}
		}

		return rr;
	}

	static int count(int red, int blue, int color, int maxAllowedTogather, int lastMax) {

		int rr = 0;

		if (color == 0 && red == 0 && blue == 0)
			return 0;

		if (color == 1 && red == 0 && blue == 0)
			return 0;

		if (red == -1 || blue == -1)
			return 0;

		if (red <= maxAllowedTogather && blue == 0 && color == 0) {
			return 1;
		}

		if (blue <= maxAllowedTogather && red == 0 && color == 1) {
			return 1;
		}

		// base case
		if (red == 1 && blue == 0 && color == 0) {
			return 1;
		}
		// base case
		if (red == 0 && blue == 1 && color == 1) {
			return 1;
		}
		// base case
		if (red == 1 && blue == 1) {
			return 1;
		}

		if (color == 0) {
			rr += count(red - maxAllowedTogather, blue, 1, maxAllowedTogather, lastMax);
			return rr;
		} else if (color == 1) {
			rr += count(red, blue - maxAllowedTogather, 0, maxAllowedTogather, lastMax);
			return rr;
		}
		return rr;
	}

	public static void main(String[] args) {
		int red = 3;
		int blue = 3;
		int res = arrangement(red, blue, 2);
		System.out.println("total arrangements possible " + res);

	}
}
