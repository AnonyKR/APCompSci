/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String inVal = sc.nextLine();
		switch (inVal) {
			case "Wizard", "wizard":
				System.out.println("You have choosen the Wizard! Excelsior!");
				break;
			case "Warrior", "warrior":
				System.out.println("You have choosen the Warrior! For honor!");
				break;
			case "Rogue", "rogue":
				System.out.println("You have choosen the Rogue! How cunning!");
				break;
			default:
				System.out.println("You've decided not to choose a role. Rerun program.");
		}
	}
}
