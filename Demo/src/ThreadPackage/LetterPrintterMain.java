package ThreadPackage;

public class LetterPrintterMain {

	public static void main(String args[]) throws InterruptedException {

		class Letter implements Runnable {

			LetterPrintterMain obj;

			public Letter(LetterPrintterMain obj) {
				super();
				this.obj = obj;
			}

			@Override
			public void run() {
				synchronized (obj) {
					// System.out.println("Letter obj is " + obj);
					for (int i = 1; i <= 26; i++) {

						System.out.println(Thread.currentThread().getName() + "     " + i);
						obj.notifyAll();

						try {
							obj.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

				}
			}

		}

		class Alphabate implements Runnable {

			LetterPrintterMain obj;

			public Alphabate(LetterPrintterMain obj) {
				super();
				this.obj = obj;
			}

			@Override
			public void run() {
				synchronized (obj) {
					// System.out.println("Alphabate obj is " + obj);
					for (int i = 65; i <= 90; i++) {
						System.out.println(Thread.currentThread().getName() + "  " + (char) i);
						obj.notify();

						try {
							obj.wait();

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
				}
			}
		}
		// Book object on which wait and notify method will be called
		LetterPrintterMain laObj = new LetterPrintterMain();
		Letter letter = new Letter(laObj);
		Alphabate alphabate = new Alphabate(laObj);

		// BookReader threads which will wait for completion of book
		Thread letterThread = new Thread(letter, "letter");
		Thread alphabateThread = new Thread(alphabate, "alphabate");

		letterThread.start();
		alphabateThread.start();

		letterThread.join();
		alphabateThread.join();

	}

}
