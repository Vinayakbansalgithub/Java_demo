package DesignPattern;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		
		
		

	    
		Sockit sockit = new NorthAmericanSwitch();
		AdapterCharger adapter = new AdapterCharger(sockit);
		adapter.device("laptop");

	}

}
