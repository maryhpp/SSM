package com.atguigu.spring5.service;

import com.atguigu.spring5.User;
import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImpl;
import org.junit.Test;

public class UserService {


    //1.创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void add(){
        System.out.println("Service add......" );
        userDao.update();
//        //创建UserDao对象
//        UserDao userdao = new UserDaoImpl();
//        userdao.upadta();

    }


}
