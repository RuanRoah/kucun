package com.bean;

public class GoodsBean {
	private int id;
	private String goodsname;
	private String goodsdetail;
	public GoodsBean(int id, String goodsname, String goodsdetail) {
		super();
		this.id = id;
		this.goodsname = goodsname;
		this.goodsdetail=goodsdetail;
	}
	public GoodsBean() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getGoodsdetail() {
		return goodsdetail;
	}
	public void setGoodsdetail(String goodsdetail) {
		this.goodsdetail = goodsdetail;
	}
	
}
