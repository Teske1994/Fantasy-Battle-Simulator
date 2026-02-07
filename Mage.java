
public class Mage extends Character implements Attackable{

	private int spellPower;
	
	public void setSpellPower(int spellPower) {
		
		if (spellPower > 0) {
			
			this.spellPower = spellPower;
		}
	}
	
	public int getSpellPower() {
		
		return this.spellPower;
	}
	
	public void attackCharacter(Character character) {
		
		if (!(character.isDefeated())) {
			
			character.setHealth(character.getHealth() - this.getSpellPower());
		}
	}
	
	@Override
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
