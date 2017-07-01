package com.service.impl;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.bean.GoodsBean;
import com.bean.PlansBean;
import com.dao.GoodsDao;
import com.dao.PlansDao;
import com.service.*;
import com.util.MybatisUtil;
public class PlansServiceImpl implements PlansService{
	static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MybatisUtil.getSqlsessionfactory();
    }
	@Override
	public void insertplan(PlansBean pb) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GoodsBean outofPlan() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<PlansBean> showplans(int id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		PlansDao gd = (PlansDao) sqlSession.getMapper(PlansDao.class);
		ArrayList<PlansBean> a=gd.showplans(id);
		return a;
	}

}
