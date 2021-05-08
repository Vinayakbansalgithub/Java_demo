package DesignPattern;

//There are three major issues with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.
//
//Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time, the type of arguments are same and from client side its hard to maintain the order of the argument.
//Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to send as NULL.
//If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing

class Engine {
	private final String engineName;
	private final int horsePower;
	private final int cylinders;

	public int getHorsePower() {
		return horsePower;
	}

//	public void setHorsePower(int horsePower) {
//		this.horsePower = horsePower;
//	}

	public int getCylinders() {
		return cylinders;
	}

//	public void setCylinders(int cylinders) {
//		this.cylinders = cylinders;
//	}

	public Engine(String engineName, int horsePower, int cylinders) {
		super();
		this.engineName = engineName;
		this.horsePower = horsePower;
		this.cylinders = cylinders;
	}

	public String getEngineName() {
		return engineName;
	}

//	public void setEngineName(String engineName) {
//		this.engineName = engineName;
//	}

	@Override
	public String toString() {
		return "Engine [horsePower=" + horsePower + ", cylinders=" + cylinders + "]";
	}

}

public class BuilderPatternCar {
	private final String brand;
	String name;
	private final int year;
	private final Engine engine;
	String Sterio;

	public String getSterio() {
		return Sterio;
	}

//	public void setSterio(String sterio) {
//		Sterio = sterio;
//	}

	public String getBrand() {
		return brand;
	}

//	public void setBrand(String brand) {
//		this.brand = brand;
//	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public int getYear() {
		return year;
	}

//	public void setYear(int year) {
//		this.year = year;
//	}

	public Engine getEngine() {
		return engine;
	}

//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}

	@Override
	public String toString() {
		return "BuilderPatternCar [brand=" + brand + ", name=" + name + ", year=" + year + ", engine=" + engine
				+ ", Sterio=" + Sterio + "]";
	}

	private BuilderPatternCar(BuilderPatternCarBuilder builderPatternCarBuilder) {
		// TODO Auto-generated constructor stub
		this.brand = builderPatternCarBuilder.brand;
		this.year = builderPatternCarBuilder.year;
		this.engine = builderPatternCarBuilder.engine;
		this.name = builderPatternCarBuilder.name;
		this.Sterio = builderPatternCarBuilder.Sterio;
	}

	// Builder Class
	public static class BuilderPatternCarBuilder {
final String brand;
		String name;
		final int year;
		Engine engine;

		String Sterio;

		public String getSterio() {
			return Sterio;
		}

//		public void setSterio(String sterio) {
//			Sterio = sterio;
//		}

		public String getBrand() {
			return brand;
		}

//		public void setBrand(String brand) {
//			this.brand = brand;
//		}

		public String getName() {
			return name;
		}

//		public void setName(String name) {
//			this.name = name;
//		}

		public int getYear() {
			return year;
		}

//		public void setYear(int year) {
//			this.year = year;
//		}

		public Engine getEngine() {
			return engine;
		}

//		public void setEngine(Engine engine) {
//			this.engine = engine;
//		}

		BuilderPatternCarBuilder(String brand, int year, Engine engine) {
			this.brand = brand;
			this.year = year;
			this.engine = engine;
		}

		public BuilderPatternCar build() {
			return new BuilderPatternCar(this);
		}

		@Override
		public String toString() {
			return "BuilderPatternCarBuilder [brand=" + brand + ", name=" + name + ", year=" + year + ", engine="
					+ engine + ", Sterio=" + Sterio + "]";
		}

	}

	public static void main(String[] args) {
		Engine engine = new Engine("ivtec", 98, 4);
		BuilderPatternCarBuilder builderObj = new BuilderPatternCar.BuilderPatternCarBuilder("Honda", 2011, engine);
		//builderObj.setName("city");
		BuilderPatternCar car = builderObj.build();
		System.out.println(car);
		//car.setBrand("BMW");
		System.out.println(car);


	}
}


//Use the Builder pattern to get rid of a “telescopic constructor”.
//Pizza(int size) { ... }
//Pizza(int size, boolean cheese) { ... }
//Pizza(int size, boolean cheese, boolean pepperoni) { ... }
//
//Use the Builder pattern when you want your code to be able to create different representations of some product  (car with and without Sterio)
//
//Use the Builder to construct complex objects.
//The Builder pattern lets you construct products step-by-step. You could defer execution of some steps without breaking the final product. You can even call steps recursively, which comes in handy when you need to build an object tree.
//
//A builder doesn’t expose the unfinished product while running construction steps. This prevents the client code from fetching an incomplete result.




