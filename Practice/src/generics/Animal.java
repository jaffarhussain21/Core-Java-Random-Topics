package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ad = new Dog();
		Animal a = new Animal();
		Dog d = new Dog();

		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Animal());
		List<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog());

		d.doSomething(animalList);

		Map<String, Integer> myMap = new HashMap<String, Integer>();
		// d.doSomething(dogList);

		System.out.println(a instanceof Animal);
		System.out.println(d instanceof Animal);
		System.out.println(ad instanceof Animal);
		System.out.println(a instanceof Dog);
		System.out.println(d instanceof Dog);
		System.out.println(ad instanceof Dog);
	}

	// ? extends Animal

}

class Dog extends Animal {
	
	Belt belt = new Belt();
	belt.getBelt();
	
	public void doSomething(List<Animal> animalList) {
		System.out.println(animalList);
	}
}
