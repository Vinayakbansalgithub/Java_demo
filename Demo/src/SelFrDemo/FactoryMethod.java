package SelFrDemo;

public class FactoryMethod {
	private String fname, lname;

	public static FactoryMethod

	factoryMethod(String f, String l) {
		return null;

	}

	public static void main(String Args[]) {

		Class FactoryMethod;
		try {
			FactoryMethod = Class.forName("SelFrDemo.FactoryMethod");
			FactoryMethod instance3 = (FactoryMethod) FactoryMethod
					.newInstance();
			System.out.println("Instance Id=" + instance3.toString());
			FactoryMethod = Class.forName("SelFrDemo.FactoryMethod");
			FactoryMethod instance4 = (FactoryMethod) FactoryMethod
					.newInstance();
			System.out.println("Instance Id=" + instance4.toString());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		factoryMethod("vinayak", "bansal");

	}

}
