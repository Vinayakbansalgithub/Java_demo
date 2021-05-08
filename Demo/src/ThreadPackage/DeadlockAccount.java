package ThreadPackage;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account {

	int balance = 1000;

	void showBalance() {
		System.out.println("current balance is " + balance);
	}

	void deposite(int amount) {

		this.balance = this.balance + amount;
	}

	void withdraw(int amount) {
		this.balance = this.balance - amount;

	}

	void transfer(Account to, Account from, int amount) {

		to.deposite(amount);
		from.withdraw(amount);

	}

}

public class DeadlockAccount {

	static void getLock(Lock acc1Lock, Lock acc2Lock) {

		while (true) {
			boolean lock1 = false;
			boolean lock2 = false;

			lock1 = acc1Lock.tryLock();
			lock2 = acc2Lock.tryLock();
			if (lock1 && lock2) {
				return;
			}

			if (lock1) {
				acc1Lock.unlock();
				lock1 = false;
			}

			if (lock2) {
				acc2Lock.unlock();
				lock2 = false;
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {

		final Lock acc1Lock = new ReentrantLock();
		final Lock acc2Lock = new ReentrantLock();

		Account acc1 = new Account();
		Account acc2 = new Account();
		System.out.println("Initaial balance: " + acc1.balance);
		System.out.println("Initaial balance: " + acc2.balance);

		// acc1.transfer(acc1, acc2, 500);

//	System.out.println(" balance: "+acc1.balance);
//	System.out.println(" balance: "+acc2.balance);

		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					getLock(acc2Lock, acc1Lock);

					System.out.println("in thread 1");
					// System.out.println(" vinayak mehul");
					acc2.transfer(acc2, acc1, new Random().nextInt(100));
					System.out.println(" balance1: " + acc1.balance);
					System.out.println(" balance1: " + acc2.balance);
					acc1Lock.unlock();
					acc2Lock.unlock();
				}
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {

				for (int i = 0; i < 10; i++) {
					getLock(acc2Lock, acc1Lock);

					// TODO Auto-generated method stub

					System.out.println("in thread 2");
					// System.out.println(" vinayak mehul");
					acc2.transfer(acc2, acc1, new Random().nextInt(100));
					System.out.println(" balance2: " + acc1.balance);
					System.out.println(" balance2: " + acc2.balance);
					acc2Lock.unlock();
					acc1Lock.unlock();

				}

			}

		};

		t1.setName("vinayak account");
		t2.setName("mehul account");

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println("=======================");

		System.out.println(" balance: " + acc1.balance);
		System.out.println(" balance: " + acc2.balance);

	}

}
