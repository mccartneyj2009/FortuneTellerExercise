import java.util.Scanner;

public class main {

	public static String yearsToRetirement(int age) {
		int retirementAge = 65;
		if ((retirementAge - age) % 2 == 0) {
			return "10 years";
		} else if ((retirementAge - age) % 2 == 1) {
			return "25 years";
		} else {
			return ", you wont ever be able to retire... Sorry :(,";
		}
	}

	public static String vacationHomeLocation(int sibs) {
		if (sibs < 0) {
			return "Esperanza Base, Antarctica";
		} else if (sibs == 1) {
			return "Portland, Maine";
		} else if (sibs == 2) {
			return "Denver, Colorado";
		} else if (sibs == 3) {
			return "St. Thomas, U.S. Virgin Islands";
		} else if (sibs > 3) {
			return "Suva, Fiji";
		} else {
			return "You didn't enter an integer";
		}

	}

	public static String transportation(String color) {
		switch (color.toLowerCase()) {
		case "red":
			return "Bugatti Chiron";
		case "orange":
			return "Porche 911";
		case "yellow":
			return "Chrysler Minivan";
		case "green":
			return "Roller Skates";
		case "blue":
			return "Private Jet";
		case "indigo":
			return "Levitation";
		case "violet":
			return "Pink Bicycle";
		default:
			return "Not a ROYGBIV Color";
		}
	}

	public static String bankBalance(int birthMonth) {
		if (birthMonth < 5) {
			return "$10.00";
		} else if (birthMonth > 4 && birthMonth < 9) {
			return "$50,000.00";
		} else if (birthMonth > 8) {
			return "$100,500.00";
		} else {
			return "$0.00";
		}
	}
	
	public static void yourFortune(String firstName, String lastName, String retire, String bnkBal, String vacaLoc, String transport) {
		System.out.println(firstName + " " + lastName + " will retire in " + retire + " with " + bnkBal + " in the bank, "
				+ "a vacation home in " + vacaLoc + " , and travel by " + transport + ".");
	}
	
	public static void quitterProtocol(String abortCode) {
		if (abortCode.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		// User prompts
		Scanner input = new Scanner(System.in);
		System.out.println("Type \"Quit\" at anytime to exit program... If you dare...");
		System.out.println("What is your first name?");
		String fName = input.nextLine();
		quitterProtocol(fName);
		System.out.println("What is your last name?");
		String lName = input.nextLine();
		quitterProtocol(lName);
		String favColor;
		while (true) {
			System.out.println(
					"What is your favorite ROYGBIV Color? (Type the word \"Help\" for a description of ROYGBIV Colors.)");
			favColor = input.nextLine();
			quitterProtocol(favColor);
			if (favColor.toLowerCase().equals("help")) {
				System.out.println("ROYGBIV is a mnemonic device to help remember the colors of the rainbow.\n"
						+ "R - Red\n" + "O - Orange\n" + "Y - Yellow\n" + "G - Green\n" + "B - Blue\n" + "I - Indigo\n"
						+ "V - Violet\n");
			} else if (favColor.toLowerCase().equals("red")) {
				break;
			} else if (favColor.toLowerCase().equals("orange")) {
				break;
			} else if (favColor.toLowerCase().equals("yellow")) {
				break;
			} else if (favColor.toLowerCase().equals("green")) {
				break;
			} else if (favColor.toLowerCase().equals("blue")) {
				break;
			} else if (favColor.toLowerCase().equals("indigo")) {
				break;
			} else if (favColor.toLowerCase().equals("violet")) {
				break;
			} else {
				System.out.println("Not a valid color.");
			}
		}
		System.out.println("How old are you? (Provide integer from 0-100)");
		String age = input.nextLine();
		quitterProtocol(age);
		System.out.println("What month were you born? (Provide integer corresponding to your birth month from 1-12)");
		String birthMonth = input.nextLine();
		quitterProtocol(birthMonth);
		System.out.println("How many siblings do you have?");
		String noOfSibs = input.nextLine();
		quitterProtocol(noOfSibs);
		input.close();

		String retirement = main.yearsToRetirement(Integer.parseInt(age));
		String transport = main.transportation(favColor);
		String vacaHome = main.vacationHomeLocation(Integer.parseInt(noOfSibs));
		String bankBalance = main.bankBalance(Integer.parseInt(birthMonth));
		yourFortune(fName, lName, retirement, bankBalance, vacaHome, transport);
	}

}
