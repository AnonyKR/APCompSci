/*
 *	Author:  Yunu Choi
 *  Date: 10/28/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int arraySize = (int) (Math.random() * 150 + 51);
		int[] nums = new int[arraySize];
		int elements = 0;
		int min = 101;
		int max = 0;
		double ave = 0.0;
		for (int i = 0; i < arraySize; i++) {
			nums[i] = (int) (Math.random() * 100 + 1);
			if (nums[i] < min) {
				min = nums[i];
			}
			if (nums[i] > max) {
				max = nums[i];
			}
			ave += nums[i] / (double) arraySize;
		}
		System.out.println("There are " + arraySize + " elements.");
		System.out.println("The maximum of " + arraySize + " random numbers is: " + max);
		System.out.println("The minimum of " + arraySize + " random numbers is: " + min);
		System.out.println("The average of " + arraySize + " random numbers is: " + (int) ave);
	}
}
