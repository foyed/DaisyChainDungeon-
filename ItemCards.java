/*
 * Cards is the Item class
 */
public class ItemCards extends Room implements InteractableObjects {
	
	private int medKit;
	private int nenBoostAttack;
	private int nenBoostDefense;
	private int nenBoostSpeed;
	
	public ItemCards(){
		medKit = 0;
		nenBoostAttack = 0;
		nenBoostDefense = 0;
		nenBoostSpeed = 0;
		
	}
	
	public ItemCards(int medicalKit, int boostAttack, int boostDefense, int boostSpeed) {
		medKit = medicalKit;
		nenBoostAttack = boostAttack;
		nenBoostDefense = boostDefense;
		nenBoostSpeed = boostSpeed;
	}

	public int getMedKit() {
		return medKit;
	}

	public int getNenBoostAttack() {
		return nenBoostAttack;
	}

	public int getNenBoostDefense() {
		return nenBoostDefense;
	}

	public int getNenBoostSpeed() {
		return nenBoostSpeed;
	}
	
	public int medKitBoost(Player p) {
		int hpBoost = 25;
		int newHealth = hpBoost + p.getHP();
		return newHealth;
		
	}
	
	public int attackBoost(Player p) {
		int attackIncrease = 25;
		int newAttack = attackIncrease + p.getAttack();
		return newAttack;
		
	}
	
	public int defenseBoost(Player p) {
		int defenseIncrease = 25;
		int newDefense = defenseIncrease + p.getDefense();
		return newDefense;
		
	}
	
	public int speedBoost(Player p) {
		int speedIncrease = 25;
		int newSpeed = speedIncrease + p.getSpeed();
		return newSpeed;
		
	}
	
	public void Play(Hunter h) {
		System.out.println("You have gained a Nen Boost");
    if (medKit > 0) {
        int newHealth = medKitBoost(h);
        h.setHP(newHealth);
        System.out.println("Your health is boosted to: " + h.getHP());
    }
    if (nenBoostAttack > 0) {
        int newAttack = attackBoost(h);
        h.setAttack(newAttack); 
        System.out.println("Your attack is boosted to: " + h.getAttack());
    }
    if (nenBoostDefense > 0) {
        int newDefense = defenseBoost(h);
        h.setDefense(newDefense);
        System.out.println("Your defense is boosted to: " + h.getDefense());
    }
    if (nenBoostSpeed > 0) {
        int newSpeed = speedBoost(h);
        h.setSpeed(newSpeed); 
        System.out.println("Your speed is boosted to: " + h.getSpeed());
    }
}
	
	

}

	
	
	 


