/*
 *	Author: Yunu Choi
 *  Date: 10/22/2024
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		//Employee michael = new Employee();
		//michael.employeeToString();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.0);
		Employee amy = new Employee(3141, "Amy", "Null", 3578.6);
		dwight.raiseSalary(3);
		jim.raiseSalary(8);
		pam.raiseSalary(7);
		amy.raiseSalary(5);
		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();
		amy.employeeToString();
	}
}
