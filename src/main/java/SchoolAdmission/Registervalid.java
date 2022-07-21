package SchoolAdmission;

import java.util.*;

import SchoolAdmission.Registerinsertion;
import SchoolAdmission.Userregistration;

public class Registervalid {
	public static void menu() throws Exception {
	}

	public static void validatingRegistration(Userregistration car) throws Exception {
		int isNameValid = nameValidation(car.Name);
		int isUserNameValid = userNameValidation(car.userName);
		int isMobileNumberValid = userMobileNumberValidation(car.userMobileNumber);
		int isAgeValid = userAgeValidation(car.userAge);
		int isEmailIdValid = userEmailIdValidation(car.userEmailId);
		int isPasswordValid = userPasswordValidation(car.userPassword);
		int isClassValid = userClassValidation(car.userClass);
		int isMarkValid = userPreviousYearMarkValidation(car.userPreviousYearMark);
		if (isNameValid + isUserNameValid + isMobileNumberValid + isAgeValid + isEmailIdValid + isPasswordValid
				+ isClassValid + isMarkValid== 8) {
			// System.out.println("YOU REGISTERED SUCCESSFULLY");
			/*
			 * System.out.println("Enter 1 to go back Main menu"); int t=i.nextInt();
			 * while(t!=0 || t<=1) { menu(); t=i.nextInt();
			 */
			Registerinsertion.insertUser(car);

		} else {
			throw new Exception("Please Re-Enter Your Details");
		}
	}

	public static int nameValidation(String Name) throws Exception {
		if (Name != null) {
			return 1;
		} else {
			throw new Exception("Enter a Valid Name");
		}
	}

	public static int userNameValidation(String userName) throws Exception {
		if (userName != null) {
			return 1;
		} else {
			throw new Exception("Enter a Valid User Name");
		}
	}

	public static int userMobileNumberValidation(String userMobileNumber) throws Exception {
		char[] mobile = userMobileNumber.toCharArray();
		if (mobile.length == 10) {
			for (char i : mobile) {

				if (Character.isAlphabetic(i))

				{
					throw new Exception("Enter only Numeric values");
				}
			}
		}
		return 1;
	}

	public static int userAgeValidation(int userAge) throws Exception {
		if (userAge < 0) {
			throw new Exception("enter a valid Age");
		} else {
			return 1;
		}
	}

	public static int userClassValidation(int userClass) throws Exception {
		if (userClass == 1 || userClass == 2 || userClass == 3 || userClass == 4 || userClass == 5 || userClass == 6
				|| userClass == 7 || userClass == 8 || userClass == 9 || userClass == 10 || userClass == 11
				|| userClass == 12) {
			return 1;
		} else {
			throw new Exception("Enter a Valid Class");
		}
	}

	public static int userEmailIdValidation(String userEmailId) throws Exception {
		if (userEmailId.contains("@")) {
			return 1;
		} else {
			throw new Exception("Enter Valid email id");
		}
	}

	public static int userPasswordValidation(String userPassword) throws Exception {
		if (userPassword.length() < 10) {
			return 1;
		} else {
			throw new Exception("Enter a Valid Password");
		}
	}
	public static int userPreviousYearMarkValidation(int userMark) throws Exception {
		if (userMark>0) {
			return 1;
		} else {
			throw new Exception("Enter a Valid User PreviousYearMark");
		}
	}
}
