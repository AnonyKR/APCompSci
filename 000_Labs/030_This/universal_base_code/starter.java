/*
 *	Author:  Yunu Choi
 *  Date: 10/22/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
		ArrayList<PooleDwarf> sevenDs = new ArrayList<PooleDwarf>();
		int caseSame = 0;
		for (int i = 0; i < 7; i++) {
			sevenDs.add(new PooleDwarf(randName(), (int)(Math.random() * 100 + 1)));
			if (i != 0 && sevenDs.get(0).isSameName(sevenDs.get(i).getName())) {
				caseSame += 1;
			}
		}
		System.out.println(sevenDs.get(0).getName() + " was the name with " + caseSame + " matches!");
	}
}
