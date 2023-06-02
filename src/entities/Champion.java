package entities;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLife() {
		return life;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public void takeDamage(int attackOtherChampion) {
		if (armor >= attackOtherChampion) {
			life -= 1; 
		}
		else {
			life += armor - attackOtherChampion;
		}
	}
	
	public String status() {
		if (life <= 0) {
			return name 
					+ ": "
					+ "0"
					+ " de vida"
					+ " (morreu)";
		}
		else {
			return name 
					+ ": "
					+ life
					+ " de vida";
		}
	}
	
	
	
	
}
