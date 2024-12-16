/*
 *	Author:  Yunu Choi 
 *  Date: 11/7/2024
*/

package pkg;
import java.util.*;

public class Spiderman {
	private int age;
	private String actor;
	private String evil;
	
	public Spiderman() {
		this.actor = "Miles Morales";
		this.age = 13;
		this.evil = "King Pin";
	}
	
	public Spiderman(String actor) {
		this.actor = actor;
		this.age = 0;
		this.evil = "None";
	}
	
	public Spiderman(String actor, int age) {
		this.actor = actor;
		this.age = age;
		this.evil = "None";
	}
	
	public Spiderman(String actor, String evil) {
		this.actor = actor;
		this.evil = evil;
		this.age = 0;
	}
	
	public void print() {
		System.out.println("\n--------------------------------");
		System.out.println("The actor " + this.actor + " is " + this.age + " years old.");
		System.out.println("They play Spiderman who's villain is " + this.evil + ".");
		System.out.println("--------------------------------");
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setVillain(String evil) {
		this.evil = evil;
	}
}
