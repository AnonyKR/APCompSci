/*
 *	Author: Yunu Choi
 *  Date: 10/22/2024
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dog name?");
		Dog dog1 = new Dog(sc.nextLine());
		System.out.println("What age should " + dog1.getName() + " be?");
		dog1.setAge(sc.nextInt());
		System.out.println(dog1.getName() + " is a " + dog1.getBreed() + " that is " + dog1.getAge() + " years old!");
		Dog dog2 = new Dog("Toto", "Cairn Terrier");
		System.out.println(dog2.getName() + " is a " + dog2.getBreed() + " that is " + dog2.getAge() + " years old!");
		boolean dog1sleep = dog1.isSleeping();
		if (!dog1sleep) {
			System.out.println(dog1.getName() + " is awake!");
			dog1.bark();
		} else {
			System.out.println(dog1.getName() + " is sleeping! Don't wake " + dog1.getName() + " up!");
		}
		if (dog2.isSleeping()) {
			if (!dog1sleep) {
				System.out.println(dog2.getName() + " wakes up from hearing " + dog1.getName());
				dog2.bark();
			} else {
				System.out.println(dog2.getName() + " is sleeping too!");
			}
		} else {
			if (!dog1sleep) {
				System.out.println(dog2.getName() + " hears " + dog1.getName() + "!");
				dog2.bark();
			} else { 
				System.out.println(dog2.getName() + " isn't sleeping!");
			}
		}
	}
}
