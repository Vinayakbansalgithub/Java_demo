package SelFrDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class HeadfirstAnimalDemo {

	public static void main(String[] args) {
		/*
		 * HashMap<String, String> hm = new HashMap<String, String>();
		 * hm.put("vinayak", "IT"); hm.put("harshit", "CA"); hm.put("amol",
		 * "MBA");
		 * 
		 * 
		 * System.out.println("values of hashmap  "+hm);
		 * System.out.println("profession is   "+hm.get("amol"));
		 */
		System.out.println(".........start............");
		new HeadfirstAnimalDemo().call();

	}

	void call() {
		// HFAnimal[] animal={new Dog(),new Cat()};
		ArrayList<HFAnimal> animal = new ArrayList<HFAnimal>();
		ArrayList<Object> animalobject= new ArrayList<Object>();
		ArrayList<Dog> dog = new ArrayList<Dog>();
		ArrayList<Cat> cat= new ArrayList<Cat>();
		animal.add(new Dog());
		animal.add(new Dog());
		animal.add(new Cat());
		animal.add(new Tiger());
	
		// Dog[] dog={new Dog(), new Dog(),new Dog()};

		animalobject.add(new Dog());
		animalobject.add(new Dog());
		animalobject.add(new Tiger());
		animalobject.add(new Dog());
		
		
		
		dog.add(new Dog());
		dog.add(new Dog());
		
		cat.add(new Cat());
		cat.add(new Cat());
		
		List<?> objs=cat;
		
		
		takeAnimal(animal);
		takeAnimal(dog);
		takeAnimal(animalobject);

	}

	// void takeAnimal(HFAnimal[] animal)
	public <T extends Object> void takeAnimal(ArrayList<T> animal) {
		for (Object hfAnimal : animal) {
			((HFAnimal) hfAnimal).eat();
			
		}

	}

	/*
	 * void takeDog(ArrayList<Dog> dog) { for (Dog dd : dog) { dd.eat(); }
	 * 
	 * 
	 * 
	 * }
	 */
}
