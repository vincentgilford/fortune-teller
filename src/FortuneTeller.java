import java.util.Scanner;

public class FortuneTeller {
	//git add.
	//git commit 
	//git push - do this often
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in); 
		
		System.out.println("What is your First Name");
		String firstName = input.nextLine(); 
		System.out.println("What is your Last Name");
		String lastName = input.nextLine();
		System.out.println("Please state your age:");
		int userAge = input.nextInt();  
		System.out.println("What is the month of your birth, Please enter in as #: (i.e November = 11)");
		int userMonth = input.nextInt(); 
		System.out.println("What is your favorite color of the Rainbow? Colors must be entered as ROYGBIV. Type Help for explanation");
		String userColor = input.nextLine(); //may change to char if needed
		Stirng userColorTest = userColor.trim();
		if (userColorTest.equalsIgnoreCase("help") || userColorTest.equalsIgnoreCase("h")){
			System.out.println("ROYGBIV - R = Red, O = Orange, Y= Yellow, G - Green, B = Blue, I = Indigo, and V = Violet");
			System.out.println("What is your favorite color of the Rainbow?");//make sure to use correct input when using data for fortune telling
			String userColor2 = input.nextLine();//NEW USER input
		}
		
		
		
		
		
		
		
	}

}
