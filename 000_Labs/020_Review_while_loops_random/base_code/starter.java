/*
 *	Author:  Yunu Choi	
 *  Date: 9/24/202
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int goal = (int) (Math.random() * 1000);
		int guess = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Guess a number: ");
			guess = sc.nextInt();
			if (guess == goal) {
				System.out.print("You guessed it!");
				break;
			} else if (guess < goal) {
				System.out.println("You're a little too low!\n");
			} else {
				System.out.println("You're a little too high!\n");
			}
		}
	}
}
