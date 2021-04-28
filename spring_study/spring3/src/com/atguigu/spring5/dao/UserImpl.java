package com.atguigu.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "UserImpl1")
public class UserImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("dao add........");
    }
}
