package db;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicCommandExecute {
	
	public static int delete(String sc) throws FileNotFoundException, IOException, SQLException {
		Connection c = ConnectionFactory.getConnections();
		Statement s = c.createStatement();
		int val = s.executeUpdate(sc);
		c.close();
		return val;
	}
	
	public static void select(String sc) throws SQLException, FileNotFoundException, IOException {
		Connection c = ConnectionFactory.getConnections();
		Statement s = c.createStatement();
		s.executeQuery(sc);
		c.close();
	}
	
	public static void insert(String sc) throws SQLException, FileNotFoundException, IOException {
		Connection c = ConnectionFactory.getConnections();
		Statement s = c.createStatement();
		s.executeQuery(sc);
	}
	
	

	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		String s = "delete from usertable where id = 2";
		System.out.println(delete(s));
	}

}
