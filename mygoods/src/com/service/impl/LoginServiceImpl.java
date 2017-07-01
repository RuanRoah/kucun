package com.service.impl;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import com.bean.RoleBean;
import com.bean.UserBean;
import com.dao.*;
import com.service.LoginService;
import com.util.MybatisUtil;
@Service
public class LoginServiceImpl implements LoginService{
	static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactory = MybatisUtil.getSqlsessionfactory();
    }
	
    @SuppressWarnings("finally")
	public String getLoginResult(UserBean user){
    	SqlSession sqlSession = sqlSessionFactory.openSession();
		String get = "";
		UserBean ub=new UserBean();
		try {
            UserDao ud = (UserDao) sqlSession.getMapper(UserDao.class);
            ub=ud.getuser(user);
            
            sqlSession.commit();
            /*�ύ����*/
        } catch(Exception e){
        	sqlSession.rollback();
        	/*������ִ�������ع�*/
        	
        }finally {
        	sqlSession.close();
        	/*�ر����ݿ�Ự*/
        }
        /*��֤����*/   
		
		try{
			if(user.getUsername().equals(ub.getUsername())){
	        	if(user.getPasswd().equals(ub.getPasswd())){
	        		get="success";
	        	}else{
	        		get="�������";
	        }
	     }	
		/*��ָ������û�������*/
		}catch(NullPointerException e){
			get="�û�������";
		}finally{
			return get;
		}
	}

	@Override
	public ArrayList<RoleBean> ShowRole() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		ArrayList<RoleBean> rl=new ArrayList<RoleBean>();
		RoleDao rd=(RoleDao) sqlSession.getMapper(RoleDao.class);
		rl=rd.showrole();
		return rl;		
	}
}
