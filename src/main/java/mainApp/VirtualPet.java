package mainApp;

public class VirtualPet {

	private int tiredness;
	private int happiness;
	private int hungriness;

	public String status;
	public String petName;

	public VirtualPet(String newPetName) {
		this.petName = newPetName;
		setTiredness();
		setHappiness();
		setHungriness();

	}

	public int getTiredness() {
		return tiredness;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getHungriness() {
		return hungriness;
	}

	public void setTiredness() {
		this.tiredness = (int) (Math.random() * 51) + 0;

	}

	public void setHappiness() {
		this.happiness = (int) (Math.random() * 51) + 0;

	}

	public void setHungriness() {
		this.hungriness = (int) (Math.random() * 51) + 0;

	}

	public void walk() {
		if (tiredness < 30) {
			System.out.println("You took " + petName + " out for a walk");
		} else if (happiness < 25) {
			System.out.println(petName + " is too sad right now to go on a walk.");
		}

		else if (hungriness > 25) {
			System.out.println(petName + " is too hungry to go out for a walk. ");
		}

	}

	public void pet() {
		System.out.println("You pet " + petName + " and they seem more happy now!");
		happiness += 35;
		tiredness += 5;
	}

	public void feed() {
		System.out.println("You fed " + petName + " and now they are not hungry anymore and they have more energy!");
		hungriness -= 25;
		tiredness -= 25;
	}

	public void status() {
		System.out.println("Tiredness = " + tiredness);
		System.out.println("Happiness = " + happiness);
		System.out.println("Hungriness = " + hungriness);
	}

	public void tick() {
		happiness -= 10;
		if (happiness < 0) {
			happiness = 0;
		}
		hungriness += 10;
		if (hungriness < 0) {
			hungriness = 0;
		}
		tiredness += 15;
		if (tiredness < 0) {
			tiredness = 0;
		}

	}

}
