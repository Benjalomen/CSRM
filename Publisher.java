
public class Publisher {

	// This is an array of the publisher device's published requirements
	int[] requirements;

	// Publisher device constructor
	// There should be a helper method that extracts requirements from the XML doc
	public Publisher(int[] listOfRequirements) {
		requirements = listOfRequirements;
	}
	
	// Returns the publisher device's requirements
	public int[] getRequirements() {
		return requirements;
	}

}
