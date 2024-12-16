/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] nums = new int[1000];
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 10; j++) {
				nums[10 * i + j] = (int) (Math.random() * 10);
				System.out.print(nums[10 * i + j] + " ");
			}	
			System.out.print("\n");
		}
	}
}
