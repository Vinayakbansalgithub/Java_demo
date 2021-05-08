package Arrays;
//55. Jump Game
public class JumpGame {

	static boolean jump(int[] arr) {
		// TODO Auto-generated method stub
		int reached = 0;

		for (int i = 0; i < arr.length; i++) {

			if (reached < i) {
				return false;
			}

			reached = Math.max(reached, arr[i] + i);

		}

		return true;

	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 1, 2, 0, 2, 1, 0, 0, 1, 3 };
		boolean res = jump(arr);
		System.out.println(res);
	}

}
