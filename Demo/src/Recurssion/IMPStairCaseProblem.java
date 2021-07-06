package Recurssion;

public class IMPStairCaseProblem {
	private static int stepWays(int start, int maxStepsAllowed, int finalStep, String Path) {

		if (start == finalStep) {
			// System.out.println("start:"+start);
			System.out.println(Path);
			System.out.println("*----------*");

			return 1;
		}

		// koving out form starecase
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
