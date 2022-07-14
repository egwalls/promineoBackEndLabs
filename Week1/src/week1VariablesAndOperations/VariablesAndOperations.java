package week1VariablesAndOperations;

public class VariablesAndOperations {

	public static void main(String[] args) {
		//create a variable to hold the quantity of available plane seats left on a flight
		
		int availableSeats = 86;

		//create a variable to hold the cost of groceries at checkout
		
		double groceryCost = 92.52;
		
		//create a variable to hold a person's middle initial
		
		char middleInitial = 'G';
		
		//create a variable to hold true it if it's hot outside and false if it's cold outside
		
		boolean isHotOut = true;
		
		//create a variable to hold a customer's first name
		
		String firstName = "Peter";
		//create a variable to hold a street address
		
		String streetAddress = "123 Main Street";
		
		//print all variables to the console
		
		System.out.println("There are " + availableSeats + " available seats.");
		System.out.println("Total grocery cost: $" + groceryCost);
		System.out.println("Middle initial is: " +middleInitial);
		System.out.println("Is it hot out? " + isHotOut);
		System.out.println("Customer first name is: " + firstName);
		System.out.println("The street address is " + streetAddress);
		
		//variable modifications
		availableSeats -= 2;
		System.out.println("\nNow there are " + availableSeats + " available seats.");
		groceryCost += 2.15;
		System.out.println("The total for groceries is now $" + groceryCost);
		middleInitial = 'B';
		System.out.println("New middle initial is: " + middleInitial);
		isHotOut = !isHotOut;
		System.out.println("Is it hot out now? " + isHotOut);
		String fullName = firstName + " " + middleInitial + " Parker";
		System.out.println("The customer, " + fullName + ", lives at " + streetAddress);
		
	}

}
