package com.lisz.dao.impl;

import com.lisz.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取用户");
    }
}
