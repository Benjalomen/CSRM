
public class User {

	// This is an array of the user device's requested service requirements
	int[] requirements;

	// Publisher device constructor
	// There should be a helper method that extracts requirements from the XML doc
	public User(int[] listOfRequirements) {
		requirements = listOfRequirements;
	}
	
	// Methods
	// Returns the user device's requested service requirements
	public int[] getRequirements() {
		return requirements;	
	}
}
