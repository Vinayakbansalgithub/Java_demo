package bit;

public class Count1Bits {
	public static void main(String[] args) {

		long num = 128;

		int mask = 1;

		int count = 0;

		for (int i = 0; i < 32; i++) {

			if ((num & mask) != 0) {
				count++;
			}

			mask = (mask << 1);
		}

		System.out.println(count);
	}
}
