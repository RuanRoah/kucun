package com.service.impl;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import com.bean.*;
import com.dao.MaterialDao;
import com.service.MaterialService;
import com.util.MybatisUtil;
@Service
public class MaterialServiceImpl implements MaterialService{
	static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MybatisUtil.getSqlsessionfactory();
    }
	
	public ArrayList<MaterialBean> showmaterial(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		MaterialDao ud = (MaterialDao) sqlSession.getMapper(MaterialDao.class);
		ArrayList<MaterialBean> ml = ud.showmaterial();
		sqlSession.close();
		return ml;
	}
	public void insertmaterial(MaterialBean mb){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		MaterialDao ud = (MaterialDao) sqlSession.getMapper(MaterialDao.class);
		ud.insertmaterial(mb);
		sqlSession.commit();
		sqlSession.close();
	}
	public MaterialBean querymaterial(MaterialBean mb){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		MaterialDao ud = (MaterialDao) sqlSession.getMapper(MaterialDao.class);
		sqlSession.close();
		return ud.querymaterial(mb);
	}
	
}