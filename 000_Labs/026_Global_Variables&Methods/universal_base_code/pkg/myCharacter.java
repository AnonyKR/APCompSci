/*
 *	Author:  Yunu Choi
 *  Date: 
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
}

