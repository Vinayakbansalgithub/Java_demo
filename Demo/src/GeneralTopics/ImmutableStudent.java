package GeneralTopics;

class Address {
	String city;
	String country;

	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}

}

public final class ImmutableStudent implements Cloneable {

	// final int age;
	int age;
	String name;
	Address address;

	public ImmutableStudent(int age, String name, Address address) {
		super();
		this.age = age;
		this.name = name;
		this.address = new Address(address.city, address.country);
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return new Address(address.city, address.country);
	}

	@Override
	public String toString() {
		return "ImmutableStudent [age=" + age + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Address add = new Address("Fzd", "IND");

		ImmutableStudent obj = new ImmutableStudent(27, "Vinayak", add);
		System.out.println(obj);
		ImmutableStudent objRef = obj;

		Address refAdd = obj.getAddress();
		refAdd.city = "Noida";
		System.out.println(obj);

		ImmutableStudent obj2 = (ImmutableStudent) obj.clone();
		// obj.age = 111;
		add.city = "Old Delhi";
		System.out.println(obj2);
		System.out.println(obj);

	}
}
