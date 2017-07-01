package com.service;
import java.util.ArrayList;

import com.bean.*;
public interface GoodsService {
	public ArrayList<GoodsBean> showgoods();
	public void insertgoods(GoodsBean gb);
	public GoodsBean queryGoods(int id);
}
