package DesignPattern;

interface Bangles {

	int getDiameter();

	int getWeight();

	String getColor();
}

class GlassBangles implements Bangles {

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

	public GlassBangles(int diameter, int weight, String color) {
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

class MetalBangles implements Bangles {

	private int diameter;
	private int weight;
	private String color;

	public MetalBangles(int diameter, int weight, String color) {
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

class BangleFactory {
	Bangles getBangleObject(String type, int diameter, int weight, String color) {
		if (type.equalsIgnoreCase("glass")) {
			return new GlassBangles(diameter, weight, type);
		} else if (type.equalsIgnoreCase("metal")) {
			return new MetalBangles(diameter, weight, type);
		}
		return null;
	}
}

public class Factory {
	public static void main(String[] args) {
		BangleFactory factory = new BangleFactory();

		Bangles factoryType = factory.getBangleObject("glass", 3, 8, "red");
		
		System.out.println(factoryType.getClass().getName());

		System.out.println(factoryType.toString());

	}

}
