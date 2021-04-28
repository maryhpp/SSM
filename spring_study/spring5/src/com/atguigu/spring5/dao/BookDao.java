package com.atguigu.spring5.dao;


import com.atguigu.spring5.entity.Book;

import java.util.List;

public interface BookDao {

    //添加的方法
    void add(Book book);

    void update(Book book);

    void delete(String id);

    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBook();

    //批量添加
    void batachAddBook(List<Object[]> batchArgs);

    void bacthUpdateBook(List<Object[]> batchArgs);

    void bacthDeleteBook(List<Object[]> batchArgs);
}
