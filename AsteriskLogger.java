package Week05_CodingAssignment;

public class AsteriskLogger implements Logger {

	// Log method implementation
	@Override
	public void log(String message) {
		
		// Print message
		System.out.println("***" + message + "***");
		
	}
	
	// Error method implementation
	@Override
	public void error(String message) {
		
		// Create error message
		String errorMessage = "Error: " + message;
		String boxed = "****************";
		
		// Print message with asterisks on top and bottom
		System.out.println(boxed);
		System.out.println("***" + errorMessage + "***");
		System.out.println(boxed);
	}

}
