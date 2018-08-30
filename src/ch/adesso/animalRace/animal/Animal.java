package ch.adesso.animalRace.animal;

import ch.adesso.animalRace.fan.Fan;


public class Animal {

	private AnimalType animalType;
	private String name;

	public Animal(AnimalType animalType, String name) {
		this.animalType = animalType;
		this.name = name;
	}
	
	public AnimalType getAnimalType() {
		return animalType;
	}

	public String getName() {
		return name;
	}

	public Fan getFan() {
		Fan fan = new Fan();
		fan.setAnimal(this);
		fan.setName("Fan of " + name);
		return fan;
	}

}
