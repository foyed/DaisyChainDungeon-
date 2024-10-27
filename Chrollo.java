
public class Chrollo extends Villains {

	
	
	public Chrollo() {
		super("Chrollo", 65, 55, 120, 90);
	}
	
	public void banditsSecret(Player p) {
		int damageToPlayer = this.getAttack() - p.getDefense();
		int restOfLife = p.getHP() - damageToPlayer ;
		System.out.println(this.getName() + " used Bandit's Secret.");
		p.setHP(restOfLife);
	}
	
	@Override
	public void villainAttack(Player p) {
		banditsSecret(p);
	}
	
}
