package Questions;

public class SubsetOFArray {
	public static void main(String[] args) {
		String str = "123";
		find(str);
	}

	static void find(String str) {
		// TODO Auto-generated method stub

		int limit = (int) Math.pow(2, str.length());
		System.out.println(limit);

		for (int i = 0; i < limit; i++) {

			int temp = i;

			String set = "";
			for (int j = str.length() - 1; j >= 0; j--) {

				int rem = temp % 2;
				temp = temp / 2;

				if (rem == 0) {

					set = set + "-";

				} else {

					set = str.charAt(j) + set;
				}

			}

			System.out.println(set);

		}

	}
}
