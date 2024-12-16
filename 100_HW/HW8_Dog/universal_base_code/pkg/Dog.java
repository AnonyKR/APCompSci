package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	
	public Dog() {
		this.name = new String("Clifford");
		this.age = 3;
		this.breed = new String("Big red dog");
	}

	public Dog(String name) {
		this.name = name;
		this.age = 1;
		this.breed = new String("Dog dog");
	}
	
	public Dog(String name, String breed) {
		this.name = name;
		this.age = 1;
		this.breed = breed;
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		this.breed = new String("Dog dog");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public boolean isSleeping() {
		return ((int)(Math.random() * 2) == 1);
	}
	
	public void bark() {
		System.out.println(this.name + new String(" barks"));
	}
}
