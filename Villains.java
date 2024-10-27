/*
 * Villains is the Monster class
 */
    public class Villains extends Player {
	

    	public Villains() {
    		super("", 0, 0, 0, 0);
    	}
    	
		public Villains(String villainName, int villainAttack, int villainDefense, int villainHp, int villainSpeed) {
			super(villainName, villainAttack, villainDefense, villainHp, villainSpeed);
		}
		
		public void villainAttack(Player p) {
			int restOfLife = p.getHP() - (this.getAttack() - p.getDefense());
			System.out.println(this.getName() + " used Bandit's Secret.");
			if(restOfLife == 0) {
				restOfLife = 0;
			}
			p.setHP(restOfLife);
			System.out.println("Your health is now " + p.getHP() + ".");
		}
		
		public void battleVillain(Player p) {
	        System.out.println("You are in " + this.getName() + "'s room!");
	        while ((this.getHP() > 0) && p.health()) {
	        	if(p.getSpeed() < this.getSpeed()) {
	        		 if (p.health()) {
	        			 villainAttack(p);
	                     System.out.println("You attacked " + this.getName());
	                     int villainNewHealth = this.getHP() - (p.getAttack() - this.getDefense());
	                     this.setHP(villainNewHealth); 
	                     System.out.println(getName() + "'s health is now: " + this.getHP());
	                 }
	        	}
	        	if(p.getSpeed() > this.getSpeed()) {
	                if (p.health()) {
	                    System.out.println("You attacked " + getName());
	                    int villainNewHealth = this.getHP() - (p.getAttack() - this.getDefense());
	                    this.setHP(villainNewHealth); 
	                    System.out.println(getName() + "'s health is now: " + this.getHP());
	                    villainAttack(p);
	                }
	        	}
	        	if(p.getSpeed() == this.getSpeed()) { 
	                if (p.health()) {
	                	villainAttack(p);
	                    System.out.println("You attacked " + this.getName());
	                    int villainNewHealth = this.getHP() - (p.getAttack() - this.getDefense());
	                    this.setHP(villainNewHealth); 
	                    System.out.println(this.getName() + "'s health is now: " + this.getHP());
	                }
	        	}
	           
	        }

	        if (getHP() <= 0) {
	            System.out.println(this.getName() + " has been defeated!");
	        } else if (!p.health()) {
	            System.out.println("You have been defeated!");
	        }
	    }

}
