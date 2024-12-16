/*
 *	Author: Yunu Choi
 *  Date: 9/19/2024
 *	Collaborator(s):  
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter what day it is (0-6): ");
		int day = sc.nextInt();
		switch(day) {
			case 0, 6:
				System.out.print("It's a weekend! It's 10AM!");
				break;
			case 1, 2, 3, 4, 5:
				System.out.print("It's a weekday! Wake up! It's 7AM!");
				break;
			default:
				System.out.print("You input something invalid!");
		}
	}
}
