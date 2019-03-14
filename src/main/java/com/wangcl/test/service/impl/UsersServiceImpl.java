package com.wangcl.test.service.impl;

import com.wangcl.test.entity.Users;
import com.wangcl.test.mapper.UsersMapper;
import com.wangcl.test.service.IUsersService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author wangcl
 * @since 2019-03-09
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
