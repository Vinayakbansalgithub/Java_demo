package SelFrDemo;

class Read extends Thread {
	private Calculator cal;

	public Read(Calculator cal) {
		this.cal = cal;
	}

	public void run() {

		synchronized (cal) {
			try {
				cal.wait();
			} catch (Exception e) {
			}
			System.out.println("in read");
			System.out.println("Second step");
			System.out.println("count value is " + cal.count);
			/*
			 * try{ notifyAll(); } catch(Exception e){
			 * System.out.println("Bansal"); }
			 */

		}

	}
}

class Calculator extends Thread {
	int count = 0;

	public void run() {
		synchronized (this) {

			System.out.println("in calculator");
			System.out.println("first step");
			System.out.println("this is " + this);
			for (int i = 1; i <= 100; i++) {
				count = count + i;
			}
			try {
				notifyAll();
			} catch (Exception e) {
				System.out.println("vinayak");
			}

		}

	}
}

public class ScjpCalculatorNotifyallDemo extends Thread {
	public static void main(String[] args) throws InterruptedException {

		Calculator cal = new Calculator();
		Read re = new Read(cal);
		re.start();
		cal.start();
		synchronized (re) {
			re.wait();
			System.out.println("we are in the end and this is a last step");
		}

	}

}
