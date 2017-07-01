package com.bean;

public class UserBean {
	public String username;
	public String passwd;
	public UserBean(String username, String passwd) {
		super();
		this.username = username;
		this.passwd = passwd;
	}
	public UserBean(){
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
}
