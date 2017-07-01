package com.bean;

public class RoleBean {
	private int id;
	private String rolehref;
	private String rolename;
	public RoleBean(int id, String rolehref, String rolename) {
		super();
		this.id = id;
		this.rolehref = rolehref;
		this.rolename = rolename;
	}
	public RoleBean() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRolehref() {
		return rolehref;
	}
	public void setRolehref(String rolehref) {
		this.rolehref = rolehref;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
}
