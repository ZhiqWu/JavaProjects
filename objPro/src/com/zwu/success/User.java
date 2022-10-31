package com.zwu.success;

import java.util.Objects;

public class User {
    int id;
    String name;
    String pwd;

    User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;    //return: 返回值，结束方法运行
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        User u1 = new User(1, "张三", "1223");
        User u2 = new User(1, "张三", "1223");
        System.out.println(u1);
        System.out.println(u2.toString());
        System.out.println(u1 == u2);           //就是判断是不是同一个对象
        System.out.println(u1.equals(u2));      //equals判断2个对象逻辑上的值是不是一样

    }
}
