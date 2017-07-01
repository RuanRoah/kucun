package com.dao;

import java.util.ArrayList;

import com.bean.PlansBean;

public interface PlansDao {
	public void insertplan(PlansBean pb);
	public ArrayList<PlansBean> showplans(int id);
}
