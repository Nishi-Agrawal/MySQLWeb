package model;

import java.sql.Timestamp;

public class User {
	private int id, age ;
	private String username, password, email, activation_string, forgot_key, first_name, last_name;
	private char status, gender;
	private Timestamp create_date, activation_date;
	
	public int getId() {
		return id;
	}
	
	
	public User(int id) {
		super();
		this.id = id;
	}



	public User(int id, int age, String username, String password, String email, String activation_string,
			String forgot_key, String first_name, String last_name, char status, char gender, Timestamp create_date,
			Timestamp activation_date) {
		super();
		this.id = id;
		this.age = age;
		this.username = username;
		this.password = password;
		this.email = email;
		this.activation_string = activation_string;
		this.forgot_key = forgot_key;
		this.first_name = first_name;
		this.last_name = last_name;
		this.status = status;
		this.gender = gender;
		this.create_date = create_date;
		this.activation_date = activation_date;
	}


	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getActivation_string() {
		return activation_string;
	}
	public void setActivation_string(String activation_string) {
		this.activation_string = activation_string;
	}
	public String getForgot_key() {
		return forgot_key;
	}
	public void setForgot_key(String forgot_key) {
		this.forgot_key = forgot_key;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Timestamp getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Timestamp create_date) {
		this.create_date = create_date;
	}
	public Timestamp getActivation_date() {
		return activation_date;
	}
	public void setActivation_date(Timestamp activation_date) {
		this.activation_date = activation_date;
	}


	@Override
	public String toString() {
		return "Usertable [id=" + id + ", age=" + age + ", username=" + username + ", password=" + password + ", email="
				+ email + ", activation_string=" + activation_string + ", forgot_key=" + forgot_key + ", first_name="
				+ first_name + ", last_name=" + last_name + ", status=" + status + ", gender=" + gender
				+ ", create_date=" + create_date + ", activation_date=" + activation_date + "]";
	}
	
	
	
}
