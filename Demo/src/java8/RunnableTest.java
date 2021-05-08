package java8;

public class RunnableTest {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			public void run() {
				System.out.println("run run run!!!");
			}
		});

		t.run();

		Thread t2 = new Thread(() -> System.out.println("run baby run!!!"));
		t2.run();

		Runnable runRef = () -> System.out.println("run for fun!!!");
		runRef.run();

	}

}
