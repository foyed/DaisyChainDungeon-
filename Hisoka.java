
public class Hisoka extends Villains{
	
	
	public Hisoka() {
		super("Hisoka", 55, 45, 80, 75);
	}
	
	public void bungeeGum(Player p) {
		int damageToPlayer = this.getAttack() - p.getDefense();
		int restOfLife = p.getHP() - damageToPlayer ;
		System.out.println(this.getName() + " used Bungee Gum.");
		p.setHP(restOfLife);
	}
	
	@Override
	public void villainAttack(Player p) {
		bungeeGum(p);
	}

}
