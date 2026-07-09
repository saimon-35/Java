package banking;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
	static Connection con;
	
	public static Connection getConnection() {
		try {
			String mysqlJDBCDriver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3307/bank";
			String user = "root";
			String pass = "82008200";
			Class.forName(mysqlJDBCDriver);
			con = DriverManager.getConnection(url, user, pass);
		}catch(Exception e) {
			System.out.println("Connection Failed! " + e.getMessage());
		}
		return con;
	}
}
