/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static Scanner sc;
	
	public static boolean familiar() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Familiar looking phrase? yes: 1, no: 2");
			System.out.print("> ");
			int ans = sc.nextInt();
			switch (ans) {
				case 1:
					return true;
				case 2:
					return false;
				default:
					System.out.println("Please type vaild answer.");
			} 
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Passage to encode/decode:");
		String toDecode = sc.nextLine();
		boolean validAnswer = false;
		boolean allTry = true;
		while(!validAnswer) {
			System.out.println("Know key? yes: 1, no: 2");
			System.out.print("> ");
			int ans = sc.nextInt();
			switch (ans) {
				case 1:
					allTry = false;
					validAnswer = true;
					break;
				case 2:
					allTry = true;
					validAnswer = true;
					break;
				default:
					System.out.println("Please type vaild answer.");
			}
		}
		int keyVal;
		if (!allTry) {
			System.out.println("What is the key?");
			System.out.print("> ");
			keyVal = sc.nextInt();
			System.out.println("Your encoded/decoded message is:");
			System.out.println(Cipher.keyedEncode(toDecode, keyVal));
			if (!familiar()) {
				allTry = true;
			}
		}
		if (allTry) {
			keyVal = -1;
			while(true) {
				keyVal++;
				System.out.println("Your encoded/decoded message is:");
				System.out.println(Cipher.keyedEncode(toDecode, keyVal));
				if (familiar()) {
					break;
				}
			}
		}
	}
}
