package SchoolAdmission;

import java.util.Scanner;

import SchoolAdmission.Register;

public class Registerclass {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		System.out.println("'WELCOME FOR SCHOOL ADMISSION'");
		System.out.println("Enter your option");
		System.out.println("Enter 1 for Register");
		System.out.println("Enter 2 for Login");
		int option = sc.nextInt();
		/*
		 * while(option>=3) { System.out.println("Enter a valid password");
		 * option=i.nextInt(); }
		 */

		// enter option register or login
		if (option == 1) {
			Register.registration();
		} else if (option == 2) {
			Register.logininputs();

		}
	}

	// Registervalid.menu();

}
