
public class Hunter extends Player{
	
	public Hunter() {
		super("Netero", 75, 65, 150, 85);
	}
	
	public Hunter(String inputName, int inputAttack, int inputDefense, int inputHp, int inputSpeed) {
		super(inputName, inputAttack, inputDefense, inputHp, inputSpeed);
	}
	
	public void attackBattle(Player p) {
		int restOfLife = p.getHP() - (this.getAttack() - p.getDefense());
		p.setHP(restOfLife);
	}

}