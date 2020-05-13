package com.ssm.dao;

import com.ssm.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Autowired
    public SqlSession sqlSession;

    public UserDaoImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public User queryUserById(String id) {
        return sqlSession.selectOne("UserDao.queryUserById", id);
    }

    @Override
    public List<User> queryUserAll() {
        return sqlSession.selectList("UserDao.queryUserAll");
    }

    @Override
    public void insertUser(User user) {
        sqlSession.insert("UserDao.insertUser", user);
    }

    @Override
    public void updateUser(User user) {
        sqlSession.update("UserDao.updateUser", user);
    }

    @Override
    public void deleteUser(String id) {
        sqlSession.delete("UserDao.deleteUser", id);
    }



}
