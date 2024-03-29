package Arrays;

//55. Jump Game
// min number of jumps
public class JumpGame {

	static boolean jump(int[] arr) {
		int reached = 0;
		for (int i = 0; i <= reached; i++) {
			
			// it means what we can reach before is same after this step also
			if (reached == (arr[i] + i)) {
				System.out.println("not found");
				return false;
			}
			reached = Math.max(reached, arr[i] + i);
			if (reached >= arr.length) {
				System.out.println("min no of jump " + i);
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 1, 2, 0, 2, 1, 0, 0, 1, 3 };

		// int arr[] = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		boolean res = jump(arr);
		System.out.println(res);
	}

}
