package DesignPattern;

class PhoneFacade {
	public void makeSound() {
		System.out.println("makeSound");

	}

	public void StartEngine() {
		System.out.println("StartEngine");
	}

	public void StartInternet() {
		System.out.println("StartInternet");
	}

	public void ActivateDisplay() {
		System.out.println("ActivateDisplay");
	}

	public void showHomeScreen() {
		System.out.println("showHomeScreen");
	}

	public void reduceBrightness() {
		System.out.println("reduceBrightness");
	}

	public void turnOffHeavyApps() {
		System.out.println("turnOffHeavyApps");
	}
}

class Facade {
	PhoneFacade ph;

	public Facade(PhoneFacade ph) {
		// TODO Auto-generated constructor stub
		this.ph = ph;
	}

	void turnOnPhone() {
		System.out.println("turnOnPhone=======");

		ph.makeSound();
		ph.ActivateDisplay();
		ph.StartEngine();
		ph.StartEngine();
		ph.showHomeScreen();
	}

	void batterSave() {
		System.out.println("batterSave=======");
		PhoneFacade ph = new PhoneFacade();
		ph.reduceBrightness();
		ph.turnOffHeavyApps();
	}

}

public class FacadeMain {
	public static void main(String[] args) {

		PhoneFacade ph = new PhoneFacade();
		Facade phone = new Facade(ph);
		phone.turnOnPhone();

	}
}
//he Facade Pattern is a structural pattern that provides a simplified interface to a complex subsystem. 
//It is like when we turn on our smartphone, we just push one button and we ignore all the operations that have to be done behind.
//
//The goal of the Facade Pattern is to reduce coupling and complexity. However,
//a Facade doesn’t forbid us to access to the subsystem. We can also have multiple Facades for one subsystem.
//
//Use the Facade when you want to structure a subsystem into layers.
//
//Create facades to define entry points to each level of a subsystem. You can reduce coupling between multiple subsystems by requiring them to communicate only through facades.
//



