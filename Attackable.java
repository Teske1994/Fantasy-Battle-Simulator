
public interface Attackable {

	void attackCharacter(Character character);
	void fightUntilDeath(Attackable enemy);
	boolean isDefeated();
	void printInfo();
}
