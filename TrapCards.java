
public class TrapCards extends Room implements InteractableObjects{

	private int nenNeedle;
	private int nenDeclineAttack;
	private int nenDeclineDefense;
	private int nenDeclineSpeed;
	
	public TrapCards(){
		nenNeedle = 0;
		nenDeclineAttack = 0;
		nenDeclineDefense = 0;
		nenDeclineSpeed = 0;
		
	}
	
	public TrapCards(int needle, int declineAttack, int declineDefense, int declineSpeed) {
		nenNeedle = needle;
		nenDeclineAttack = declineAttack;
		nenDeclineDefense = declineDefense;
		nenDeclineSpeed = declineSpeed;
	}

	public int getNenNeedle() {
		return nenNeedle;
	}

	public int getNenDeclineAttack() {
		return nenDeclineAttack;
	}

	public int getNenBoostDefense() {
		return nenDeclineDefense;
	}

	public int getNenBoostSpeed() {
		return nenDeclineSpeed;
	}
	
	public int nenNeedleDamage(Player p) {
		int hpDecrease = 25;
		int newHealth = p.getHP() - hpDecrease;
		return newHealth;
		
	}
	
	public int nenAttackDecline(Player p) {
		int attackDecrease = 25;
		int newAttack = p.getAttack() - attackDecrease;
		return newAttack;
		
	}
	
	public int nenDefenseDecline(Player p) {
		int defenseDecrease = 25;
		int newDefense = p.getDefense() - defenseDecrease;
		return newDefense;
		
	}
	
	public int nenSpeedDecline(Player p) {
		int speedDecrease = 25;
		int newSpeed = p.getSpeed() - speedDecrease;
		return newSpeed;
		
	}
	
	public void Play(Hunter h) {
		System.out.println("Some of your Nen Energy was stolen by a skilled foe");
	    if (nenNeedle > 0) {
	        int newHealth = nenNeedleDamage(h);
	        h.setHP(newHealth); 
	        System.out.println("You were hit with a Nen Needle! Your health is now: " + h.getHP());
	    }
	    if (nenDeclineAttack > 0) {
	        int newAttack = nenAttackDecline(h);
	        h.setAttack(newAttack); 
	        System.out.println("Your attack is decreased to: " + h.getAttack());
	    }
	    if (nenDeclineDefense > 0) {
	        int newDefense = nenDefenseDecline(h);
	        h.setDefense(newDefense); 
	        System.out.println("Your defense is decreased to: " + h.getDefense());
	    }
	    
	    if (nenDeclineSpeed > 0) {
	        int newSpeed = nenSpeedDecline(h);
	        h.setSpeed(newSpeed); 
	        System.out.println("Your speed is decreased to: " + h.getSpeed());
	    }
	}
	
	
	
}
