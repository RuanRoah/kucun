package com.service;

import java.util.ArrayList;

import com.bean.GoodsBean;
import com.bean.PlansBean;

public interface PlansService {
	public void insertplan(PlansBean pb);
	public GoodsBean outofPlan();
	public ArrayList<PlansBean> showplans(int id);
}
