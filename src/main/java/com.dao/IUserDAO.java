package com.dao;

import java.util.List;
import java.util.Map;

public interface IUserDAO {
    List<Map<String,Object>> login(String uname, String upwd);
}
