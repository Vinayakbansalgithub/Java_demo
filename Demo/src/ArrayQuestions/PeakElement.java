package ArrayQuestions;

public class PeakElement {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 4 ,3,5,11};
		int index = find(arr);
		System.out.println(arr[index]);
	}

	static int find(int[] arr) {
		// TODO Auto-generated method stub

		if (arr.length == 1)
			return arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (i == 0 && arr[i] > arr[i + 1])
				return i;

			if (i == arr.length - 1 && arr[i] > arr[i - 1])
				return arr.length - 1;

			if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1])
				return i;

		}

		return -1;

	}
}
