package com.bean;

public class BuysBean {
	private int id;
	private int materialid;
	private String materialname;
	private int num;
	private String materialstatus;
	private String price;
	private String zhuangtai;
	private String detail;
	
	
	public BuysBean(int id, int materialid, String materialname, int num,
			String materialstatus, String price, String zhuangtai, String detail) {
		super();
		this.id = id;
		this.materialid = materialid;
		this.materialname = materialname;
		this.num = num;
		this.materialstatus = materialstatus;
		this.price = price;
		this.zhuangtai = zhuangtai;
		this.detail = detail;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMaterialid() {
		return materialid;
	}
	public void setMaterialid(int materialid) {
		this.materialid = materialid;
	}
	public String getMaterialname() {
		return materialname;
	}
	public void setMaterialname(String materialname) {
		this.materialname = materialname;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getMaterialstatus() {
		return materialstatus;
	}
	public void setMaterialstatus(String materialstatus) {
		this.materialstatus = materialstatus;
	}
	public String getZhuangtai() {
		return zhuangtai;
	}
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public BuysBean() {
		super();
		// TODO Auto-generated constructor stub
	}

}