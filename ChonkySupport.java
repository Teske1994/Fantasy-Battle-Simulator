
public class ChonkySupport extends SupportCharacter {

	private int shield;
	
	public ChonkySupport() {
		
		this.setHealth(500);
		this.setMana(600);
		this.setCapacity(1500);
		this.setName("Chonky Support");
		this.setShield(15);
	}
	
	public void setShield(int shield) {
		
		if (shield > 0 ) {
			
			this.shield = shield;
		}
	}
	
	public int getShield() {
		
		return this.shield;
	}
	
	@Override
	public void takeDamage(int damage) {
		
		int tempDamage = damage - this.getShield();
		super.takeDamage(tempDamage);
	}
	
	
}
