package SelFrDemo;

public class SingletonClass  {
	public static volatile SingletonClass singleobject;
	
// it is used so that its object cannot be created from outside class 
	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		if (singleobject == null) {
			synchronized (SingletonClass.class) {
				if (singleobject == null) {
					singleobject = new SingletonClass();
				}
			}

		}

		return singleobject;
	}

	void print() {
		System.out.println("we have created single object");
	}

	
}
