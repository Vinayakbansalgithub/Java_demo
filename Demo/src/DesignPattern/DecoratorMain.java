package DesignPattern;

abstract class Pizza {
	abstract String description();

	abstract int cost();

}

class ThinCrust extends Pizza {

	@Override
	String description() {
		// TODO Auto-generated method stub
		return "thin crust pizza are usually soft and are rich is flavours, by the way invented in France ";
	}

	@Override
	int cost() {
		// TODO Auto-generated method stub
		return 99;
	}

	@Override
	public String toString() {
		return "ThinCrust [description()=" + description() + ", cost()=" + cost() + "]";
	}

}

class PanCrust extends Pizza {

	@Override
	String description() {
		// TODO Auto-generated method stub
		return "Pan pizza was started by PizzaHut in USA, famous because it remain hot for longer duration";
	}

	@Override
	int cost() {
		// TODO Auto-generated method stub
		return 120;
	}

	@Override
	public String toString() {
		return "PanCrust [description()=" + description() + ", cost()=" + cost() + "]";
	}

}

abstract class Decorator extends Pizza {
	Pizza pizza;

	abstract int cost();

	abstract String name();

	abstract String description();

}

class Cheese extends Decorator {

	Pizza pizza;
	int cost;
	String name;
	String description;

	public Cheese(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza = pizza;

	}

	@Override
	int cost() {
		// TODO Auto-generated method stub
		return pizza.cost() + 45;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return pizza.getClass().getName() + ", having Cheese";
	}

	@Override
	String description() {
		// TODO Auto-generated method stub
		return pizza.description() + ", with graded Cheese";

	}

}

class Olives extends Decorator {
	Pizza pizza;
	int cost;
	String name;
	String description;

	public Olives(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza = pizza;

	}

	@Override
	int cost() {
		// TODO Auto-generated method stub
		return pizza.cost() + 10;
	}

	@Override
	String name() {
		// TODO Auto-generated method stub
		return pizza.getClass().getName() + ", having Olives";
	}

	@Override
	String description() {
		// TODO Auto-generated method stub
		return pizza.description() + ", with mexican olives";

	}

}

public class DecoratorMain {

	public static void main(String[] args) {

		Pizza pizza = new ThinCrust();

		Pizza cheesepizza = new Cheese(pizza);

		Pizza olivespizza = new Olives(cheesepizza);

		System.out.println("cost: " + olivespizza.cost());
		System.out.println("description: " + olivespizza.description());

	}

}



//The decorator design pattern is one of the classic design patterns used to overcome 
//the recurring design problems in object-oriented software. It allows us to add functionality to an object dynamically. 
//By dynamically, we mean modifying the behaviour of an object at run time.
//
//Although we have used the term behaviour, but decorator design pattern falls in the category of 
//structural design pattern, because it has something to do with the way we structure our classes.
//
//There are a few bumpy areas in using inheritance to which the decorator design pattern provides an elegant solution.
//
//
//
//Use the Decorator pattern when you need to be able to assign extra behaviors to objects at runtime without 
//breaking the code that uses these objects.
//
//The Decorator lets you structure your business logic into layers, create a decorator for each layer and compose 
//objects with various combinations of this logic at runtime. The client code can treat all these objects in the same way, 
//since they all follow a common interface.
//
//Use the pattern when it’s awkward or not possible to extend an object’s behavior using inheritance.
//
//Many programming languages have the final keyword that can be used to prevent further extension of a class. 
//For a final class, the only way to reuse the existing behavior would be to wrap the class with your own wrapper, 
//using the Decorator pattern.
//
//
//
//
//
//You can extend an object’s behavior without making a new subclass.
//
//You can add or remove responsibilities from an object at runtime.
//
//You can combine several behaviors by wrapping an object into multiple decorators.
//
//Single Responsibility Principle. You can divide a monolithic class that implements many possible 
//variants of behavior into several smaller classes.










