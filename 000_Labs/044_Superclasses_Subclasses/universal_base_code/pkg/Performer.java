/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Performer {
	String name;
	int age;

	public Performer() {
		this.name = "Doja Cat";
		this.age = 26;
	}
	
	public Performer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void practice() {
		System.out.println(this.name + " practices!");
	}
	
	public void perform() {
		System.out.println(this.name + " performs on stage to an audience!");
	}
}

