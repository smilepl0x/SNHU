
public class Monkey extends RescueAnimal {
	
	// Instance variables
	private float tailLength;
	private float height;
	private float bodyLength;
	private float torso;
	private float skull;
	private float neck;
	private String species;
	
	// Constructor
	public Monkey() {	
	}
	
	// Accessors
	public float getTailLength() {
		return tailLength;
	}
	
	public float getHeight() {
		return height;
	}
	
	public float getBodyLength() {
		return bodyLength;
	}
	
	public float getTorso() {
		return torso;
	}
	
	public float getSkull() {
		return skull;
	}
	
	public float getNeck() {
		return neck;
	}
	
	public String getSpecies() {
		return species;
	}
	
	// Mutators
	public void setTailLength(float tailLength) {
		this.tailLength = tailLength;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public void setBodyLength(float bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	public void setTorso(float torso) {
		this.torso = torso;
	}
	
	public void setSkull(float skull) {
		this.skull = skull;
	}
	
	public void setNeck(float neck) {
		this.neck = neck;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	// Print method
	@Override
	public void printAll() {
		super.printAll();
		System.out.println("Tail Length: " + tailLength);
		System.out.println("Height: " + height);
		System.out.println("Body Length: " + bodyLength);
		System.out.println("Torso: " + torso);
		System.out.println("Skull: " + skull);
		System.out.println("Neck: " + neck);
		System.out.println("Species: " + species);
	}

}
	
