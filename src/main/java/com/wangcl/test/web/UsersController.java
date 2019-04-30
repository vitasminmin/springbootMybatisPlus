package com.wangcl.test.web;


import com.wangcl.test.controller.SuperController;
import com.wangcl.test.entity.Users;
import com.wangcl.test.learn.Pigment;
import com.wangcl.test.learn.WritingBrush;
import com.wangcl.test.service.impl.UsersServiceImpl;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 用户表 前端控制器123
 * </p>
 *
 * @author wangcl
 * @since 2019-03-10
 */
@RestController
@RequestMapping("/test/users")
public class UsersController extends SuperController<UsersServiceImpl, Users> {
    @Resource(name = "blue")
    private Pigment pigment;
    @Resource(name = "small")
    private WritingBrush writingBrush;

    @ResponseBody
    @RequestMapping("/test")
    public void writing(){
        writingBrush.setPigment(pigment);
        writingBrush.writeWithPigment();
    }

}
