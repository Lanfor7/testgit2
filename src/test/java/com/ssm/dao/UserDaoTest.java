package com.ssm.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserDaoTest {
    @Autowired
    public UserDao userDao;
    @Autowired
    public SqlSession sqlSession;

    /*@Before
    public void setUp() throws Exception {
    }*/

    @Test
    public void queryUserById() {
        System.out.println(userDao.queryUserById("1"));

    }

    @Test
    public void queryUserAll() {
    }

    @Test
    public void insertUser() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void deleteUser() {
    }
}