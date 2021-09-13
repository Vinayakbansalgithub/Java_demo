package DesignPattern;

interface Sockit {

	public static final int i = 10000;

	int produceVolt();

}

class IndianSwitch implements Sockit {

	public static final int i = 10;

	@Override
	public int produceVolt() {
		return 240;
	}

}

class NorthAmericanSwitch implements Sockit {

	public static final int i = 100;

	@Override
	public int produceVolt() {
		return 120;
	}

}

interface Device {
	void device(String brand);

}

class Laptop implements Device {

	@Override
	public void device(String brand) {
		// TODO Auto-generated method stub
		System.out.println("device of brand/type " + brand);
	}

}

class Phone implements Device {

	@Override
	public void device(String brand) {
		// TODO Auto-generated method stub
		System.out.println("device of brand/type " + brand);
	}

}

class AdapterCharger implements Device {

	Sockit sockit;

	public AdapterCharger(Sockit sockit) {
		this.sockit = sockit;
	}

	@Override
	public void device(String device) {
		// TODO Auto-generated method stub
		int volt = 0;

		if (device.equalsIgnoreCase("phone") || device.equalsIgnoreCase("iphone") || device.equalsIgnoreCase("Nokia")) {
			new Phone().device(device);
			volt = sockit.produceVolt() / 4;

		} else if (device.equalsIgnoreCase("laptop") || device.equalsIgnoreCase("dell")
				|| device.equalsIgnoreCase("IBM")) {
			new Laptop().device(device);
			volt = sockit.produceVolt() / 2;

		}
		System.out.println(
				"Device  " + device + " Is charging at " + volt + "V" + " in " + sockit.getClass().getSimpleName());

	}

}

public class AdapterPattern {
	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		Sockit sockit = new NorthAmericanSwitch();
		AdapterCharger adapter = new AdapterCharger(sockit);
		adapter.device("laptop");

	}

}

//An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly.
//An Adapter wraps an existing class with a new interface so that it becomes compatible with the client’s interface.

//The main motive behind using this pattern is to convert an existing interface into another interface that the client expects. 
//It's usually implemented once the application is designed.
