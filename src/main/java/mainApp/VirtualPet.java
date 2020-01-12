package mainApp;

public class VirtualPet {

	private int tiredness;
	private int happiness;
	private int hungriness;
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
		this.tiredness = (int) (Math.random() * 51);

	}

	public void setHappiness() {
		this.happiness = (int) (Math.random() * 51);

	}

	public void setHungriness() {
		this.hungriness = (int) (Math.random() * 51);

	}
	
	
	public void walk() {
		if(tiredness < 30) {
			System.out.println("You took " + petName + " out for a walk");
		}
		else if(happiness < 25){
			System.out.println(petName + " is too sad right now to go on a walk.");
		}
		
		else if(hungriness > 25){
			System.out.println(petName + " is too hungry to go out for a walk. ");
		}
		
	}

	public void pet() {
		System.out.println("You pet " + petName + " and they seem more happy now!");
		happiness+=25;
	}
	
	public void feed() {
		System.out.println("You fed " + petName + " and now they have more energy!");
		hungriness -= 25;
		tiredness -= 25;
	}
	
	public void tick() {
		happiness-=15;
		hungriness+=10;
		tiredness+=20;
		
	}
	
	

}
