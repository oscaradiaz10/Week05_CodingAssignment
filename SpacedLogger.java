package Week05_CodingAssignment;

public class SpacedLogger implements Logger {
	
	// Create method to add a space between each character using StringBuilder class
	private StringBuilder addSpaces(String message) {
		
		StringBuilder spaceMessage = new StringBuilder(); // initialize the object
		for (char a : message.toCharArray()) { // Covert string to array of characters
			spaceMessage.append(a).append(" "); // sequence
		}
		return spaceMessage;
	}
	
	// Print message
	@Override
	public void log(String message) {
		System.out.println(addSpaces(message));
	}
	
	// Print error message
	@Override
	public void error(String message) {
		System.out.println("ERROR: " + addSpaces(message));
	}

}
 