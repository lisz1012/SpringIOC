package com.lisz.service;

import com.lisz.dao.UserDao;

public interface UserService {
    public void setUserDao(UserDao userDao);
    public void getUser();
}
