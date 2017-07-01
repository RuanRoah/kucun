package com.dao;
import java.util.ArrayList;
import com.bean.*;
public interface BuysDao {
	public ArrayList<BuysBean> showBuys();
	public void insertBuys(BuysBean buys);
	public void updateBuys(BuysBean buys);	
}