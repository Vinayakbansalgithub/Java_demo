package SelFrDemo;

class Profie {
	public static void profileprint(String arg)  {
		synchronized (Profie.class) {
			System.out.println(Thread.currentThread().getName() + " is in "
					+ arg);
			
		}

	}
}

class Thread1 extends Thread {
	public Thread1(Profie p) {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		Profie.profileprint("arttha");
	}
}

class Thread2 extends Thread {
	public Thread2(Profie p) {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		Profie.profileprint("automation");

	}
}

class Thread3 extends Thread {
	public Thread3(Profie p) {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		Profie.profileprint("Oracle");
	}
}

class Thread4 extends Thread {
	public Thread4(Profie p) {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		Profie.profileprint("SalesForce");
	}
}

public class StaticSyncDemo {
	public static void main(String[] args) {
		Profie p = new Profie();
		Thread1 t1 = new Thread1(p);
		Thread2 t2 = new Thread2(p);
		Thread3 t3 = new Thread3(p);
		Thread4 t4 = new Thread4(p);
		t1.setName("Nitin");
		t2.setName("Vinayak");
		t3.setName("Rachna");
		t4.setName("Nasa");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
