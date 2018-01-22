import java.util.Scanner;

public class FortuneTeller {
	// git add.
	// git commit
	// git push - do this often
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Part 1
		System.out.println("What is your First Name");
		String firstName = input.nextLine();
		if (firstName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter…");
			System.exit(0);
		}

		System.out.println("What is your Last Name");
		String lastName = input.nextLine();
		if (lastName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter…");
			System.exit(0);
		}

		System.out.println("Please state your age,");
		String check = input.nextLine(); // if statement if 0 is entered -->
											// Problem code

		if (check.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter…");
			System.exit(0);
		}
		int userAge = Integer.parseInt(check);

		System.out.println("What is the month of your birth, Please enter in as #, i.e November = 11");
		String check1 = input.nextLine();

		if (check1.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter…");
			System.exit(0);
		}
		int userMonth = Integer.parseInt(check1);

		System.out.println(
				"What is your favorite color of the Rainbow? Colors must range within the spectrum ROYGBIV. Type Help for explanation");
		String userColor = input.next();// nextLine
		if (userColor.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter…");
			System.exit(0);
		}
		
		
		if (userColor.toLowerCase().equals("help")) {
			System.out.println(
					"ROYGBIV - R = Red, O = Orange, Y= Yellow, G - Green, B = Blue, I = Indigo, and V = Violet");
			System.out.println("What is your favorite color of the Rainbow?");
			userColor = input.next(); // next()
			if (userColor.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter…");
				System.exit(0);
			}
		}
		

		
		input.nextLine();
		System.out.println("How many siblings do you have? Please enter an integer");// if
																						// statement
																						// needed
																						// to
																						// check
																						// if
																						// integer
																						// entered
		String check2 = input.nextLine();
		if (check2.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter…");
			System.exit(0);
		}
		int siblingsNum = Integer.parseInt(check2);

		

		// Part 2 - Conditions

		// Retirement years even or odd
		int retirementYr;

		if (userAge % 2 == 0) {
			retirementYr = 25; // even
		} else {
			retirementYr = 20;
		}

		
		String vacation;
		if (siblingsNum > 3) {
			vacation = "Branch, MI";
		} else if (siblingsNum == 3) {
			vacation = "Rochester, NY";
		} else if (siblingsNum == 2) {
			vacation = "Columbus, OH";
		} else if (siblingsNum == 1) {
			vacation = "New Orleans, LA";
		} else if (siblingsNum == 0) {
			vacation = "Atlanta, GA";
		} else {
			vacation = "Austin, TX";
		}

		// Mode of Transportation - favorite color roygbiv
		String transportation; 
		if (userColor.trim().equalsIgnoreCase("red") || userColor.trim().equalsIgnoreCase("r")) {
			transportation = "Jet";
		} else if (userColor.trim().equalsIgnoreCase("orange") || userColor.trim().equalsIgnoreCase("o")) {
			transportation = "Raptor";
		} else if (userColor.trim().equalsIgnoreCase("yellow") || userColor.trim().equalsIgnoreCase("y")) {
			transportation = "Dragon";
		} else if (userColor.trim().equalsIgnoreCase("green") || userColor.trim().equalsIgnoreCase("g")) {
			transportation = "Harley Davidson";
		} else if (userColor.trim().equalsIgnoreCase("blue") || userColor.trim().equalsIgnoreCase("b")) {
			transportation = "Aston Martin";
		} else if (userColor.trim().equalsIgnoreCase("indigo") || userColor.trim().equalsIgnoreCase("i")) {
			transportation = "Skateboard";
		} else if (userColor.trim().equalsIgnoreCase("violet") || userColor.trim().equalsIgnoreCase("v")) {
			transportation = "Flying Nimbus";
		} else {
			transportation = "IDK";
		}
		//

		// //bank balance 
		double account;
		if (4 >= userMonth && userMonth >= 1) {
			account = 1000000.00;
		} else if (8 >= userMonth && userMonth >= 5) {
			account = 600000.34;
		} else if (12 >= userMonth && userMonth >= 9) {
			account = 900000.89;
		} else {
			account = 2;
		}

		// //Display
		

		System.out.println(firstName + " " + lastName + " will retire in " + retirementYr + " with " + account
				+ " in the bank, a vacation home in " + vacation + " and travel by " + transportation);

	

	}

}
