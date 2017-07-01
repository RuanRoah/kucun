package com.service.impl;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import com.bean.*;
import com.dao.BuysDao;
import com.dao.GoodsDao;
import com.dao.MaterialDao;
import com.service.*;
import com.util.MybatisUtil;
@Service
public class BuysServiceImpl implements BuysService{
	static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MybatisUtil.getSqlsessionfactory();
    }
	
	public ArrayList<BuysBean> queryBuys(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BuysDao bd = (BuysDao) sqlSession.getMapper(BuysDao.class);
		ArrayList<BuysBean> bb=bd.showBuys();
		sqlSession.close();
		return bb;
	}
	public void insertBuys(BuysBean buys){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		BuysDao ud = (BuysDao) sqlSession.getMapper(BuysDao.class);
		ud.insertBuys(buys);
		sqlSession.commit();
		sqlSession.close();
	}
	public void updateBuys(BuysBean buys){
		
	}
}