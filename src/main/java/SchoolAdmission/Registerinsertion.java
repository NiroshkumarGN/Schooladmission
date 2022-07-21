package SchoolAdmission;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Registerinsertion {
	private static Object i;

	public static void runquery(String query) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db",
				"rev_user", "rev_user");
		// System.out.println(connection);
		// System.out.println(query);
		java.sql.Statement statement = connection.createStatement();
		int rows = statement.executeUpdate(query);
		connection.close();
	}

	public static void insertUser(Userregistration obj) throws Exception {
		String query1 = "insert into school_admission(Name,user_Name,user_MobileNumber,user_Age,user_Class,user_EmailId,user_Password,user_PreviousYearMark)values('"
				+ obj.Name + "','" + obj.userName + "','" + obj.userMobileNumber + "','" + obj.userAge + "','"
				+ obj.userClass + "','" + obj.userEmailId + "','" + obj.userPassword + "','" + obj.userPreviousYearMark
				+ "')";
		// System.out.println(query1);
		System.out.println("YOU REGISTERED SUCCESSFULLY");
		/*
		 * System.out.println("Enter 1 to go back Main menu"); int t=(i).nextInt();
		 * while(t!=0 || t<=1) { menu(); t=i.nextInt(); }
		 */
		runquery(query1);
	}

}
