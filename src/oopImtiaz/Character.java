package oopImtiaz;

public class Character {
	
	public Character(String name, int healthPoints, int attackPoints, int defencePoints, int exp) {
		super();
		this.name = name;
		this.healthPoints = healthPoints;
		this.attackPoints = attackPoints;
		this.defencePoints = defencePoints;
		this.exp = exp;
	}
	String name;
	int healthPoints;
	int attackPoints;
	int defencePoints;
	int exp;
	
	public void info() {
		System.out.println("NAME: " + name + "\n" + 
						   "HP: " + healthPoints + "\n" +
						   "AP: " + attackPoints + "\n" +
						   "DP: " + defencePoints + "\n" +
						   "XP: " + exp + "\n" + 
						   "-------------------------");
		
	}
	

}
