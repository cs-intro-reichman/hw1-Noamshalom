// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
        // Read the three names and the total bill amount
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int total = Integer.parseInt(args[3]);

        // Divide the bill evenly among three diners
		double PerPerson = (double) total/3;

		// Round up the amount
		double bill = Math.ceil(PerPerson);

        // Print the message (in reverse order)
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + bill + " Shekels each.");

	  
	}
}
