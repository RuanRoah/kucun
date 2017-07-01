package com.service;
import java.util.ArrayList;

import com.bean.*;
public interface BuysService {
	public ArrayList<BuysBean> queryBuys();
	public void insertBuys(BuysBean buys);
	public void updateBuys(BuysBean buys);
	
}