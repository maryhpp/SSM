package com.atguigu.spring5.collectiontype;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    //1 数组类型的属性
    private String[] courses;

    //2 list集合类型属性
    private List<String> list;

    //3 Map集合类型属性
    private Map<String, String> maps;

    //学生所学的多门课程
    private List<Course> courselist;

    public void setCourselist(List<Course> courselist) {
        this.courselist = courselist;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    //4 Set集合类型属性
    private Set<String> sets;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void test(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courselist);
    }
}
