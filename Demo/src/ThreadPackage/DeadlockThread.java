package ThreadPackage;

public class DeadlockThread{
	String s1= "vinayak";
	String s2= "Mehul";
	Thread t1= new Thread(){
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true){
			synchronized (s1) {
				synchronized (s2) {
				System.out.println("mehul vinayak");	
				}
				
			}
			}
	}
	
	};
	Thread t2= new Thread(){
		@Override
		public void run() {
			while(true){
			// TODO Auto-generated method stub
			synchronized (s2) {
				synchronized (s1) {
				System.out.println(" vinayak mehul");	
				}
			}
			}
	}
	
	};
	public static void main(String[] args) {
		DeadlockThread obj= new DeadlockThread();
		obj.t1.start();	
		obj.t2.start();	
	}
	
	
}
