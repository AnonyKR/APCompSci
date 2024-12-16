/*
 *	Author: Yunu Choi
 *  Date: 10/5/2024
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class starter {
	public static boolean yesOrNo(Scanner sca, String question, String retry) {
		System.out.print(question);
		String answer = sca.nextLine();
		while(true) {
			switch(answer) {
				case "Yes", "yes", "Y", "y":
					return true;
				case "No", "no","N", "n":
					return false;
				default:
					System.out.print(retry);
					answer = sca.nextLine();
			}	
		}
	}
	
	public static int betting(Scanner sca, int min, int max, String question, String underMin, String overMax) {
		if(min > max) {
			System.out.println("min is bigger than max...");
			return min;
		}
		System.out.print(question);
		int answer = sca.nextInt();
		sca.nextLine();
		while(true) {
			if ((answer >= min) && (answer <= max)) {
				return answer;
			} else if(answer < min) {
				System.out.print(underMin);
			} else if(answer > max) {
				System.out.print(overMax);
			}
			answer = sca.nextInt();
			sca.nextLine();
		}
	}
	
	public static String lineBreak() {
		return new String("--------------------------------------------------");
	}
	
	public static void slotInfo() {
		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println(lineBreak() + "\n");		
	}
	
	public static int slotRoll(int pool) {
		ArrayList<Integer> rolls = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			rolls.add((int)(Math.random() * 10 + 1));
		}
		System.out.println("\nGreat! Let's play!!!\nYour rolls are:\n_______________________");
		System.out.println(" | " + rolls.get(0) + " | " + rolls.get(1) + " | " + rolls.get(2) + " |");
		System.out.println("_______________________");
		if ((rolls.get(0) == rolls.get(1)) || (rolls.get(0) == rolls.get(2)) || (rolls.get(1) == rolls.get(2))) {
			if ((rolls.get(0) == rolls.get(2)) && (rolls.get(1) == rolls.get(2))) {
				System.out.println("JACKPOT! You're wager has now been tripled!");
				return (pool * 3);
			} else {
				System.out.println("You won! You're wager has now been doubled!");
				return (pool * 2);
			}
		} else {
			System.out.println("Didn't win this time, better luck next time!");
			return 0;
		}
	}
	
	public static void main(String args[]) {
		int money = 100;
		Scanner sc = new Scanner(System.in);
		boolean end = false;
		slotInfo();
		while(true) {
			if(!(yesOrNo(sc, "Would you like to play the slots? (Yes/yes/Y/y) : ", ("That wasn't quite the correct answer. Try again.\n" + lineBreak() + "\n\nWould you like to play the slots? (Yes/yes/Y/y) : ")))) {
				break;
			}
			int pool = betting(sc, 1, money, "You have $" + money + ". How much would you like to wager? ", "Sneaky! No negatives or 0!\nPlease enter a bigger number : ", "You only have $" + money + "! Please enter a smaller number : ");
			money -= pool;
			money += slotRoll(pool);
			System.out.println("You now have $" + money + ".");
			lineBreak();
			System.out.print("\n");
			if (money <= 0) {
				break;
			}
		}
		if (money <= 0) {
			System.out.print("You've run out of money! Thanks for coming! Come back soon!");
		} else {
			System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
		}
	}
}
