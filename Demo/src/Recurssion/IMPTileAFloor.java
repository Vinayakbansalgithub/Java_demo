package Recurssion;

public class IMPTileAFloor {

	static int ways(int tile, int floor) {

		if (floor == 1)
			return 1;

		if (floor == 2)
			return 2;

		return ways(tile, floor - 1) + ways(tile, floor - 2);
	}

	public static void main(String[] args) {

		int tile = 1;
		int floor = 6;

		int result = ways(tile, floor);

		System.out.println(result);

	}
}

//1 1 2 3 5 8 13