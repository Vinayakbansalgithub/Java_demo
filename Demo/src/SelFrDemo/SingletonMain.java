package SelFrDemo;

import java.util.Calendar;
import java.util.Date;

import ThreadPackage.AtmWithdraw;

public class SingletonMain implements Runnable {
	static SingletonClass object;
	
	@Override
	public void run() {
		
		
		System.out.println("0000000000000000000");
		// TODO Auto-generated method stub
		 object =SingletonClass.getInstance();
	}
public static void main(String[] args) throws InterruptedException {
	

	/*char c = 062;
			//(char)-98;
	//int c = -98;
	
System.out.println(c);*/

		/*Date date= new Date();
		System.out.println(date);
				
		Calendar can= Calendar.getInstance();

		System.out.println(can.getTime());
		*/
	
	SingletonMain SingletonMain1= new SingletonMain();
	SingletonMain SingletonMain2= new SingletonMain();
	
	Thread mehul= new Thread(SingletonMain1,"mehul");
	Thread vinayak= new Thread(SingletonMain2,"vinayak");
	
	mehul.start();
	vinayak.start();
	vinayak.join();

//	SingletonClass object = SingletonClass.getInstance();
	//System.out.println(object);
	object.print();
	}



}
