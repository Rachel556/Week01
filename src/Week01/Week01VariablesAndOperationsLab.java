
package Week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		

		int seatsLeft = 3;
		// 2. Create a variable to hold the cost of groceries at checkout

		double groceryCost = 35.62;
		// 3. Create a variable to hold a person's middle initial
char middleInitial = 'R';

		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
int hot = 90;

	

		// 5. Create a variable to hold a customer's first name

		String firstName = "Rachel";
		// 6. Create a variable to hold a street address
		String streetAddress = "150 Main St";

		// 7. Print all variables to the console
	System.out.println(seatsLeft);
	System.out.println(groceryCost);
	System.out.println(middleInitial);
	System.out.println(firstName);
	

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
	seatsLeft = seatsLeft - 2;

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
      groceryCost = groceryCost + 2.15;

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		char middleInitial2 = 'D';

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
boolean hotOutside = hot == 20;

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
	
String lastName = "Williams";
		String fullName = firstName + " " + middleInitial2 + " " + lastName;  
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable

		String introduction = "This is our customer" + " " + fullName + ", and they live at" + " " + streetAddress; 
		
		System.out.println(seatsLeft);
		System.out.println(groceryCost);
		System.out.println(middleInitial2);
		System.out.println(hotOutside);
		System.out.println(fullName);
		System.out.println(introduction);
	}


}
