package Arrays;


//287. Find the Duplicate Number
public class FindDuplicate {

	static int findDuplicate(int[] arr) {

		if (arr.length == 0) {
			return 0;
		}
		int slow = arr[0];
		int fast = arr[0];
		
		do {
			slow = arr[slow];
			fast = arr[arr[fast]];
			System.out.println("slow is " + slow);
			System.out.println("fast is " + fast);

		} while (slow != fast);

		fast = arr[0];

		while (fast != slow) {
			fast = arr[fast];
			slow = arr[slow];
		}
		return fast;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 4, 3, 4, 2 };

		int res = findDuplicate(arr);
		System.out.println(res);

	}
}
