/*
 *	Author:  Yunu Choi
 *  Date: 9/11/2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input your first number: ");
		int num1 = sc.nextInt();
		System.out.print("Please input your second number: ");
		int num2 = sc.nextInt();
		if(num1 != num2) {
			System.out.print("Your numbers are different!");
		} else {
			System.out.print("Your numbers are same!");
		}
	}
}
