package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import dao.UsertableDAO;
import db.ConnectionFactory;
import model.User;

public class UsertableDAOImpl implements UsertableDAO{
	Connection c;
	public UsertableDAOImpl() {
		super();
		
		try {
			c = ConnectionFactory.getConnections();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public User getUser(int id) throws SQLException {
		User u = null;
		PreparedStatement s = c.prepareStatement("Select * from usertable where id = ?");
		s.setInt(1, id);
		ResultSet rs = s.executeQuery();
		if(rs.next()) {
			//u = new User(id);
			u = new User(rs.getInt("id"));
			u.setUsername(rs.getString("username"));
			u.setUsername(rs.getString("username"));
			u.setAge(rs.getInt("age"));
			u.setPassword(rs.getString("password"));
			u.setEmail(rs.getString("email"));
			u.setActivation_string(rs.getString("activation_key"));
			u.setForgot_key(rs.getString("forgot_key"));
			u.setFirst_name(rs.getString("first_name"));
			u.setLast_name(rs.getString("last_name"));
			String status = rs.getString("status");
			if((status != null) && (status.length() > 0)) {
				u.setStatus(rs.getString("status").charAt(0));
			}
			String gender = rs.getString("gender");
			if((gender != null) && (gender.length() > 0)) {
				u.setGender(rs.getString("gender").charAt(0));
			}
			u.setCreate_date(rs.getTimestamp("create_date"));
			u.setActivation_date(rs.getTimestamp("activation_date"));
		}
		
		return u;
	}
	
	

	@Override
	public User getUser(String username) throws SQLException {
		User u = null;
		PreparedStatement s = c.prepareStatement("Select * from usertable where username = ?");
		s.setString(1, username);
		ResultSet rs = s.executeQuery();
		
		
		if(rs.next()) {
			u = new User(rs.getInt("id"));
			u.setUsername(rs.getString("username"));
			u.setUsername(rs.getString("username"));
			u.setAge(rs.getInt("age"));
			u.setPassword(rs.getString("password"));
			u.setEmail(rs.getString("email"));
			u.setActivation_string(rs.getString("activation_key"));
			u.setForgot_key(rs.getString("forgot_key"));
			u.setFirst_name(rs.getString("first_name"));
			u.setLast_name(rs.getString("last_name"));
			String status = rs.getString("status");
			if((status != null) && (status.length() > 0)) {
				u.setStatus(rs.getString("status").charAt(0));
			}
			String gender = rs.getString("gender");
			if((gender != null) && (gender.length() > 0)) {
				u.setGender(rs.getString("gender").charAt(0));
			}
			u.setCreate_date(rs.getTimestamp("create_date"));
			u.setActivation_date(rs.getTimestamp("activation_date"));

		}
		
		return u;
	}

	@Override
	public int updateUser(User user) throws SQLException{
		PreparedStatement s = c.prepareStatement("update usertable set password = ?, age = ?, forgot_key = ?,"
				+ "  first_name = ?, last_name = ?, status = ?, gender = ?, activation_date = ? where id = ?");
		s.setString(1, user.getPassword());
		s.setInt(2, user.getAge());
		s.setString(3, user.getForgot_key());
		s.setString(4, user.getFirst_name());
		s.setString(5, user.getLast_name());
		s.setString(6, user.getStatus()+ "");
		s.setString(7, user.getGender()+"");
		s.setTimestamp(8, user.getActivation_date());
		s.setInt(9, user.getId());
		
		return s.executeUpdate();
		
	}


	@Override
	public boolean insertUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		
		PreparedStatement s = c.prepareStatement("insert into usertable (username, password, email, "
				+ "status, activation_key, create_date) values( ?, ?, ?, ?, ?, ?)");
		s.setString(1, user.getUsername());
		s.setString(2, user.getPassword());
		s.setString(3, user.getEmail());
		s.setString(4, user.getStatus()+"");
		s.setString(5, user.getActivation_string());
		s.setTimestamp(6, user.getCreate_date());
		
		if(s.executeUpdate() == 1) {
			return true;
		}
		
		return false;
	}

}
