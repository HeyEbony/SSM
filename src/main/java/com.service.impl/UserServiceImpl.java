package com.service.impl;

import com.dao.IUserDAO;
import com.service.IUserService;

import java.util.Map;


public class UserServiceImpl implements IUserService {
    IUserDAO userDAO;
    @Override
    public Map<String,Object> login(String uname, String upwd){
        Map<String, Object> login = userDAO.login(uname,upwd);

        return login;
    }
}
