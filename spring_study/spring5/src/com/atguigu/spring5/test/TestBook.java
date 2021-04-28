package com.atguigu.spring5.test;

import com.atguigu.spring5.entity.Book;
import com.atguigu.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {

    @Test
    public void testJdbcTemplate(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
          //添加
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java");
//        book.setUstatus("a");
//        bookService.addBook(book);

//        //修改
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("javaupup");
//        book.setUstatus("atguigu");
//        bookService.updateBook(book);

        //删除
        //bookService.deleteBook("1");

        //查询返回某个值
//        int count = bookService.findCount();
//        System.out.println(count);

//        //查询返回对象
//        Book book = bookService.findOne("2");
//        System.out.println(book);
//
//        //查询返回集合
//        List<Book> all = bookService.findAll();
//        System.out.println(all);
//
//        //批量添加测试
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"5","java", "a"};
//        Object[] o2 = {"6","C++", "b"};
//        Object[] o3 = {"7","Mysql", "c"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        //调用批量添加
//        bookService.batchAdd(batchArgs);
//
//
//        //批量修改测试
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"java0909", "a", "4"};
//        Object[] o2 = {"C++1010", "b" , "5"};
//        Object[] o3 = {"Mysql1111", "c", "6",};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        //调用批量添加
//        bookService.batchUpdate(batchArgs);


        //批量删除测试
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = { "4"};
        Object[] o2 = { "5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        //调用批量添加
        bookService.batchDelete(batchArgs);
    }
}
