
public class BooleanConditionalLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a variable named age and assign it a value of 14
		int age = 14;
		
		// print the boolean expression age >=16 to the console and note the results.
		// change the value of age to 18 and run again.
		System.out.println(age >= 16);
		age = 18;
		System.out.println(age >= 16);
		
		// using a conditional, print "You can drive" if age greater than or equal to 16
		// and "You cannot drive" otherwise
		// change the value of age and rerun to see the result
		boolean hasLicense = false;
		if (age >=16 && hasLicense) {
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}
		
		// add a new variable called hasLicense before the conditional
		// change the boolean expression in the conditional to additionally include the need for hasLicense to be true
		// try change the values of age and hasLicense and note the different results
		
		// create two new variables costOfMilk and thirstLevel
		// create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50
		// or if thirstLevel is greater than 6 and prints "No Thanks" otherwise
		// change the values and note the different results
		double costOfMilk = 10.25;
		int thirstLevel = 7;
		
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please");
		} else {
			System.out.println("No Thanks");
		}
		
		// create two variables called numberOfCookies and numberOfChildren
		// you will eventually distribute all of the cookies to the children and as the adult
		// you get to keep the remaining cookies to yourself
		// use a conditional to print the following based on the following conditions:
		// if there are 0 cookies remaining, print "Sad Face"
		// if there are less than 2 cookies, print "Yes!"
		// if there are less than 5 cookies, print "Whoohoooo!"
		// if there are 5 or more cookies, print "Jackpot!"
		
		int numberOfCookies = 97;
		int numberOfChildren = 7;
		
		if (numberOfCookies % numberOfChildren == 0) {
			System.out.println("Sad Face");
		} else if (numberOfCookies % numberOfChildren <= 2) {
			System.out.println("Yes!");
		} else if (numberOfCookies % numberOfChildren <= 5) {
			System.out.println("Whoohoooo!");
		} else {
			System.out.println("Jackpot!");
		}
		
		// create a variable called loyaltyMemberStatus and assign the value "SILVER"
		// create a variable called loyaltyMemberDiscount and assign the value 0.0
		// using a switch, set the value of loyaltyMemberDiscount based on the following loyaltyMemberStatus scale
		// SILVER is 0.10, GOLD is 0.15 and PLATINUM is 0.25
		
		String loyaltyMemberStatus = "GOLD";
		double loyaltyMemberDiscount = 0.0;
		
		switch(loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberDiscount = 0.10;
				break;
			
			case "GOLD":
				loyaltyMemberDiscount = 0.15;
				break;
				
			case "PLATINUM":
				loyaltyMemberDiscount = 0.25;
				break;
		}
		
		System.out.println(loyaltyMemberDiscount);
		
		// create a variable called billTotal and assign a value
		// create a variable called adjustedTotal and assign it the billTotal minus the loyaltyMemberDiscount percent of the billTotal
		// if the adjustedBillTotal is greater that $500, upgrade the loyaltyMemberStatus from SILVER TO GOLD or GOLD TO PLATINUM
		double billTotal = 1472.29;
		double adjustedBillTotal = billTotal - (billTotal*loyaltyMemberDiscount);
		System.out.println(adjustedBillTotal);
		
		if (adjustedBillTotal >= 500) {
			if (loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus = "GOLD";
			} else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM";
			}
		}
		
		System.out.println(loyaltyMemberStatus);
		
		// create two variables, username and password
		// create a conditional that print "login successful" if the username is "Tommy123" and the password is "12345"
		// otherwise print "access denied"
		String username = "Tommy123";
		String password = "12345";
		
		if (username.equals("Tommy123") && password.equals("12345")) {
			System.out.println("login successful");
		} else {
			System.out.println("access denied");
		}
		
		// write a for loop that prints each number from 0 to 9
		for ( int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// write a for loop that prints each number from 10 to 0 backwards
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		} 
		
		// write a for loop that prints every other number from 0 to 100
		for (int i = 0; i <= 100; i += 2) {
			System.out.println(i);
			}
	
		
		// write a for loop that iterates from 0 to 100 and prints "EVEN" if the number is even and "ODD" if it's odd
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " EVEN");
			} else {
				System.out.println(i + " ODD");
			}
		}
		
		// write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		// divide each number by 3 and print the remainder to the console
		int i = 100;
		while (i >= 0) {
			System.out.println(i + " rem: " + i % 3);
			i--;
		}
		
		
	}

}
