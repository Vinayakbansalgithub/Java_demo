package Enum;

class Test {
	static Cars cars;

	 enum Cars {
		honda, maruti, bmw, audi, tata
	}

	Test(Cars cars) {
		this.cars = cars;
	}

	Cars getCars() {
		return cars;
	}

}

interface CarColor {
	static enum color {
		red, black, gray
	};
}

public class EnumInheret extends Test implements CarColor {
	enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	Day day;
	private color Testcolor;

	// cars car;

	public color getTestcolor() {
		return Testcolor;
	}

	public void setTestcolor(color Testcolor) {
		this.Testcolor = Testcolor;
	}

	public EnumInheret(Day day) {
		super(cars);
		this.day = day;
	}

	EnumInheret() {
		super(cars);
		// TODO Auto-generated constructor stub
	}

	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY: {
			System.out.println("Mondays.");
			break;
		}
		case FRIDAY:
			System.out.println("Fridays weekend is comming");
			break;

		default:
			System.out.println("Midweek :(");
			break;
		}
	}

	public static void main(String[] args) {
		EnumInheret firstDay = new EnumInheret(Day.MONDAY);
		firstDay.tellItLikeItIs();
		EnumInheret tues = new EnumInheret(Day.TUESDAY);
		EnumInheret fifthDay = new EnumInheret(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		Test carref = new Test(cars.audi);
		System.out.println(carref.getCars());
		EnumInheret findcolor = new EnumInheret();
		findcolor.setTestcolor(color.gray);
		System.out.println(findcolor.getTestcolor());
	}
}
