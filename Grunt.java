
public class Grunt extends Villains{
	
	
	public Grunt() {
		super("Grunt", 20, 15, 60, 30);
	}
	
	public void nenPunch(Player p) {
		int damageToPlayer = this.getAttack() - p.getDefense();
		int restOfLife = p.getHP() - damageToPlayer ;
		System.out.println(this.getName() + " used Nen Punch.");
		p.setHP(restOfLife);
	}
	
	@Override
	public void villainAttack(Player p) {
		nenPunch(p);
	}
	
}
