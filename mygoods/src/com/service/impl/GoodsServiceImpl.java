package com.service.impl;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import com.bean.*;
import com.dao.GoodsDao;
import com.dao.MaterialDao;
import com.service.GoodsService;
import com.util.MybatisUtil;
@Service
public class GoodsServiceImpl implements GoodsService{
	static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MybatisUtil.getSqlsessionfactory();
    }
	public ArrayList<GoodsBean> showgoods(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		GoodsDao gd = (GoodsDao) sqlSession.getMapper(GoodsDao.class);
		ArrayList<GoodsBean> gl = gd.showgoods();
		return gl;
	}
	public void insertgoods(GoodsBean gb){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		GoodsDao gd = (GoodsDao) sqlSession.getMapper(GoodsDao.class);
		gd.insertgoods(gb);
		sqlSession.close();
	}
	@Override
	public GoodsBean queryGoods(int id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		GoodsDao gd = (GoodsDao) sqlSession.getMapper(GoodsDao.class);
		GoodsBean g=gd.queryGoods(id);
		sqlSession.close();
		return g;
	}
}
