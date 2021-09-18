package bit;


//9 = 1001, 14 = 1110
//No. of Different bits = 3
public class HammingDistance {
	public static void main(String[] args) {

		long num1 = 9;
		long num2 = 14;

		long xor = num1 ^ num2;

		int count = 0;
		int mask=1;

		for (int i = 0; i < 32; i++) {

			if ((mask & xor) != 0) {
				count++;
			}
			mask=mask<<1;

		}

		System.out.println(count);
	}
}

