package com.cn.oa.service.impl;

import com.cn.oa.dao.UserDao;
import com.cn.oa.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by lijunhong on 16/8/26.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;


}
