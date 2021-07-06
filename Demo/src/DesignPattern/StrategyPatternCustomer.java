package DesignPattern;

interface PaymentAlgo {
	void Algorithm();
}

class CODStrategy implements PaymentAlgo {
	public void Algorithm() {
		System.out.println("payment is COD");
	}
}

class CreditCardStrategy implements PaymentAlgo {
	public void Algorithm() {
		System.out.println("payment is creditcard");
	}
}

class DebitCardStrategy implements PaymentAlgo {
	public void Algorithm() {
		System.out.println("payment is DebitCard");
	}
}

class PaymentAlgoContext {
	private PaymentAlgo _strategy;

	public PaymentAlgoContext(PaymentAlgo strategy) {
		_strategy = strategy;
	}

	public void ContextInterface() {
		_strategy.Algorithm();
	}
}

public class StrategyPatternCustomer {
	public static void main(String[] args) {
		PaymentAlgoContext context;
		context = new PaymentAlgoContext(new CreditCardStrategy());
		context.ContextInterface();
		context = new PaymentAlgoContext(new CODStrategy());
		context.ContextInterface();
	}

}
//The most important elements in implementing this pattern are:
//
//    The Context class, which has a very similar operation as in the State pattern, stores the object of the algorithm class, 
//    overwrites it and changes it when we want to act on another algorithm.
//    
//    Interface Interface that has defined methods needed for all algorithms.
//    
//    ConcreteStrategy classes inheriting from the Interface interface that implement specific algorithms.

//
//
//Use the Strategy pattern when you want to use different variants of an 
//algorithm within an object and be able to switch from one algorithm to another during runtime.
//
//
//
//Use the Strategy when you have a lot of similar classes that only differ in the way they execute some behavior. (wallet/debit)
//
//
//
//Use the pattern to isolate the business logic of a class from the implementation details of algorithms 
//that may not be as important in the context of that logic.  (order has nothing to do with type of paymnt)
//
//
//Use the pattern when your class has a massive conditional operator that switches between different variants of the same algorithm.
//
//
//You can swap algorithms used inside an object at runtime.
//You can isolate the implementation details of an algorithm from the code that uses it.
//You can replace inheritance with composition.
//Open/Closed Principle. You can introduce new strategies without having to change the context.
