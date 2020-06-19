package SelFrDemo;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateDemo {
	public static void main(String... agrs) {

		Date date = new Date();
		System.out.println("todays date is  "+date);
		
		  SimpleDateFormat sdf= new SimpleDateFormat("yyyy.MM.dd");
		  
		  System.out.println(sdf.format(date));
		 

		// display time and date using toString()
	//	System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);

		//System.out.printf(" %2$tB %2$td, %2$tY", "Due date:", date);

	}
}