package com.util;
import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
public class MybatisUtil {
	@SuppressWarnings("unused")
	private final static SqlSessionFactory sqlsessionFactory;
	
	static{
		String resource="com/conf/mybatis-config.xml" ;	
		Reader reader=null;
		try {
			reader=Resources.getResourceAsReader(resource);
			//读写文件
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlsessionFactory=new SqlSessionFactoryBuilder().build(reader);
	}

	public static SqlSessionFactory getSqlsessionfactory() {
		return sqlsessionFactory;
	}
	//全局代码含义是将Mapping.sql封装到sqlsessionFactory里
	
}
