package com.zwu.test;       //位于非注释的第一句

//import com.zwu.test2.Student;
//import com.zwu.test2.User;

import com.zwu.test2.*;     //降低编译速度，不会降低运行速度

import java.sql.Date;
import java.util.*;

import static java.lang.Math.*;//导入Math类的所有静态属性
import static com.zwu.test2.Student.school;


public class Test1 {
    public static void main(String[] args) {
        User u = new User();
        u.login();
        Student st = new Student();

        java.util.Date d = new java.util.Date();
        System.out.println(school);
    }
}
