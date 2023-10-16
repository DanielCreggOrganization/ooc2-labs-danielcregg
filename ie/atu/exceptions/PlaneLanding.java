package ie.atu.exceptions;

public class PlaneLanding {
	public static void main(String[] args) {
		
		// Protect code by surrounding with try/catch block
		try {

			System.out.println("Code running to land plane...\n");

			// Fault in code
			int i = 10 / 0;
			
			System.out.println(i); // Never reach this line due to fault just above.
			
		} catch (Exception ex) {
			
			// Error handling code
			System.err.println("--------------------------------------------------------------------------------------");
			System.err.println("Faulted detected and is being handled... don't panic nobody is going to die");
			// Print out the stack trace
            ex.printStackTrace();
			System.err.println("--------------------------------------------------------------------------------------");

		} // End try/catch

		System.out.println("\nPlane finishes landing safely!");

	} // End main
} // End Class