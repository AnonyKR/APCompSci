/*
 *	Author:  Yunu Choi
 *  Date: 11/5/2024
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		int waDead = 0;
		int wiDead = 0;
		Warrior[] wa = new Warrior[100];
		Wizard[] wi = new Wizard[wa.length];
		for (int i = 0; i < wa.length; i++) {
			wa[i] = new Warrior();
			wi[i] = new Wizard();
		}
		while(true) {
			try {
				wi[wiDead].attack(wa[waDead]);
				if(wa[waDead].isDead()) {
					waDead += 1;
				}
				wa[waDead].attack(wi[wiDead]);
				if(wi[wiDead].isDead()) {
					wiDead += 1;
				}
			} catch (Exception e) {
				break;
			}
		}
		if (waDead >= wa.length) {
			System.out.println("Wizards won with " + (wi.length - wiDead) + " left in their army.");
		} else if (wiDead >= wi.length) {
			System.out.println("Warriors won with " + (wa.length - waDead) + " left in their army.");
		}
	}
}
