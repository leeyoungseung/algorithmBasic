package objective.basic05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import objective.basic04.Animal;
import objective.basic04.Dog;
import objective.basic04.Person;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Happy", 3, "Akita");
		Person person = new Person("David", 20, "English");
		Cat cat = new Cat("Mike", 10, "KoreanShotHair");
		
		Map<String, Animal> map = new LinkedHashMap<String, Animal>();
		map.put("dog", dog);
		map.put("person", person);
		map.put("cat", cat);
		
		for (String key : map.keySet()) {
			Animal animal = map.get(key);
			animal.printName();
		}
		
		
		Animal animalInCat = map.get("cat");
		animalInCat.printName();
		animalInCat.getAge();
		// animalInCat.crying();
		
		
		Cat catFromAnimal = (Cat)animalInCat;
		catFromAnimal.crying();
		
	
		System.out.println("##########");
		
		map.put("animal", new Animal());
		for (String key : map.keySet()) {
			Animal animal = map.get(key);
            if (animal instanceof Dog) {
				System.out.println(key+"'s instanceof Dog");
				
			} else if (animal instanceof Person) {
				System.out.println(key+"'s instanceof Person");
				
			} else if (animal instanceof Cat) {
				System.out.println(key+"'s instanceof Cat");
				
			} else if (animal instanceof Animal) {
				System.out.println(key+"'s instanceof Animal");
				
			} 
		}
		
		
		
		
	}
}
