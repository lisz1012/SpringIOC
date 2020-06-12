package com.lisz.dao.impl;

import com.lisz.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("从Oracle获取数据");
    }
}
