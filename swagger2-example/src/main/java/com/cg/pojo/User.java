package com.cg.pojo;

public class User {

	private String userName;
	private long salary;
	
	public User() {
		
	}
	public User(String userName, long salary) {
		
		this.userName = userName;
		this.salary = salary;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
}
