
public class ArchMage extends Mage {
	
	private int shield;
	
	public ArchMage() {
		
		this.setHealth(800);
		this.setMana(1000);
		this.setSpellPower(300);
		this.setName("Arch Mage");
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
