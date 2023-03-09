package hibernate.firststep;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.management.loading.PrivateClassLoader;

public class HibernateTest {

	private static String DBURL = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimezone=UTC";
	private static String DBUSER = "hbstudent";
	private static String DBPWD = "hbstudent";

	public static void main(String[] args) {
		try {
			System.out.println("attempting to make a connection to the database ...");
			Connection connection = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
			System.out.println("connection is succesfully made.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
