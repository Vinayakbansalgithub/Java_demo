package DesignPattern;

public class LiskovSubstitutionPrinciple {
	public static void main(String[] args) {
		int a=100;
		int b= 185;
		int c= Math.abs(a-b);
		System.out.println(c);
	}

}


//https://www.baeldung.com/java-liskov-substitution-principle
//
//Liskov Substitution Principle (LSP) states that Objects in a program can be replaced by the instances of 
//their subtypes without modifying the correctness of a program.
//
//In other words, if A is subtype of B then instances of B may be replaced by the instances of A without altering the program correctness. 

//Liskov Substitution principle asks you to make sure that all child classes have the same behavior as the parent class. 
//for example: if you have a PrintText class and it has function printOnConsole() which print the text on console, 
//So you must make sure that the printOnConsole() method in all subclasses of the PrintText does the same job. 
//
//if any of the subclasses of  PrintText have another behavior inside printOnConsole() this is mean you broke the LSP .
//ISP (Interface Segregation): Asks you to create a different interface for different responsibilities, in other words, 
//don't group unrelated behavior in one interface, You break ISP if You have already an interface with many responsibilities, 
//and the implementor doesn't need all this stuff.