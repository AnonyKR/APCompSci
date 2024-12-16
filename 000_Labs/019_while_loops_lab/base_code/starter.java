/*
 *	Author:  Yunu Choi
 *  Date: 9/24/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a name: ");
		String name = sc.nextLine();
		System.out.print("How many times would you like this name to be repeated? ");
		int rep = sc.nextInt();
		int c = 0;
		while (true) {
			System.out.println(name);
			c += 1;
			if (c == rep) {
				break;
			}
		}
	}
}
