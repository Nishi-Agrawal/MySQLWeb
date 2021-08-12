package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	static Connection c = null;

	public static Connection getConnections() throws FileNotFoundException, IOException {
		String username = "root";
		String password = "Nishi123.";
		String host = "localhost";
		String port = "3306";
		String driver = "com.mysql.cj.jdbc.Driver";
		String dbname = "mysqlweb";
		
//		Properties p = new Properties();
//		p.load(new FileInputStream("./resources/db.properties"));
//		
//		String username = p.getProperty("username");
//		String password = p.getProperty("password");
//		String host = p.getProperty("host");
//		String port = p.getProperty("port");
//		String driver = p.getProperty("driver");
//		String dbname = p.getProperty("dbname");

		if (c == null) {

			try {
				Class.forName(driver);
				c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + dbname, username, password);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}

		return c;
	}

}
