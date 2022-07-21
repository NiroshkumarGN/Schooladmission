package SchoolAdmission;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class AdmissionStatus {
	public static void acceptorreject() throws Exception
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter email");
		String email=obj.next();
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
	String query = "SELECT user_PreviousYearMark FROM school_admission where user_EmailId='"+email+"'";
	Statement st = (Statement) connection.createStatement();
	ResultSet rs = ((java.sql.Statement) st).executeQuery(query);
	float mark1 = 0;
	System.out.println(" Applicants status......");
	while(rs.next())
	{
	String a=null;
	mark1=rs.getFloat("user_PreviousYearMark");
	if(mark1>=50)
	{
	a="Accepted";
	}
	else
	{
	a="Denied";
	}
	String query2="UPDATE school_admission SET user_status='"+a+"' WHERE user_PreviousYearMark='"+mark1+"' ";
	Registerinsertion.runquery(query2);
	System.out.println(a);
	}
	}

	

	

}
