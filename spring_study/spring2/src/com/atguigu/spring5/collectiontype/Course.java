package com.atguigu.spring5.collectiontype;

//课程类
public class Course {

    private String cname; //课程的名称

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
