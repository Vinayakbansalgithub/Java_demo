package DesignPattern;

abstract class AbstactBangles {

	abstract int getDiameter();

	abstract int getWeight();

	abstract String getColor();
}

class AbstractGlassBangles extends AbstactBangles {

	private int diameter;
	private int weight;
	private String color;

	@Override
	public int getDiameter() {
		// TODO Auto-generated method stub
		return diameter;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	public AbstractGlassBangles(int diameter, int weight, String color) {
		super();
		this.diameter = diameter;
		this.weight = weight;
		this.color = color;
	}

	@Override
	public String toString() {
		return "GlassBangles [diameter=" + diameter + ", weight=" + weight + ", color=" + color + "]";
	}

}

class AbstractMetalBangles extends AbstactBangles {

	private int diameter;
	private int weight;
	private String color;

	public AbstractMetalBangles(int diameter, int weight, String color) {
		super();
		this.diameter = diameter;
		this.weight = weight;
		this.color = color;
	}

	@Override
	public int getDiameter() {
		// TODO Auto-generated method stub
		return diameter;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

}

abstract class AbstactSupplier {

	abstract String getCountry();

	abstract int quantity();

}

class FzdSupplier extends AbstactSupplier {
	private String country;
	private int quantity;

	public FzdSupplier(String country, int quantity) {
		super();
		this.country = country;
		this.quantity = quantity;
	}

	@Override
	String getCountry() {
		// TODO Auto-generated method stub
		return country;
	}

	@Override
	int quantity() {
		// TODO Auto-generated method stub
		return quantity;
	}

}

class JaipurSuppliar extends AbstactSupplier {
	private String country;
	private int quantity;

	public JaipurSuppliar(String country, int quantity) {
		super();
		this.country = country;
		this.quantity = quantity;
	}

	@Override
	String getCountry() {
		// TODO Auto-generated method stub
		return country;
	}

	@Override
	int quantity() {
		// TODO Auto-generated method stub
		return quantity;
	}

}

interface AbstractFactory {

	public AbstactBangles createBangles(String type, int diameter, int weight, String color);

	public AbstactSupplier createSuppliar(String type, String country, int quantity);

}

class AbstractsBanglesFactory implements AbstractFactory {

	@Override
	public AbstactBangles createBangles(String type, int diameter, int weight, String color) {
		// TODO Auto-generated method stub
		if (type.equalsIgnoreCase("glass")) {
			return new AbstractGlassBangles(diameter, weight, type);
		} else if (type.equalsIgnoreCase("metal")) {
			return new AbstractMetalBangles(diameter, weight, type);
		}
		return null;
	}

	@Override
	public AbstactSupplier createSuppliar(String type, String country, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

}

class AbstractSupplierFactory implements AbstractFactory {

	@Override
	public AbstactBangles createBangles(String type, int diameter, int weight, String color) {

		return null;
	}

	@Override
	public AbstactSupplier createSuppliar(String type, String country, int quantity) {
		// TODO Auto-generated method stub
		if (type.equalsIgnoreCase("fzd")) {
			return new FzdSupplier("IND", 500000);
		} else if (type.equalsIgnoreCase("jaipur")) {
			return new JaipurSuppliar("IND", 10000);
		}
		return null;
	}

}

class FactoryCreator {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("bangles")) {
			return new AbstractsBanglesFactory();
		} else if (choice.equalsIgnoreCase("suppliar")) {
			return new AbstractSupplierFactory();
		}
		return null;
	}
}

public class AbstractFactoryMain {
	public static void main(String[] args) {
		
		AbstractFactory factory=FactoryCreator.getFactory("bangles");
		AbstactBangles bangleFactory =factory.createBangles("glass", 3, 8, "red");
		AbstactSupplier suplierFactory =factory.createSuppliar("fzd", "IND", 6783977);
		
	}

}
