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
            /*提交事务*/
        } catch(Exception e){
        	sqlSession.rollback();
        	/*如果出现错误，事务回滚*/
        	
        }finally {
        	sqlSession.close();
        	/*关闭数据库会话*/
        }
        /*验证部分*/   
		
		try{
			if(user.getUsername().equals(ub.getUsername())){
	        	if(user.getPasswd().equals(ub.getPasswd())){
	        		get="success";
	        	}else{
	        		get="密码错误";
	        }
	     }	
		/*空指针代表用户不存在*/
		}catch(NullPointerException e){
			get="用户不存在";
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
