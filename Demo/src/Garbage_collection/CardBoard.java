package Garbage_collection;

public class CardBoard {

	Short story = 200;

	CardBoard go(CardBoard cb) {
		cb = null;
		return cb;
	}

	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();

		CardBoard c1 = new CardBoard();
		CardBoard c2 = new CardBoard();
		CardBoard c3 = c1.go(c2);

		// System.out.println(run.freeMemory());

		run.gc();
		// System.out.println(run.freeMemory());

		c1.story = 100;

		System.out.println(c1.story);
		c1 = null;
		run.gc();

		System.out.println(c2.story);

	}

}
