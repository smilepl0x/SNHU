
public class Dog extends RescueAnimal {

	// Instance variable
	public String breed;

	// Constructor
	public Dog() {
	}

	// Accessor Method
	public String getBreed() {
		return breed;
	}

	// Mutator Method
	public void setBreed(String dogBreed) {
		breed = dogBreed;
	}
	
	// Print method
	@Override
	public void printAll() {
		super.printAll();
		System.out.println("Breed: " + breed);
	}

}
