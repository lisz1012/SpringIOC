package com.lisz.service;

import com.lisz.dao.UserDao;
import com.lisz.dao.impl.UserDaoOracleImpl;
import com.lisz.service.impl.UserServiceImpl;
import org.junit.Test;

public class ServiceTest {
    @Test
    public void testUserService() {
        UserService userService = new UserServiceImpl();
        UserDao userDao = new UserDaoOracleImpl();
        userService.setUserDao(userDao);
        userService.getUser();
    }
}
