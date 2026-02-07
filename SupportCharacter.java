
public abstract class SupportCharacter extends Character {
	
	private int capacity;
	
	
	public void setCapacity (int capacity) {
		
		if (capacity > 0) {
			
			this.capacity = capacity;
		}
	}
	
	public int getCapacity () {
		
		return this.capacity;
	}
	
	

}
