package Recurssion;


//- In a cricket match, Given a target to chase, while you can score only 1s or 2s. 
//Count how many ways are there with which you can chase the target. (Stair case problem).
//Explained well with recursive as well as DP solution.

// leetcode 70
public class StairCaseProblem {
	private static int stepWays(int start, int maxStepsAllowed, int finalStep, String Path) {

		if (start == finalStep) {
			// System.out.println("start:"+start);
			System.out.println(Path);
			System.out.println("*----------*");

			return 1;
		}

		// moving out form staircase
		if (start > finalStep) {
			return 0;
		}

		int count = 0;
		for (int stepsAtonce = 1; stepsAtonce <= maxStepsAllowed; stepsAtonce++) {
			int temp = stepWays(start + stepsAtonce, maxStepsAllowed, finalStep, Path + " " + stepsAtonce);
			count += temp;
		}
		return count;
	}

	public static void main(String[] args) {
		int count = stepWays(0, 2, 4, "");
		System.out.println("possible ways: " + count);
	}

}
