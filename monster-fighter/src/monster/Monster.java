
package monster;

import items.*;

public class Monster {
	
	private int maxHealth;
	private int currHealth;
	private int baseDefence;
	private int currDefence;
	private int baseAttack;
	private int currAttack;
	private int energy = 1;
	private String monsterName;
	
	Monster(String monName, int health, int attack, int defence) {
		setMonsterName(monName);
		maxHealth = currHealth = health;
		baseDefence = currDefence = defence;
		baseAttack = currAttack = attack;
	}
	
	//------------------------Health Getters/Setters/Changers----------------------------------
	public int getMaxHealth() {
		return maxHealth;
	}
	
	public void setMaxHealth(int increase) {
		maxHealth = getMaxHealth() + increase;
	}

	public int getCurrHealth() {
		return currHealth;
	}

	public void setCurrHealth(int currHealth) {
		this.currHealth = currHealth;
	}
	
	public void changeCurrHealth(int health) {	
		// If the increase goes over max health, just make it max health
		
		if ((this.getCurrHealth() + health) > this.getMaxHealth()) {
			setCurrHealth(this.getMaxHealth());
		} else {
			this.currHealth += health;
		}
	}

	//------------------------Defence Getters/Setters/Changers----------------------------------
	
	public int getBaseDefence() {
		return baseDefence;
	}
	
	public void setBaseDefence(int increase) {
		baseDefence = getBaseDefence() + increase;
	}

	public int getCurrDefence() {
		return currDefence;
	}

	public void setCurrDefense(int currDefence) {
		this.currDefence = currDefence;
	}
	
	public void changeCurrDefence(int defence) {
		this.currDefence += defence;
	}
	
	//------------------------Attack Getters/Setters/Changers----------------------------------
	
	public int getBaseAttack() {
		return baseAttack;
	}
	
	public void setBaseAttack(int increase) {
		baseAttack = getBaseAttack() + increase;
	}

	
	public int getCurrAttack() {
		return currAttack;
	}

	public void setCurrAttack(int currAttack) {
		this.currAttack = currAttack;
	}
	
	public void changeCurrAttack(int attack) {
		this.currAttack += attack;
	}
	
	//------------------------Energy Getters/Setters/Changers----------------------------------
	
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public void changeEnergy(int energy) {
		this.energy += energy;
	}
	
	//------------------------Name Getters/Setters/Changers----------------------------------

	public String getMonsterName() {
		return monsterName;
	}

	public void setMonsterName(String monsterName) {
		this.monsterName = monsterName;
	}
	
	//Moved this to the Potion and Food Classes
	
/*	public void useItem(Items item) {
		this.changeCurrAttack(item.changeAttack());
		this.changeCurrDefense(item.changeDefense());
		this.changeCurrHealth(item.changeHealth());
		this.changeEnergy(item.changeEnergy());
	}*/
	
	public String toString() {
		String firstLine = "Name: " + monsterName + "\n";
		String secondLine = "Current Health: " + currHealth + "\n";
		String thirdLine = "Current Attack: " + currAttack + "\n";
		String forthLine = "Current Defense: " + currDefence + "\n";
		return firstLine + secondLine + thirdLine + forthLine;
	}
	
	public static void main(String[] args) {
		Dragon test = new Dragon();
		Potions health = new HealthPotion();
		System.out.println(test.getCurrHealth());
		//test.useItem(health);
		System.out.println(test.getMonsterName());
		System.out.println(test.getCurrHealth());
	}

	
}
