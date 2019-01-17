package com.dao.impl;

import com.dao.IUserDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("userDAO")
public class UserDAOImpl implements IUserDAO {
    @Autowired
    SqlSessionFactory sqlSessionFactoryBean;
    @Override
    public List<Map<String,String>> login(String uname,String upwd){
        SqlSession sqlSession = sqlSessionFactoryBean.openSession(true);
String sql="com.isoft.mapping.User.login";
        List<Object> objects = sqlSession.selectList(sql);
        return objects;
    }

}
