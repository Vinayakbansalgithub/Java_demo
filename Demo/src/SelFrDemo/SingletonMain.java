package SelFrDemo;

public class SingletonMain {
	public static void main(String[] args) {

		SingletonClass object = SingletonClass.getInstance();
		object.print();
	}

}
