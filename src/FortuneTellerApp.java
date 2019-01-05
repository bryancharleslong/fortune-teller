import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Fortune Teller!");
		Scanner input = new Scanner(System.in);

		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		if (firstName.equals("Quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		if (lastName.equals("Quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

		System.out.println("What is your age?");
		String ageInput = input.nextLine();
		if (ageInput.equals("Quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		int age = Integer.parseInt(ageInput);

		System.out.println("What is your birth month? (1-12)");
		String birthMonthInput = input.nextLine();
		if (birthMonthInput.equals("Quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		int birthMonth = Integer.parseInt(birthMonthInput);

		System.out.println("What is your favorite color? (ROYGBIV)");
		String favoriteColor = input.nextLine();
		if (favoriteColor.equals("Quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		favoriteColor = favoriteColor.toLowerCase();
		

		System.out.println("How many siblings do you have?");
		String siblingNumberInput = input.nextLine();
		if (firstName.equals("Quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		int siblingNumber = Integer.parseInt(siblingNumberInput);

		input.close();

		int retirementYears = 0;
		if (age % 2 == 1) {
			retirementYears = 14;
		} else {
			retirementYears = 12;
		}

		String vacationHomeLocation = null;
		if (siblingNumber == 0) {
			vacationHomeLocation = "Boca Raton, FL";
		}
		if (siblingNumber == 1) {
			vacationHomeLocation = "Nassau, Bahamas";
		}
		if (siblingNumber == 2) {
			vacationHomeLocation = "Ponta Negra, Brazil";
		}
		if (siblingNumber == 3) {
			vacationHomeLocation = "Portland, Oregon";
		}
		if (siblingNumber > 3) {
			vacationHomeLocation = "Baton Rouge, LA";
		}
		if (siblingNumber < 0) {
			vacationHomeLocation = "Chernobyl, Ukraine";
		}

		String modeOfTransportaion = null;
		if (favoriteColor.equals("red")) {
			modeOfTransportaion = "Maserati";
		}
		if (favoriteColor.equals("orange")) {
			modeOfTransportaion = "stallion";
		}
		if (favoriteColor.equals("yellow")) {
			modeOfTransportaion = "chariot";
		}
		if (favoriteColor.equals("green")) {
			modeOfTransportaion = "taxi";
		}
		if (favoriteColor.equals("blue")) {
			modeOfTransportaion = "rickshaw";
		}
		if (favoriteColor.equals("indigo")) {
			modeOfTransportaion = "motor scooter";
		}
		if (favoriteColor.equals("violet")) {
			modeOfTransportaion = "flying saucer";
		}

		String bankBalance = null;
		if (birthMonth < 5 & birthMonth > 0) {
			bankBalance = "$256,000.76";
		} else {
			if (birthMonth < 9 & birthMonth > 4) {
				bankBalance = "$3,687,105.42";
			} else {
				if (birthMonth < 13 & birthMonth > 8) {
					bankBalance = "$86.23";
				} else {
					bankBalance = "0.00";
				}
			}
		}
		System.out.println(firstName + " " + lastName + " will retire in " + retirementYears + " years with "
				+ bankBalance + " in the bank,");
		System.out
				.println("a vacatin home in " + vacationHomeLocation + ", and travel by " + modeOfTransportaion + ".");
	}

}
