package com.dao;
import java.util.ArrayList;
import com.bean.*;
public interface GoodsDao {
	public ArrayList<GoodsBean> showgoods();
	public void insertgoods(GoodsBean gb);
	public GoodsBean queryGoods(int id);
}
