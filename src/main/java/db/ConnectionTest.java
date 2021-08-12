package db;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import dao.impl.UsertableDAOImpl;
import model.User;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
		/*Connection c = ConnectionFactory.getConnections();
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("SELECT * FROM usertable");
		while(rs.next()) {
			System.out.println(rs.getString("age"));
		}
		c.close();*/
		
		User user = new User(3);
		user.setPassword("dummysdjknca");
		user.setGender('F');
		user.setStatus('a');
		user.setFirst_name("Nishi");
		user.setLast_name("A");
		Timestamp t = new Timestamp(System.currentTimeMillis());
		user.setActivation_date(t);
		UsertableDAOImpl usertable = new UsertableDAOImpl();
		
		System.out.println(usertable.updateUser(user));
		User s = usertable.getUser(3);
		//returns null, but same thing with string works
		System.out.println(s.getFirst_name() + s.getUsername());
		System.out.println(user.toString());
//		User u2 = new User(5);
//		u2.setEmail("jnsajxnksd");
//		u2.setPassword("jasdnjamnd,");
//		u2.setUsername("sajdn");
//		u2.setStatus('a');
//		u2.setActivation_string("dhwjna");
//		u2.setCreate_date(t);
//		System.out.println(usertable.insertUser(u2));
		
	}

}
