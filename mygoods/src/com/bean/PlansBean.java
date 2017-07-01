package com.bean;

public class PlansBean {
	private int goodsid; 
	private String goodsname;
	private String materialname;
	private String materialneednum;
	private String materialnum;
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getMaterialname() {
		return materialname;
	}
	public void setMaterialname(String materialname) {
		this.materialname = materialname;
	}
	public String getMaterialneednum() {
		return materialneednum;
	}
	public void setMaterialneednum(String materialneednum) {
		this.materialneednum = materialneednum;
	}
	public String getMaterialnum() {
		return materialnum;
	}
	public void setMaterialnum(String materialnum) {
		this.materialnum = materialnum;
	}
	public PlansBean(int goodsid,String goodsname, String materialname,
			String materialneednum, String materialnum) {
		super();
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.materialname = materialname;
		this.materialneednum = materialneednum;
		this.materialnum = materialnum;
	}
	public PlansBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
