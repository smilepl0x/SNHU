public class RescueAnimal {

	// Instance variables
	private String name;
	private String type;
	private String gender;
	private int age;
	private float weight;
	private String acquisitionDate;
	private String statusDate;
	private String acquisitionSource;
	private Boolean reserved;

	private String trainingLocation;
	private String trainingStart;
	private String trainingEnd;
	private String trainingStatus;

	private String inServiceCountry;
	private String inServiceCity;
	private String inServiceAgency;
	private String inServicePOC;
	private String inServiceEmail;
	private String inServicePhone;
	private String inServicePostalAddress;

	// Constructor
	public RescueAnimal() {
	}

	// Add Accessor Methods here
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public float getWeight() {
		return weight;
	}

	public String getAcquisitionDate() {
		return acquisitionDate;
	}

	public String getStatusDate() {
		return statusDate;
	}

	public String getAcquisitionSource() {
		return acquisitionSource;
	}

	public Boolean getReserved() {
		return reserved;
	}

	public String getTrainingLocation() {
		return trainingLocation;
	}

	public String getTrainingStart() {
		return trainingStart;
	}

	public String getTrainingEnd() {
		return trainingEnd;
	}

	public String getTrainingStatus() {
		return trainingStatus;
	}

	public String getInServiceCountry() {
		return inServiceCountry;
	}

	public String getInServiceCity() {
    	return inServiceCity;
    }

	public String getInServiceAgency() {
		return inServiceAgency;
	}

	public String getInServicePOC() {
		return inServicePOC;
	}

	public String getInServiceEmail() {
		return inServiceEmail;
	}

	public String getInServicePhone() {
		return inServicePhone;
	}

	public String getInServicePostalAddress() {
		return inServicePostalAddress;
	}

	// Add Mutator Methods here
	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(float weight) {
    	this.weight = weight;
    }

	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public void setStatusDate(String statusDate) {
		this.statusDate = statusDate;
	}

	public void setAcquisitionSource(String acquisitionSource) {
		this.acquisitionSource = acquisitionSource;
	}

	public void setReserved(Boolean reserved) {
		this.reserved = reserved;
	}

	public void setTrainingLocation(String trainingLocation) {
		this.trainingLocation = trainingLocation;
	}

	public void setTrainingStart(String trainingStart) {
		this.trainingStart = trainingStart;
	}

	public void setTrainingEnd(String trainingEnd) {
		this.trainingEnd = trainingEnd;
	}

	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}

	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}

	public void setInServiceCity(String inServiceCity) {
    	this.inServiceCity = inServiceCity;
    }

	public void setInServiceAgency(String inServiceAgency) {
		this.inServiceAgency = inServiceAgency;
	}

	public void setInServicePOC(String inServicePOC) {
		this.inServicePOC = inServicePOC;
	}

	public void setInServiceEmail(String inServiceEmail) {
		this.inServiceEmail = inServiceEmail;
	}

	public void setInServicePhone(String inServicePhone) {
		this.inServicePhone = inServicePhone;
	}

	public void setInServicePostalAddress(String inServicePostalAddress) {
		this.inServicePostalAddress = inServicePostalAddress;
	}
	
	// Print method
	public void printAll() {
		System.out.println("Name: " + name);
		System.out.println("Type: " + type);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
		System.out.println("Acquisition Date: " + acquisitionDate);
		System.out.println("Status Date: " + statusDate);
		System.out.println("Acquisition Source: " + acquisitionSource);
		System.out.println("Reserved: " + reserved);
	}

}