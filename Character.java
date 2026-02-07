
public abstract class Character {
	
	private int health;
	private int mana;
	private String name;
	
	
	public void setHealth (int health) {
		
		this.health = health;
	}
	
	public int getHealth() {
		
		return this.health;
	}
	
	public void setMana (int mana) {
		
		this.mana = mana;
	}
	
	public int getMana() {
		
		return this.mana;
	}
	
	public void setName (String name) {
		
		if (name != null && !(name.isEmpty())) {
			
			this.name = name;
		}
	}
	
	public String getName () {
		
		
		return this.name;
	}
	
	public boolean isDefeated() {
		
		boolean defeated = false;
		
		if (this.getHealth() <= 0) {
			
			defeated = true;
		}
		
		
		return defeated;
	}
	
	public void takeDamage(int damage) {
		
		if (damage > 0) {
			
			this.setHealth(this.getHealth() - damage);
			isDefeated();
		}
	}
	
	public void printInfo() {
		
		System.out.println(this.getName() + ", remains at " + this.getHealth() + " health");
	}

}
