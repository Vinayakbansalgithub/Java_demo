package DesignPattern;

import java.io.PrintStream;

interface GreeterService {

	void greet(String name);
}

class Greeter implements GreeterService {

	private PrintStream target;

	public Greeter(PrintStream target) {
		this.target = target;
	}

	@Override
	public void greet(String name) {
		// TODO Auto-generated method stub
		target.println("Hello, World!");

	}
}

class FrenchGreeter implements GreeterService {

	@Override
	public void greet(String name) {
		// TODO Auto-generated method stub
		System.out.println("Bonjour");

	}
}

public class OpenClosedPrinciple {

}
// https://medium.com/@alexandre.malavasi/why-is-the-open-closed-principle-so-important-bed2f2a0d4c7

// factory pattern is a good example of open closed principal

// order payment type COD,CC,DC, paypal

/*
 * A class is closed, since it may be compiled, stored in a library, baselined,
 * and used by client classes. But it is also open, since any new class may use
 * it as parent, adding new features. When a descendant class is defined, there
 * is no need to change the original or to disturb its clients.
 */