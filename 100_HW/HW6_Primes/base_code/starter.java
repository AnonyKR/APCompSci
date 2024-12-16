/*
 *	Author: Yunu Choi
 *  Date: 10/8/2024
*/

import java.util.Scanner;
import java.util.ArrayList;

class starter {
	public static boolean checkPrime(int checkNum, ArrayList<Integer> primes) {
		int pseudoMax = (int) Math.sqrt(checkNum) + 2;
		for(int i = 0; i < primes.size(); i++) {
			if (primes.get(i) >= pseudoMax) {
				return true;
			}
			if (checkNum % primes.get(i) == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void printPrimes(int upToNum) {
		if (upToNum < 2) {
			return;
		}
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i = 2; i < upToNum + 1; i++) {
			if(checkPrime(i, primes)) {
				primes.add(i);
				System.out.println(i);
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		printPrimes(sc.nextInt());
	}
}
