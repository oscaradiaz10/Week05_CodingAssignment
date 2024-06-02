package Week05_CodingAssignment;

public class App {

	public static void main(String[] args) {
		
		// Instantiate asteriskLogger
		Logger asteriskLogger = new AsteriskLogger();
		
		// Test log method
		asteriskLogger.log("Hello");
		
		// Test error method
		asteriskLogger.error("Hello");
		
		
		System.out.println("\n\n");
		
		
		// Instantiate spacedLogger
		Logger spacedLogger = new SpacedLogger();
		
		// Test log method
		spacedLogger.log("Hello");	
		
		// Test error method
		spacedLogger.error("Hello");

	}

}
