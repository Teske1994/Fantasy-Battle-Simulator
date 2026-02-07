
public class MainClass {

	public static void main(String[] args) {
		
		Knight knight = new Knight();
		KnightCommander commander = new KnightCommander();
		
		ArchMage archMage = new ArchMage();
		
		archMage.fightUntilDeath(commander);
		
		if (archMage.isDefeated()) {
			
			System.out.println("Mage je izgubio!");
		}
		else if (commander.isDefeated()) {
			
			System.out.println("Komander je izgubio");
		}
		else {
			System.out.println("Nereseno!");
		}

	}

}
