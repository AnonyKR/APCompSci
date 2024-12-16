/*
 *	Author: Yunu Choi 
 *  Date: 10/23/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	static int setSkill(String skillName, int pts, Scanner sc) {
		System.out.print("\n" + skillName + " (1-10): ");
		int inVal = sc.nextInt();
		if (inVal > 10 || inVal > pts) {
			System.out.print("Please input a smaller value. " + skillName + " (1-10): ");
			inVal = sc.nextInt();
		}
		if (pts != inVal) {
			System.out.println("You have " + (pts - inVal) + " left to spend.");
		}
		return inVal;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String className = sc.nextLine();
		switch (className) {
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
		int skillpt = 20;
		System.out.println("\nYou have 20 skill points to spend in following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		int str = setSkill(new String("Strength"), skillpt, sc);
		skillpt -= str;
		int dex = setSkill(new String("Dexterity"), skillpt, sc);
		skillpt -= dex;
		int intel = setSkill(new String("Intelligence"), skillpt, sc);
		skillpt -= intel;
		int cha = setSkill(new String("Charisma"), skillpt, sc);
		skillpt -= cha;
		System.out.println();
		if (skillpt > 0) {
			System.out.println("You have " + skillpt + " to spend for next time.");
		}
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + name + ", the " + title + " of CVHS.");
		System.out.println("You're a " + className + " with the following stats!");
		System.out.println("Strength - " + str);
		System.out.println("Dexterity - " + dex);
		System.out.println("Intelligence - " + intel);
		System.out.println("Charisma - " + cha);
	}
}
