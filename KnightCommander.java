
public class KnightCommander extends Warrior {
	
	private int shield;
	
	public KnightCommander() {
		
		this.setHealth(1000);
		this.setDamage(250);
		this.setName("Knight Commander");
		this.setShield(10);
	}
	
	public int getShield() {
		
		return this.shield;
	}
	
	public void setShield(int shield) {
		
		this.shield = shield;
	}
	
	@Override
	public void takeDamage(int damage) {
		
		int tempDamage = damage - this.getShield();
		super.takeDamage(tempDamage);
	}

}
