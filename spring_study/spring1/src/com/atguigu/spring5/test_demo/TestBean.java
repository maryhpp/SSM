package com.atguigu.spring5.test_demo;

import com.atguigu.spring5.bean.Emp;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void testBean1(){
        //1 加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //2 获取配置文件
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();

    }


    @Test
    public void testBean2(){
        //1 加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        //2 获取配置文件
        Emp emp = context.getBean("emp", Emp.class);

        emp.add();
    }
}
