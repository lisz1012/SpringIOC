package com.lisz.dao.impl;

import com.lisz.dao.UserDao;

public class UserDaoMySQLImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("从MySQL获取数据");
    }
}
