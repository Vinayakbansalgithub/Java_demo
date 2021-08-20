package SlidingWindow;

public class SecondMax {
	static void findSubarrays(String[] arr, int size) {
		// TODO Auto-generated method stub

		long[] array = new long[arr.length];
		for (int i = 0; i < arr.length; i++) {
			array[i] = Long.parseLong(arr[i]);
		}

		if (size == 0) {
			System.out.println("-1");
		}

		int arrstart = 0;
		int arrend = 0;

		long max = Long.MIN_VALUE;
		long secondMax = Long.MIN_VALUE;

		while (arrend < arr.length) {

			if (array[arrend] > max) {

				secondMax = max;
				max = array[arrend];
			} else if (array[arrend] < max && array[arrend] > secondMax) {
				secondMax = array[arrend];
			}

			if (arrend - arrstart + 1 < size) {
				arrend++;
			} else if (arrend - arrstart + 1 == size) {

				if (size == 1) {
					System.out.println("-1");
				} else if (secondMax == Integer.MIN_VALUE) {
					System.out.println("-1");

				} else {
					System.out.println(secondMax);
				}

				break;
			}

		}

	}

	public static void main(String[] args) {
		String[] arr = { "5", "5", "4", "2" };
		int size = arr.length;

		findSubarrays(arr, size);
	}
}
