package tutorials;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// System objects
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		// Game variables
		String[] enemies = { "Skeleton", "Zombie", "Warrior","Assasin"  };
		int maxEnemyHealth = 75;
		int enemyAttackDamage = 25;
		int killCount = 0;
		
		// Player variables
		int health = 100;
		int attackDamage = 50;
		int numHealthPotions = 3;
		int healthPotionHealAmount = 30;
		int healthPotionDropChance = 60; // precentage
		
		boolean running = true;
		
		System.out.println("Welcome to the Dungeon!");
		
		GAME:
		while(running) {
			System.out.println("-----------------------------------------------");
			
			int enemyHealth = rand.nextInt(maxEnemyHealth);
			String enemy = enemies[rand.nextInt(enemies.length)];
			
			System.out.println("\t # " + enemy + " appeared! #\n");
			
			while(enemyHealth > 0) {
				System.out.println("\tYour HP: " + health);
				System.out.println("\t" + enemy + "'s HP: " + enemyHealth );
				System.out.println("\n\tWhat would you like to do?");
				System.out.println("\t1. Attack");
				System.out.println("\t2. Drink health potion");
				System.out.println("\t3. Run!");
				
				String input = in.nextLine();
				if(input.equals("1")) {
					int damageDealt = rand.nextInt(attackDamage);
					int damageTaken = rand.nextInt(enemyAttackDamage);
					
					enemyHealth -= damageDealt;
					health -= damageTaken;
					
					System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
					System.out.println("\t> You recive " + damageTaken + " in retaliation.");
					
					if(health < 1) {
						System.out.println("\t> You have taken too much damage, you are to weak to go on!");
						break;
					}
					
					
				}
				else if (input.equals("2")) {
					
					if(numHealthPotions > 0) {
						health += healthPotionHealAmount;
						numHealthPotions --;
						System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + "."
											+ "\n\t> You now have " + health + " MP."
											+ "\n\t> You have " + numHealthPotions + " health potions left.\n");
						
					}
					else {
						System.out.println("\t> You have no health potions left! Defeat enemies for a chance to get one!\n");
					}
					
				}
				else if (input.equals("3")) {
					
					System.out.println("\t>You run away from the " + enemy + "!");
					if(rand.nextInt(100) < 30) {
						int enemyAttackWhenRun = rand.nextInt(enemyAttackDamage);
						health -= enemyAttackWhenRun;
						System.out.println("\tBut " + enemy + " deal " + enemyAttackWhenRun + " damage to you!");
						if(health < 1) {
							break;
						}
						System.out.println("\t Your HP is: " + health);
						
					}
					
					continue GAME;
					
				} else {
					System.out.println("\tInvalid command!");
				}
			}
			
			if(health < 1) {
				System.out.println("\tYou limp out of the dungenon. weak from battle.");
				killCountMsg(killCount);
				break;
			}
			killCount ++;
			System.out.println("-----------------------------------------------");
			System.out.println(" # " + enemy + " was defeated! # ");
			killCountMsg(killCount);
			//levelUp(killCount);
			System.out.println(" # You have " + health + " HP left. #");
			if(rand.nextInt(100) < healthPotionDropChance) {
				numHealthPotions++;
				System.out.println(" # The " + enemy + " dropped a health potion! # ");
				System.out.println(" # You now have " + numHealthPotions + " health potion(s). # ");
			} 
			System.out.println("-----------------------------------------------");
			System.out.println("What would you like to do now?");
			System.out.println("1. Continue fighting");
			System.out.println("2. Exit dungenon");
			
			String input = in.nextLine();
			
			while (!input.equals("1") && !input.equals("2")) {
				System.out.println("Invalid command!");
				input = in.nextLine();
			}
			
			if(input.equals("1")) {
				System.out.println("You continue on your adventure!");
				//continue GAME;
			}
			else if(input.equals("2")) {
				System.out.println("You exit the dungenon, successful from your adventures!");
				killCountMsg(killCount);
				break;
			}
			
		}
		
		theEndMsg();
		
		
	}
	
	
public static void killCountMsg(int killCount) {
	System.out.println("\t # You defeat " + killCount + " creature(s)!");
	}

public static void theEndMsg() {
	System.out.println("\n\n\t######################");
	System.out.println("\t#      THE END       #");
	System.out.println("\t######################");
	}


}
