/*
 *	Author: Yunu Choi
 *  Date:9/11/2024
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int inVal = sc.nextInt();
		System.out.println("Here are the 5 next numbers!");
		for(int i = 0;i < 6;i++) {
			System.out.print(inVal + i);
			if(i != 5) {
				System.out.print(", ");
			}
		}
		System.out.println("\nHere are the 5 multiples of " + inVal + "!");
		for(int i = 1;i < 7;i++) {
			System.out.print(inVal * i);
			if(i != 6) {
				System.out.print(", ");
			}
		}
		System.out.println("\nHere is " + inVal + " divided by 100!");
		System.out.println(inVal / 100.0);
		System.out.println("Here is " + inVal + " divided by 10!");
		System.out.println(inVal / 10.0);
	}
}
