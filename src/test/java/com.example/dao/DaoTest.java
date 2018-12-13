package com.example.dao;

import org.junit.After;
import org.junit.Test;

public class DaoTest {

    private UserDao userDao = new UserDao();

    @Test
    public void regist(){
        userDao.add(111,"习近平");
    }

    @After
    public void destory(){
        userDao.close();
    }
}
