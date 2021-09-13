package ThreadPackage;

public class Join implements Runnable {

	public static void main(String[] args) {

		Thread t = new Thread(new Join());
		t.start();
		System.out.println("begin");
		try {
			t.yield();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run");

	}

}
