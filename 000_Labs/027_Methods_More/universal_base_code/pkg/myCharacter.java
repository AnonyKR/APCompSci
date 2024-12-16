/*
 *	Author:  Yunu Choi
 *  Date: 10/10/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	int str; //strength
	int dex; //dexterity
	int intel; //intelligence
	int cha; //charisma
	
	public myCharacter() {
		System.out.println("You've decided not to choose a role. Rerun program.");
		this.role = new String("No role");
		this.str = 0;
		this.dex = 0;
		this.intel = 0;
		this.cha = 0;
	}
	
	public myCharacter(String roleIn) {
		switch (roleIn) {
			case "Wizard", "wizard":
				System.out.println("You have choosen the Wizard! Excelsior!");
				this.role = roleIn;
				break;
			case "Warrior", "warrior":
				System.out.println("You have choosen the Warrior! For honor!");
				this.role = roleIn;
				break;
			case "Rogue", "rogue":
				System.out.println("You have choosen the Rogue! How cunning!");
				this.role = roleIn;
				break;
			default:
				System.out.println("You've decided not to choose a role. Rerun program.");
				this.role = new String("No role");
		}
		this.str = 0;
		this.dex = 0;
		this.intel = 0;
		this.cha = 0;
	}
	
	public void myToString() {
		System.out.println("You're a " + this.role + " with the following stats!");
		System.out.println("Strength - " + this.str);
		System.out.println("Dexterity - " + this.dex);
		System.out.println("Intelligence - " + this.intel);
		System.out.println("Charisma - " + this.cha);
	}

	public String setRole(String roleIn) {
		switch (roleIn) {
			case "Wizard", "wizard":
				System.out.println("You have choosen the Wizard! Excelsior!");
				this.role = roleIn;
				break;
			case "Warrior", "warrior":
				System.out.println("You have choosen the Warrior! For honor!");
				this.role = roleIn;
				break;
			case "Rogue", "rogue":
				System.out.println("You have choosen the Rogue! How cunning!");
				this.role = roleIn;
				break;
			default:
				System.out.println("You've decided not to choose a role. Rerun program.");
				this.role = new String("No role");
		}
		return this.role;
	}
	
	public int setStrength(int strIn) {
		if (strIn >= 0) {
			this.str = strIn;
		} else {
			this.str = 0;
		}
		return this.str;
	}
	
	public int setDexterity(int dexIn) {
		if (dexIn >= 0) {
			this.dex = dexIn;
		} else {
			this.dex = 0;
		}
		return this.dex;
	}
	
	public int setIntelligence(int intelIn) {
		if (intelIn >= 0) {
			this.intel = intelIn;
		} else {
			this.intel = 0;
		}
		return this.intel;
	}
	
	public int setCharisma(int chaIn) {
		if (chaIn >= 0) {
			this.cha = chaIn;
		} else {
			this.cha = 0;
		}
		return this.cha;
	}
	
	public boolean setAll(String roleIn, int strIn, int dexIn, int intelIn, int chaIn) {
		this.setRole(roleIn);
		this.setStrength(strIn);
		this.setDexterity(dexIn);
		this.setIntelligence(intelIn);
		this.setCharisma(chaIn);
		return true;
	}
}

