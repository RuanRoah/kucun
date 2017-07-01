package com.bean;
public class MaterialBean {
	private int id;
	private String materialname;
	private String materialstatus;	
	private int materialnum;
	
	
	public int getMaterialnum() {
		return materialnum;
	}

	public void setMaterialnum(int materialnum) {
		this.materialnum = materialnum;
	}

	public MaterialBean(int id, String materialname, String materialstatus,
			int materialnum) {
		super();
		this.id = id;
		this.materialname = materialname;
		this.materialstatus = materialstatus;
		this.materialnum = materialnum;
	}

	public MaterialBean() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaterialname() {
		return materialname;
	}
	public void setMaterialname(String materialname) {
		this.materialname = materialname;
	}
	public String getMaterialstatus() {
		return materialstatus;
	}
	public void setMaterialstatus(String materialstatus) {
		this.materialstatus = materialstatus;
	}
}
