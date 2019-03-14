package com.wangcl.test.controller;

import com.wangcl.test.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    IUsersService usersService;

    @RequestMapping("/")
    @ResponseBody
    public Object home(){

        return usersService.selectList(null);
    }
}
