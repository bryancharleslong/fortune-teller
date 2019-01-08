import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to Fortune Teller! Type \"Quit\" to end at any time");
		Scanner input = new Scanner(System.in);

		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		if (firstName.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		if (lastName.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

		System.out.println("What is your age?");
		String ageInput = null;
		boolean validInput = false;
		while (!validInput) {
			try {
				ageInput = input.nextLine();
				if (ageInput.toLowerCase().equals("quit")) {
					System.out.println("Nobody likes a quitter...");
					System.exit(0);
				}
				Integer.parseInt(ageInput);
				validInput = true;
			} catch (NumberFormatException e) {
				System.out.println("Please enter a whole number");
			}
		}
		int age = Integer.parseInt(ageInput);

		System.out.println("What is your birth month? (1-12)");
		String birthMonthInput = null;
		validInput = false;
		while (!validInput) {
			try {
				birthMonthInput = input.nextLine();
				if (birthMonthInput.toLowerCase().equals("quit")) {
					System.out.println("Nobody likes a quitter...");
					System.exit(0);
				}
				Integer.parseInt(birthMonthInput);
				validInput = true;
			} catch (NumberFormatException e) {
				System.out.println("Please enter a whole number");
			}
		}
		int birthMonth = Integer.parseInt(birthMonthInput);

		String favoriteColor = "";
		while (!(favoriteColor.equals("red") || favoriteColor.equals("orange") || favoriteColor.equals("yellow")
				|| favoriteColor.equals("green") || favoriteColor.equals("blue") || favoriteColor.equals("indigo")
				|| favoriteColor.equals("violet"))) {
			System.out.println("What is your favorite color? (ROYGBIV) Type \"Help\" for list of options");
			favoriteColor = input.nextLine().toLowerCase();
			if (favoriteColor.equals("quit")) {
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			}
			while (favoriteColor.equals("help")) {
				System.out.println("The ROYGBIV color options are: red, orange, yellow, green, blue, indigo, violet");
				favoriteColor = input.nextLine().toLowerCase();
				if (favoriteColor.equals("quit")) {
					System.out.println("Nobody likes a quitter...");
					System.exit(0);
				}
			}
		}

		System.out.println("How many siblings do you have?");
		String siblingNumberInput = null;
		validInput = false;
		while (!validInput) {
			try {
				siblingNumberInput = input.nextLine();
				if (siblingNumberInput.toLowerCase().equals("quit")) {
					System.out.println("Nobody likes a quitter...");
					System.exit(0);
				}
				Integer.parseInt(siblingNumberInput);
				validInput = true;
			} catch (NumberFormatException e) {
				System.out.println("Please enter a whole number");
			}
		}
		int siblingNumber = Integer.parseInt(siblingNumberInput);

		input.close();

		int retirementYears;
		if (age < 0) {
			retirementYears = 200;
		} else if (age % 2 == 1) {
			retirementYears = 14;
		} else {
			retirementYears = 12;
		}

		String vacationHomeLocation = null;
		if (siblingNumber == 0) {
			vacationHomeLocation = "Boca Raton, FL";
		} else if (siblingNumber == 1) {
			vacationHomeLocation = "Nassau, Bahamas";
		} else if (siblingNumber == 2) {
			vacationHomeLocation = "Ponta Negra, Brazil";
		} else if (siblingNumber == 3) {
			vacationHomeLocation = "Portland, Oregon";
		} else if (siblingNumber > 3) {
			vacationHomeLocation = "Baton Rouge, LA";
		} else if (siblingNumber < 0) {
			vacationHomeLocation = "Pripyat, Ukraine";
		}

		String modeOfTransportaion = null;
		if (favoriteColor.equals("red")) {
			modeOfTransportaion = "Maserati";
		} else if (favoriteColor.equals("orange")) {
			modeOfTransportaion = "stallion";
		} else if (favoriteColor.equals("yellow")) {
			modeOfTransportaion = "chariot";
		} else if (favoriteColor.equals("green")) {
			modeOfTransportaion = "taxi";
		} else if (favoriteColor.equals("blue")) {
			modeOfTransportaion = "rickshaw";
		} else if (favoriteColor.equals("indigo")) {
			modeOfTransportaion = "motor scooter";
		} else if (favoriteColor.equals("violet")) {
			modeOfTransportaion = "flying saucer";
		}

		double bankBalance;
		if (birthMonth < 5 && birthMonth > 0) {
			bankBalance = 256000.76;
		} else if (birthMonth < 9 && birthMonth > 4) {
			bankBalance = 3687105.42;
		} else if (birthMonth < 13 && birthMonth > 8) {
			bankBalance = 86.23;
		} else {
			bankBalance = 0;
		}

		System.out.println("Very interesting! Let me consult the spirits...");
		Thread.sleep(1500);
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(firstName + " " + lastName + " will retire in " + retirementYears + " years with "
				+ currency.format(bankBalance) + " in the bank," + " \nwill own a vacation home in "
				+ vacationHomeLocation + ", and will travel by " + modeOfTransportaion + ".");
	}

}
