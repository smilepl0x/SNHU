public class Cruise {

    // Instance Variables
    private String cruiseName;
    private String cruiseShipName;
    private String departurePort;
    private String destination;
    private String returnPort;

    // Constructor - default
    Cruise() {
    }

    // Constructor - full
    Cruise(String tCruiseName, String tShipName, String tDeparture, String tDestination, String tReturn) {
        cruiseName = tCruiseName;
        cruiseShipName = tShipName;
        departurePort = tDeparture;
        destination = tDestination;
        returnPort = tReturn;
    }

    // Accessors
    public String getCruiseName() {
        return cruiseName;
    }

    public String getCruiseShipName() {
        return cruiseShipName;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    public String getDestination() {
        return destination;
    }

    public String getReturnPort() {
        return returnPort;
    }

    // Mutators
    public void setCruiseName(String tVar) {
        cruiseName = tVar;
    }

    public void setCruiseShipName(String tVar) {
        cruiseShipName = tVar;
    }

    public void setDeparturePort(String tVar) {
        departurePort = tVar;
    }

    public void setDestination(String tVar) {
        destination = tVar;
    }

    public void setReturnPort(String tVar) {
        returnPort = tVar;
    }
    
    // count spaces needed for proper formatting in print method
	private String countSpaces(String word) {
		int spaceCount;
		String spaces = "";
		spaceCount = 20 - word.length();

		for (int i = 1; i <= spaceCount; i++) {
			spaces = spaces + " ";
		}
		
		return spaces;
	}

    // print cruise details
    public void printCruiseDetails() {
        // complete this method
        System.out.println(cruiseName + countSpaces(cruiseName) +
                cruiseShipName + countSpaces(cruiseShipName) + departurePort + countSpaces(departurePort) +
                destination + countSpaces(destination) + returnPort + countSpaces(returnPort));
    }

    // method added to print ship's name vice memory address
    @Override
    public String toString() {
        return cruiseName;
    }
}
