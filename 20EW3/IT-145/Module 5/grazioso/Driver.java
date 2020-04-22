import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		// Databases
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		ArrayList<Monkey> monkeys = new ArrayList<Monkey>();
				
		//Scanner object
		Scanner scnr = new Scanner(System.in);
		
		// Instance variables
		String animal = "none";
		String response;

		// Create New Dog
		Dog dog = new Dog();

		// Create New Monkey
		Monkey monkey = new Monkey();

		// Method to process request for a rescue animal

		// Method(s) to update information on existing animals

		// Method to display matrix of animals based on location and status/training
		// phase

		// Method to add animals
		while ((animal.contentEquals("dog") == false) && animal.contentEquals("monkey") == false) {
			System.out.print("Enter animal type (dog/monkey) : ");
			animal = scnr.next().toLowerCase();
			System.out.println("");

			if (animal.contentEquals("dog")) {
				
				// Get info
				System.out.print("Enter name: ");
				dog.setName(scnr.next());
				System.out.println("");

				System.out.print("Enter type: ");
				dog.setType(scnr.next());
				System.out.println("");

				System.out.print("Enter gender: ");
				dog.setGender(scnr.next());
				System.out.println("");

				System.out.print("Enter age: ");
				dog.setAge(scnr.nextInt());
				System.out.println("");

				System.out.print("Enter weight: ");
				dog.setWeight(scnr.nextFloat());
				System.out.println("");
				
				System.out.print("Set breed: ");
				dog.setBreed(scnr.next());
				System.out.println("");

				System.out.print("Enter acquisition date (mm-dd-yyyy): ");
				dog.setAcquisitionDate(scnr.next());
				System.out.println("");

				System.out.print("Enter status date (mm-dd-yyyy): ");
				dog.setStatusDate(scnr.next());
				System.out.println("");

				System.out.print("Enter acquisition source: ");
				dog.setAcquisitionSource(scnr.nextLine());
				System.out.println("");

				System.out.print("Enter reservation status (true/false): ");
				dog.setReserved(scnr.nextBoolean());
				System.out.println("");
				
				// Display info and commit
				dog.printAll();
				
				response = "a";
				while ((response.contentEquals("y") == false) && (response.contentEquals("n") == false)) {
					System.out.print("Is this correct? (y/n) ");
					response = scnr.next();
					
					if (response.contentEquals("y") == true) {
						dogs.add(dog);
						System.out.print("Added " + dog.getName() + " to database!");
					} else {
						System.out.print("Please restart program and try again.");
					}
				}
				
			} else if (animal.contentEquals("monkey")) {

				System.out.print("Enter name: ");
				monkey.setName(scnr.next());
				System.out.println("");

				System.out.print("Enter type: ");
				monkey.setType(scnr.next());
				System.out.println("");

				System.out.print("Enter gender: ");
				monkey.setGender(scnr.next());
				System.out.println("");

				System.out.print("Enter age: ");
				monkey.setAge(scnr.nextInt());
				System.out.println("");

				System.out.print("Enter weight: ");
				monkey.setWeight(scnr.nextFloat());
				System.out.println("");
				
				System.out.print("Set tail length: ");
				monkey.setTailLength(scnr.nextFloat());
				System.out.println("");
				
				System.out.print("Set height: ");
				monkey.setHeight(scnr.nextFloat());
				System.out.println("");
				
				System.out.print("Set body length: ");
				monkey.setBodyLength(scnr.nextFloat());
				System.out.println("");
				
				System.out.print("Set torso: ");
				monkey.setTorso(scnr.nextFloat());
				System.out.println("");

				System.out.print("Set skull: ");
				monkey.setSkull(scnr.nextFloat());
				System.out.println("");
				
				System.out.print("Set neck: ");
				monkey.setNeck(scnr.nextFloat());
				System.out.println("");
				
				System.out.print("Set species: ");
				monkey.setSpecies(scnr.next());
				System.out.println("");
				
				System.out.print("Enter acquisition date (mm-dd-yyyy): ");
				monkey.setAcquisitionDate(scnr.next());
				System.out.println("");

				System.out.print("Enter status date (mm-dd-yyyy): ");
				monkey.setStatusDate(scnr.next());
				System.out.println("");

				System.out.print("Enter acquisition source: ");
				monkey.setAcquisitionSource(scnr.next());
				System.out.println("");

				System.out.print("Enter reservation status (true/false): ");
				monkey.setReserved(scnr.nextBoolean());
				System.out.println("");
				
				// Display info and commit
				monkey.printAll();
				
				response = "a";
				while ((response.contentEquals("y") == false) && (response.contentEquals("n") == false)) {
					System.out.print("Is this correct? (y/n) ");
					response = scnr.next();
					
					if (response.contentEquals("y") == true) {
						monkeys.add(monkey);
						System.out.print("Added " + monkey.getName() + " to database!");
					} else {
						System.out.print("Please restart program and try again.");
					}
				}
			} else {
				continue;
			}
		}
		

		// Method to out process animals for the farm or in-service placement

		// Method to display in-service animals

		// Process reports from in-service agencies reporting death/retirement

	}
}
