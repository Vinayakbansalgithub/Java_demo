package Enum;

public class EnumBasicDemo {
	enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	Day day;

	public EnumBasicDemo(Day day) {
		this.day = day;
	}

	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY: {
			System.out.println("Mondays 1st day.");
			break;
		}
		case FRIDAY:
			System.out.println("Fridays weekend is comming");
			break;

		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;

		default:
			System.out.println("Midweek days are ok.");
			break;
		}
	}

	public static void main(String[] args) {
		
		
		double a=63;
		double b=64;
		double c= a/b;
		System.out.println(c*100);
		c=c*100;
		
		double  calculated=Math.ceil(c);

		
		EnumBasicDemo firstDay = new EnumBasicDemo(Day.MONDAY);
		firstDay.tellItLikeItIs();
		EnumBasicDemo thirdDay = new EnumBasicDemo(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		EnumBasicDemo tues = new EnumBasicDemo(Day.TUESDAY);
		EnumBasicDemo fifthDay = new EnumBasicDemo(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumBasicDemo sixthDay = new EnumBasicDemo(Day.SATURDAY);
		sixthDay.tellItLikeItIs();
		EnumBasicDemo seventhDay = new EnumBasicDemo(Day.SUNDAY);
		seventhDay.tellItLikeItIs();
	}
}
