
public class Muerem extends Villains {
	
	
	public Muerem() {
		super("Muerem", 100, 120, 250, 200);
	}
	
	public void auraSynthesis(Player p) {
		int damageToPlayer = this.getAttack() - p.getDefense();
		int restOfLife = p.getHP() - damageToPlayer ;
		System.out.println(this.getName() + " used Aura Synthesis.");
		p.setHP(restOfLife);
	}
	
	@Override
	public void villainAttack(Player p) {
		auraSynthesis(p);
	}

}
