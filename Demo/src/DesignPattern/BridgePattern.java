package DesignPattern;


// abstraction
interface Assistance {
	void wakeVia();
}

//Refine abstraction
class GoogleAssistance implements Assistance {

	@Override
	public void wakeVia() {
		System.out.println("ok google");

	}

}
//Refine abstraction
class SiriAssistance implements Assistance {

	@Override
	public void wakeVia() {
		System.out.println("heySiri");

	}

}

class AlexaAssistance implements Assistance {

	@Override
	public void wakeVia() {
		System.out.println("alexa");
	}
}

//abstraction
interface Charger {
	void type();
}

//Refine abstraction
class Wired implements Charger {

	@Override
	public void type() {
		System.out.println("wired charger");

	}

}

//Refine abstraction
class Wireless implements Charger {

	@Override
	public void type() {
		System.out.println("wireless charger");

	}

}


//Implementor for bridge pattern
abstract class AbstractPhone {
	Assistance assistance;
	Charger charger;

	AbstractPhone(Assistance assistance, Charger charger) {
		this.assistance = assistance;
		this.charger = charger;
	}

	abstract void basicFeatures();
}


//Concrete implementation
class Nokia extends AbstractPhone {

	Assistance assistance;
	Charger charger;

	Nokia(Assistance assistance, Charger charger) {
		super(assistance, charger);
		this.assistance = assistance;
		this.charger = charger;

		// TODO Auto-generated constructor stub
	}

	@Override
	void basicFeatures() {
		System.out.println("Nokia basic feature is it will always have big battery");

	}

}


//Concrete implementation
class Samsung extends AbstractPhone {
	Assistance assistance;
	Charger charger;

	Samsung(Assistance assistance, Charger charger) {
		super(assistance, charger);
		this.assistance = assistance;
		this.charger = charger;

		// TODO Auto-generated constructor stub
	}

	@Override
	void basicFeatures() {
		System.out.println("Samsung basic feature is it will always have great display");

	}

}


//Concrete implementation
class Vivo extends AbstractPhone {

	Assistance assistance;
	Charger charger;

	Vivo(Assistance assistance, Charger charger) {
		super(assistance, charger);
		this.assistance = assistance;
		this.charger = charger;

		// TODO Auto-generated constructor stub
	}

	@Override
	void basicFeatures() {
		System.out.println("Vivo always have great camara");
		assistance.wakeVia();
		charger.type();
	}

}

public class BridgePattern {

	public static void main(String[] args) {
		AbstractPhone phone = new Vivo(new GoogleAssistance(), new Wired());
		phone.basicFeatures();

	}

}

//The implementation of bridge design pattern follows the notion to prefer Composition over inheritance.

//Advantages
//Allows independent development of the components’ features
//Promotes the introduction of layers into a system
//Provides a good solution for cross-platform development.
//
//
//The Bridge design pattern separates an abstraction from its implementation so that the two can vary independently from each other.
//In this case, the abstraction uses another abstraction as its implementation instead of using the implementation directly
//
//
//example we dont have a Nokia wirless charging phone 
//Nokia phone + wireless is a featured added , not tightly coupled
//
//
//
//Bridge pattern decouples an abstraction(Assistance) and implementation elements(nokia,vivo) of a class by
//creating two separate class hierarchies to change independently,
//whereas an Adapter pattern helps two incompatible classes to work together.
//
//
//
//abstraction:The abstraction we started off with. (Charger)
//Refined Abstraction:This extends the original abstraction and has more features than the original abstraction. (Wired)
//Implementor:This is the interface that defines the interface for the implementation classes. (phone)
//ConcreteImplementor:This is the class that implements the Implementor interface and knows how to instantiate the abstraction. (nokia)
//
//
//Use the Bridge pattern when you want to divide and organize a monolithic class that has several variants of some functionality
//
//Use the pattern when you need to extend a class in several orthogonal (independent) dimensions.
//
//Use the Bridge if you need to be able to switch implementations at runtime.
//
//
//Open/Closed Principle. You can introduce new abstractions and implementations independently from each other.
//Single Responsibility Principle. You can focus on high-level logic in the abstraction and on platform details in the implementation.