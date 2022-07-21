
package SchoolAdmission;
import java.util.Scanner;


import java.util.Scanner;

import SchoolAdmission.LoginValidationUsingDatabase;
import SchoolAdmission.Registervalid;
import SchoolAdmission.Userregistration;

public class Register {
	static Scanner sc = new Scanner(System.in);

	public static void registration() {
		System.out.println("Enter your Name");
		String name = sc.next();
		System.out.println("Enter user Name");
		String userName = sc.next();
		System.out.println("Enter your Mobile Number ");
		String userMobileNumber = sc.next();
		System.out.println("Enter your Age");
		int userAge = sc.nextInt();
		System.out.println(
				"Enter your Class (mention it as 1 or 2 or 3 or 4 or 5 or 6 or 7 or 8 or 9 or 10 or 11 or 12)");
		int userClass = sc.nextInt();
		System.out.println("Enter your E-mail ID");
		String userEmailId = sc.next();
		System.out.println("Enter your Password");
		String userPassword = sc.next();
		System.out.println("Enter your UserMark");
		int userPreviousYearMark = sc.nextInt();
		Userregistration car = new Userregistration(name, userName, userMobileNumber, userAge, userClass, userEmailId,userPassword, userPreviousYearMark );
		
		try {
			Registervalid.validatingRegistration(car);
		} catch (Exception e) {
			System.out.println("error..!!" + e.getMessage());
		}
	}

	public static void logininputs() throws Exception
	{
	System.out.println("Enter your EmailId");
	String email=sc.next();
	System.out.println("Enter your Password");
	String password=sc.next();
	try
	{
	//loginValidation.loginValidator(pen);
	String mail=LoginValidationUsingDatabase.loginValidatorUsingDatabase(email,password);
	AdmissionStatus.acceptorreject();
	}catch(Exception e)
	{
	System.out.println("error..!!"+e.getMessage());
	}
	}
}


