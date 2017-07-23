package SDEt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Parking {
	String vehicleRegNo;
	String Intime;
	String OutTime;

	long timeDiff;
	Date dateofParking;
	int Amount;

	public String getVehicleRegNo() {
		return vehicleRegNo;
	}

	public void setVehicleRegNo(String vehicleRegNo) {
		this.vehicleRegNo = vehicleRegNo;
	}

	public long getTimeDiff() {
		return timeDiff;
	}

	public void setTimeDiff(long timeDiff) {
		this.timeDiff = timeDiff;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}

	Calendar calendar = Calendar.getInstance();
	int day = calendar.get(Calendar.DAY_OF_WEEK);

	public Parking(String vehicle, long min) {
		// TODO Auto-generated constructor stub

		vehicleRegNo = vehicle;
		timeDiff = min;
		if (min < 120) {
			if (day == Calendar.SUNDAY || day == Calendar.SATURDAY)
				Amount = 5;
			else
				Amount = 7;
		} else if (min > 120 && min <= 300) {

			if (day == Calendar.SUNDAY || day == Calendar.SATURDAY)
				Amount = 8;
			else
				Amount = 10;
		}

		else if (min > 300 && min <= 600) {

			if (day == Calendar.SUNDAY || day == Calendar.SATURDAY)
				Amount = 12;
			else
				Amount = 15;
		} else if (min > 600 && min <= 900) {

			if (day == Calendar.SUNDAY || day == Calendar.SATURDAY)
				Amount = 18;
			else
				Amount = 22;
		} else if (min > 900 && min <= 1440) {

			if (day == Calendar.SUNDAY || day == Calendar.SATURDAY)
				Amount = 25;
			else
				Amount = 30;
		}

	}

	@Override
	public String toString() {
		return "Parking [vehicleRegNo=" + vehicleRegNo + ", Time=" + timeDiff
				/ 60 + " hours and " + timeDiff % 60 + "  min" + ", Amount="
				+ Amount + "]";
	}

	public void entrance() {

	}

	public void exit(ResultSet   rs) throws SQLException
	
{

	System.out.println("total amount to be paid"+rs.getInt(2)+"  for  vehicle"+rs.getString(1));	
		
		
	}
}

public class ParkingLot {

	static long min;

	/*public ParkingLot(String vehicle, Instant startTime) {

		// TODO Auto-generated constructor stub
	}*/

	public static void main(String[] args) throws Exception {
		
		
		Scanner scan = new Scanner(System.in);

		


		
		System.out.print("Enter vehicle Reg. Number ");
		String vehicle = scan.nextLine();

		
		// example 04:30 AM
		System.out.print("Entry time (hh:mm aa): ");
		String Entrytime = scan.nextLine();
		System.out.println();
		System.out.print("Exit time (hh:mm aa): ");
		String ExitTime = scan.nextLine();

		DateFormat sdf = new SimpleDateFormat("hh:mm aa");
		Date d1 = sdf.parse(Entrytime);
		Date d2 = sdf.parse(ExitTime);

		System.out.println("Time: " + sdf.format(d1));
		System.out.println("Time: " + sdf.format(d2));
		if (d1.after(d2)) {
			long diffMs = d1.getTime() - d2.getTime();
			long diffSec = diffMs / 1000;
			min = diffSec / 60;
			long hour = min / 60;
			System.out.println("The difference is " + hour + " hours  ");
		}

		if (d1.before(d2)) {
			long diffMs = d2.getTime() - d1.getTime();
			long diffSec = diffMs / 1000;
			min = diffSec / 60;
			long hour = min / 60;

			System.out.println("The difference is " + hour + " hours  ");
		}

		Parking p1 = new Parking(vehicle, min);

		System.out.println("details for parking  "+p1);
		
		
		
		
		
		
		
		DatabaseUtlity dbObj= new DatabaseUtlity();
		dbObj.insertRecordIntoTable(p1.getAmount(),p1.getTimeDiff(),p1.getVehicleRegNo());
		
		
		PostParkingData postObj= new PostParkingData(p1.getAmount(),p1.getTimeDiff(),p1.getVehicleRegNo());
		
	int statusCode=	postObj.postData();
	
	if(statusCode==201){
		
		System.out.println("data successfully posted");
	}
	
	
	ResultSet   rs=dbObj.showDetails(p1.getVehicleRegNo());
		p1.exit(rs);
	
	
		
	}
}
