package ThreadPackage;

public class AtmWithdraw implements Runnable {

	static Integer money = 100;
	static {

		System.out.println("total amount  " + money);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (money > 0) {

			synchronized (money) {

				try {
					if (balance() > 0) {
						try {
							withdraw();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {

						System.out.println("need to earn more   " + Thread.currentThread().getName());
						break;
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	int balance() throws InterruptedException {
		Thread.sleep(500);

		return money;
	}

	static void withdraw() throws InterruptedException {

		synchronized (money) {
			money = money - 10;

			System.out.println("10 rs withdraw by " + Thread.currentThread().getName() + " ,current balance  " + money);

		}

	}

	public static void main(String[] args) throws InterruptedException {

		AtmWithdraw obj1 = new AtmWithdraw();
		// AtmWithdraw obj2= new AtmWithdraw();

		Thread mehul = new Thread(obj1, "mehul");
		Thread vinayak = new Thread(obj1, "vinayak");

		mehul.start();
		vinayak.start();

	}
}
