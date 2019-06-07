package com.onedata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "signup")
public class Employee {
	private long id;
	private  String userName;
	private  String firstName;
	private  String lastName;
	private  String password;
	private  String confirmPassword;
	

public Employee()
{
	
}
public Employee(String username,String firstName,String lastName,String password,String confirmPassword)
{
	this.userName=username;
	this.firstName=firstName;
	this.lastName=lastName;
	this.password=password;
	this.confirmPassword=confirmPassword;
	
}
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
    return id;
}
public void setId(long id) {
    this.id = id;
}

@Column(name = "user_name", nullable = false)
public String getUserName() {
    return userName;
}
public void setUserName(String userName) {
	
    this.userName = userName;
}

@Column(name = "first_name", nullable = false)
public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
@Column(name = "last_name", nullable = false)
public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
@Column(name = "password", nullable = false)
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}
@Column(name = "confirm_password", nullable = false)
public String getConfirmPassword() {
    return confirmPassword;
}
public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
}

}
