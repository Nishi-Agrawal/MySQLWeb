package dao;

import java.sql.SQLException;

import model.User;

public interface UsertableDAO {
	public User getUser(int id) throws SQLException;
	
	public User getUser(String username) throws SQLException;
	
	public int updateUser(User obj) throws SQLException;
	
	public boolean insertUser(User obj) throws SQLException;

}
