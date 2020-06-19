package SelFrDemo;

class SortDemo {
	private static SortDemo instance = new SortDemo();;

	private SortDemo() {

	}

	public static SortDemo getInstance() {

		return instance;
	}

	void display() {
		System.out.println("hello");
	}

}
