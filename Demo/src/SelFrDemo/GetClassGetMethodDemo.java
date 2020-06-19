package SelFrDemo;

import java.lang.reflect.Method;

public class GetClassGetMethodDemo {
	public void print() {
		System.out.println("i am print");
	}

	public void add() {
		System.out.println("i m to add");
	}

	public void result() {
		System.out.println("i show result");
	}

	public static void main(String[] args) {
		GetClassGetMethodDemo cm = new GetClassGetMethodDemo();

		Method method[] = cm.getClass().getDeclaredMethods();
		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i]);

		}
	}
}