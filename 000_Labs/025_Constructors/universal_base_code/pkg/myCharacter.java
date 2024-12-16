/*
 *	Author:  Yunu Choi
 *  Date: 10/10/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String role;
	
	public myCharacter() {
		System.out.println("You've decided not to choose a role. Rerun program.");
		this.role = new String("No role");
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
	}

}

