package mainApp;

import java.util.Scanner;

public class VirtualPetApp {


	public static void main(String[] args) {

		System.out.println("Welcome to my Virtual Pet!");
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to name your pet?");
		String petName = input.next();		
		
		
		VirtualPet userPet = new VirtualPet(petName);
		
		int userChoice = 0;
		
		// game loop
		
		while(userChoice != 4) {
			System.out.println("What would you like to do with " + petName + "?");
			System.out.println("Please choose between 1-4");
			System.out.println("1 to walk "+ petName);
			System.out.println();
			
			
			
		}
		
		

	}

}
