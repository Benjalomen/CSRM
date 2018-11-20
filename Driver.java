

public class Driver {

	public static void main(String[] args) {
		
		// Set amount of possible types of requirements
		int numPossibleRequirements = 10;
		
		// Set the maximum amount of requirements that a device (User and Publisher) can have
		int maxNumDeviceRequirements = 3;
		
		// Set amount of publisher devices
		int numPublisherDevices = 5;
		
		// Set amount of user devices
		int numUserDevices = 1;
		
		
		///////////////////////////////////////////////////////////////////////
		
		// Create array of publishers and users
		Publisher[] myPublishers = new Publisher[numPublisherDevices]; 
		User[] myUsers = new User[numUserDevices];
		
		// Initialize new publisher array to Publisher devices with random requirements and then print our publisher's requirements
		for (int k = 0; k < numPublisherDevices; k++) {
			int[] temp = HelperMethods.randomRequirementsGenerator(numPossibleRequirements, maxNumDeviceRequirements);
			myPublishers[k] = new Publisher(temp);
			
			System.out.println("Publisher " + k + ": ");
			for (int l = 0; l < myPublishers[k].getRequirements().length; l++) {
				System.out.println(myPublishers[k].getRequirements()[l]);
			}
		}
		
		// Initialize new publisher array to User devices with random requirements and then print out publisher's requirements
		for (int j = 0; j < numUserDevices; j++) {
			int[] temp = HelperMethods.randomRequirementsGenerator(numPossibleRequirements, maxNumDeviceRequirements);
			myUsers[j] = new User(temp);
			
			System.out.println("User " + j + ": ");
			for (int l = 0; l < myPublishers[j].getRequirements().length; l++) {
				System.out.println(myPublishers[j].getRequirements()[l]);
			}
		}
				
		// Create a new Middleware device
		// Middleware myCSRM = new CSRM();
		
		///////////////////////////////////////////////////////////////////////

		//INITIATE THE SENDING AND MATCHING OF REQUIREMENTS!!!!
		
	}
}
