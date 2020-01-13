package mainApp;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		System.out.println("Welcome to my Virtual Pet!");
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to name your pet?");
		String petName = input.next();
		System.out.println(petName + "? That is a great name!");

		VirtualPet userPet = new VirtualPet(petName);

		int userChoice = 0;

		System.out.println("Please choose between 1-5 ");
		System.out.println("1 to walk " + petName + ".");
		System.out.println("2 to feed " + petName + ".");
		System.out.println("3 to feed " + petName + ".");
		System.out.println("4 to get " + petName+"'s status");	
		System.out.println("5 to exit Virtual Pet.");
		

		// game loop

		while (userChoice != 5) {
			System.out.println("What would you like to do with " + petName + "?");

			userChoice = input.nextInt();

			if (userChoice == 1) {
				userPet.walk();
				userPet.tick();
			} else if (userChoice == 2) {
				userPet.pet();
				userPet.tick();
			} else if (userChoice == 3) {
				userPet.feed();
				userPet.tick();
			} else if (userChoice == 4) {
				userPet.status();
			} else if (userChoice == 5) {
				System.out.println("Thank you for playing Virtual Pet!");
				break;

			} else {
				System.out.println("Sorry, that's not a recognizable choice");
				System.out.println("Please choose between 1-4");
				userChoice = input.nextInt();
			}

		}
		
		
		
		
		input.close();
	}

}
