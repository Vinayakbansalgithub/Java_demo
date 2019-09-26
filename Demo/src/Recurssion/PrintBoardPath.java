package Recurssion;


public class PrintBoardPath {

	private static void PrintBP(int start, int end, int current, String output) {

		if (current == end) {
			System.out.println("path:" + output);
			return;
		}
		//System.out.println("current:"+current);

		if (current > end) {
			return;
		}
		for (int dice = 1; dice <= 6; dice++) {
			PrintBP(dice, end, current+dice, output + dice);
		}
	}

	public static void main(String[] args) {
		PrintBP(0, 10, 0, "");

	}

}
