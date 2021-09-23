package DesignPattern;

interface Command {
	public abstract void execute();
}

class Order implements Command {
	private Chef chef;
	private String food;

	public Order(Chef chef, String food) {
		this.chef = chef;
		this.food = food;
	}

	@Override
	public void execute() {
		if (this.food.equals("Pasta")) {
			this.chef.cookPasta();
		} else {
			this.chef.bakeCake();
		}
	}
}


//invoker
class Waiter implements Command {
	private Order order;

	public Waiter(Order ord) {
		this.order = ord;
	}

	public void execute() {
		this.order.execute();
	}
}

// receiver
class Chef {

	public void cookPasta() {
		System.out.println("Chef is cooking Chicken Alfredo…");
	}

	public void bakeCake() {
		System.out.println("Chef is baking Chocolate Fudge Cake…");
	}
}

public class CommandDesignClient {
	public static void main(String[] args) {
		Chef chef = new Chef();
		Order order = new Order(chef, "Pasta");
		Waiter waiter = new Waiter(order);
		waiter.execute();
		order = new Order(chef, "Cake");
		waiter = new Waiter(order);
		waiter.execute();
	}
}
//What we need to implement is;
//
//An interface Command
//A class Order that implements Command interface
//A class Waiter (invoker)
//A class Chef (receiver)

//Remember the command pattern chain of events goes like this,
//the client -> the invoker -> the concrete command -> the receiver.

// https://bikas-katwal.medium.com/design-pattern-command-design-pattern-simplified-d3f062bfd5c7
// https://rahman-sameeha.medium.com/commanding-attention-the-design-pattern-61b6aaa21f12

//Use the Command pattern when you want to parametrize objects with operations.
//
//Use the Command pattern when you want to implement reversible operations.

//Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform these operations.
//Open/Closed Principle. You can introduce new commands into the app without breaking existing client code.
//You can implement undo/redo.
//You can implement deferred execution of operations.
//You can assemble a set of simple commands into a complex one.
