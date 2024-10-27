
	abstract class Player {

	private String name;
	private int attack;
	private int defense;
	private int HP;
	private int speed;
	
	public Player() {
		name = "";
		attack = 0;
		defense = 0;
		HP = 0;
		speed = 0;
	}

	public Player(String theName, int phyAttack, int phyDefense, int health, int theSpeed) {
		name = theName;
		attack = phyAttack;
		defense = phyDefense;
		HP = health;
		speed = theSpeed;
		
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String aName) {
		name = aName;
	}
	
	public boolean health() {
		return HP > 0;
	}
	
	public boolean equal(Object obj) {
		Hunter temp = (Hunter) obj;
		if(this.getAttack() == temp.getAttack() && this.getHP() == temp.getHP()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void userAttack(Villains v) {
		int restOfLife = v.getHP() - (this.getAttack() - v.getDefense());
		System.out.println("You attacked: " + v.getName());
		if(restOfLife <= 0) {
			restOfLife = 0;
		}
		v.setHP(restOfLife);
	}
	
	
	
	
}
