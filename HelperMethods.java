
public class HelperMethods {
	
	//This should randomize the amount of requirements within the max and min range
	//This should also randomize the actual requirements
	public static int[] randomRequirementsGenerator(int numPossibleRequirements, int numRequirementsForThisDevice) {
		
		// Declare and initialize requirements array
		int[] requirements = new int[numRequirementsForThisDevice];
		
		// Randomly assigns each of the device's requirements
		for (int i=0; i < numRequirementsForThisDevice; i++) {
			requirements[i] = (int) (Math.random() * numPossibleRequirements);
		}
		
		// Returns the new list of random requirements
		return requirements;
	}
}
