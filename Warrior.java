
public abstract class Warrior extends Character implements Attackable {

	private int physicalDamage;
	
	public void setDamage(int damage) {
		
		if (damage > 0) {
			
			this.physicalDamage = damage;
		}
	}
	
	public int getDamage() {
		
		return this.physicalDamage;
	}
	
	public void attackCharacter(Character character) {
		
		if (!(character.isDefeated())) {
			
			character.setHealth(character.getHealth() - this.getDamage());
		}
	}
	
	public void fightUntilDeath(Attackable enemy) {
		
	    while (!this.isDefeated() && !enemy.isDefeated()) {
	    	
	        this.attackCharacter((Character) enemy);
	        enemy.printInfo();
	        if (!enemy.isDefeated()) {
	        	
	            enemy.attackCharacter(this);
	            this.printInfo();
	        }
	    }
	}
}
