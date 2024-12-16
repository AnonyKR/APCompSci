/*
 *	Author:Yunu Choi
 *  Date:9/16/2024
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer: ");
		int low = sc.nextInt();
		System.out.print("Please enter another integer (bigger than the first): ");
		int high = sc.nextInt();
		System.out.println("\nYour range is " + low + " to " + high + ".");
		if (low > high) {
			int temp = high;
			high = low;
			low = high;
		}
		System.out.println("Here are 5 numbers generated in that range.");
		if (low == high) {
			for(int i = 0;i < 5;i++){
				System.out.print(low);
				if (i != 4) {
					System.out.print(", ");
				}
			}
		} else {
			for(int i = 0;i < 5;i++){
				System.out.print((int)(Math.random() * (high - low) + low));
				if (i != 4) {
					System.out.print(", ");
				}
			}
		}
	}
}
