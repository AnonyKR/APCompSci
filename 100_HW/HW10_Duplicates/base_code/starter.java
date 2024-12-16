/*
 *	Author: Yunu Choi
 *  Date: 11/5/2024
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static int ran10() {
		return (int) (Math.random() * 10 + 1);
	}
	
	public static void main(String args[]) {
		int[] nums = new int[20];
		int target = ran10();
		int timesFound = 0;
		boolean[] locTarget = new boolean[20];
		boolean[] inARow = new boolean[20];
		int before = -1; //to make first inARow false
		System.out.println("----------------------------------------------------");
		System.out.println("These are the " + nums.length + " numbers");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ran10();
			System.out.print("" + nums[i] + " ");
			if (nums[i] == target) {
				locTarget[i] = true;
				timesFound++;
			} else {
				locTarget[i] = false;
			}
			if (nums[i] == before) {
				inARow[i] = true;
			} else {
				inARow[i] = false;
			}
			before = nums[i];
		}
		System.out.println("\n----------------------------------------------------");
		System.out.println("The random number to look for is " + target);
		for (int i = 0; i < locTarget.length; i++) {
			if(locTarget[i]) {
				System.out.println("Duplicate found at index " + i);
			}
		}
		System.out.println("Total number of duplicates for " + target + " is " + timesFound);
		System.out.println("----------------------------------------------------\nLooking for two in a row: ");
		for (int i = 0; i < inARow.length; i++) {
			if(inARow[i]) {
				System.out.println("Two in a row found at indexes " + (i - 1) + " and " + i + ". The number is " + nums[i]);
			}
		}
	}
}
