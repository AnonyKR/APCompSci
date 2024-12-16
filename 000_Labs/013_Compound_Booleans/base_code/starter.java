/*
 *	Author:  Yunu Choi	
 *  Date: 9/11/2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		int num1 = sc.nextInt();
		System.out.print("Please enter your second number: ");
		int num2 = sc.nextInt();
		System.out.print("Please enter your third number: ");
		int num3 = sc.nextInt();
		if ((num1 > num2) && (num1 > num2)) {
			System.out.println("Your first number is the largest of the three!\nThe number was " + num1 + ".");
		} else if ((num2 > num3) && (num2 > num1)) {
			System.out.println("Your second number is the largest of the three!\nThe number was " + num2 + ".");
		} else if ((num3 > num2) && (num3 > num1)) {
			System.out.println("Your third number is the largest of the three!\nThe number was " + num3 + ".");
		}
		if ((num1 < num2) && (num1 < num2)) {
			System.out.println("Your first number is the smallest of the three!\nThe number was " + num1 + ".");
		} else if ((num2 < num3) && (num2 < num1)) {
			System.out.println("Your second number is the smallest of the three!\nThe number was " + num2 + ".");
		} else if ((num3 < num2) && (num3 < num1)) {
			System.out.println("Your third number is the smallest of the three!\nThe number was" + num3 + ".");
		}
	}
}
