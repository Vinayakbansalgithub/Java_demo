package CollectionFramework;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class SimpleDate {
public static void main(String[] args) throws ParseException {
	Date date= new Date();

	System.out.println(date);
	
	String pagedate="22-oct-2017";
	
	
	SimpleDateFormat df= new SimpleDateFormat("MM-dd-yyyy");
	
	String d=df.format(date);
	System.out.println(d);
	
	
	
	
	Date d2=new SimpleDateFormat("dd-MMM-yyyy").parse(pagedate);
	
	System.out.println(d2);
	
	
	Calendar cal=Calendar.getInstance();
	System.out.println(cal.getTime());
	System.out.println("---s----s-"+cal.getTime().before(d2));
	cal.setTime(d2);
	
	System.out.println("---s----s-"+cal.getTime().before(d2));
System.out.println(cal.getTimeInMillis());




Calendar calendar = Calendar.getInstance();
calendar.setTimeInMillis(cal.getTimeInMillis());

int mYear = calendar.get(Calendar.YEAR);
int mMonth = calendar.get(Calendar.MONTH);
int mDay = calendar.get(Calendar.DAY_OF_MONTH);
int mHour = calendar.get(Calendar.HOUR_OF_DAY);
int mMinute = calendar.get(Calendar.MINUTE);


System.out.println(mYear+""+mMonth+"-"+mDay+"="+mHour+"-"+mMinute);

calendar.set(Calendar.YEAR,2);
calendar.set(Calendar.MINUTE,23);

System.out.println(calendar.getTime());
System.out.println(mYear+""+mMonth+"-"+mDay+"="+mHour+"-"+mMinute);

Locale loc= new Locale("Hi","IN");
System.out.println("----dd---"+DateFormat.getDateInstance(DateFormat.FULL, loc).format(date));


float curr=10.34f;

System.out.println(NumberFormat.getInstance(loc).format(curr));

Integer a=new Integer(1);
Integer b=new Integer(1);


System.out.println(a.equals(b));

	
}
}
