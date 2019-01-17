package com.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
@RequestMapping("/user")
public class UserAction {
    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    @ResponseBody
    public void  login(String uname,String upwd){

    }
}
