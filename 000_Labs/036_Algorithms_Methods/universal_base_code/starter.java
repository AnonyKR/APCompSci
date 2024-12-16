/*
 *	Author:  Yunu Choi
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static int getArrayAverage(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return (int) (sum / a.length);
	}
	
	public static int getArrayMax(int[] a) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static int getArrayMin(int[] a) {
		int min = 101;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	
	public static void main(String args[]) {
		int[] a = new int[100];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100 + 1);
		}
		toStringArray(a);
		System.out.println("The average of " + a.length + " random numbers is: " + getArrayAverage(a));
		System.out.println("The maximum of " + a.length + " random numbers is: " + getArrayMax(a));
		System.out.println("The minimum of " + a.length + " random numbers is: " + getArrayMin(a));
	}
}
