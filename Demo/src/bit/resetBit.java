package bit;

public class resetBit {
	public static void main(String[] args) {

		int i = 21;
		int n = 3;

		int mask = ~(1 << (n - 1));

		System.out.println(mask);

		int res = i & mask;
		System.out.println(res);

	}
}