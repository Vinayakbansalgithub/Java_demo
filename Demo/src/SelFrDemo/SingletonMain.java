package SelFrDemo;

import java.util.Calendar;
import java.util.Date;

public class SingletonMain {
	public static void main(String[] args) {

		Date date= new Date();
		System.out.println(date);
				
		Calendar can= Calendar.getInstance();

		System.out.println(can.getTime());
		SingletonClass object = SingletonClass.getInstance();
		object.print();
	}

}
