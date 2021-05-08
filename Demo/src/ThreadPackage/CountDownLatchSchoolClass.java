package ThreadPackage;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchSchoolClass extends Thread {
	CountDownLatch classWait;
	boolean hasStarted=false;

	public CountDownLatchSchoolClass(CountDownLatch classWait) {
		// TODO Auto-generated constructor stub
		this.classWait = classWait;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " arived to class");

		try {
			classWait.countDown();
			classWait.await();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		System.out.println("class has been started");
	}

	public static void main(String[] args) throws InterruptedException {

		CountDownLatch classWait = new CountDownLatch(5);
		CountDownLatchSchoolClass t1 = new CountDownLatchSchoolClass(classWait);

		CountDownLatchSchoolClass t2 = new CountDownLatchSchoolClass(classWait);
		CountDownLatchSchoolClass t3 = new CountDownLatchSchoolClass(classWait);
		CountDownLatchSchoolClass t4 = new CountDownLatchSchoolClass(classWait);

		CountDownLatchSchoolClass t5 = new CountDownLatchSchoolClass(classWait);
		CountDownLatchSchoolClass t6 = new CountDownLatchSchoolClass(classWait);
		CountDownLatchSchoolClass t7 = new CountDownLatchSchoolClass(classWait);
		CountDownLatchSchoolClass t8 = new CountDownLatchSchoolClass(classWait);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		// Thread.sleep(1000);
		t5.start();

		Thread.sleep(3000);

		t6.start();
		t7.start();
		t8.start();

	}

}
