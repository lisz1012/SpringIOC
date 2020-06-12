package com.lisz.service.impl;

import com.lisz.dao.UserDao;
import com.lisz.dao.impl.UserDaoImpl;
import com.lisz.dao.impl.UserDaoMySQLImpl;
import com.lisz.dao.impl.UserDaoOracleImpl;
import com.lisz.service.UserService;

public class UserServiceImpl implements UserService {

    //private UserDao userDao = new UserDaoImpl();
    //private UserDao userDao = new UserDaoMySQLImpl();
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
