package com.zwu.collection;

/*
 * 测试表格数据的存储
 * 体会ORM思想
 * 每一行数据使用JavaBean对象存储
 * 多行放到map或list中
 * */

import java.util.*;

public class TestStoreData2 {
    public static void main(String[] args) {
        User user1 = new User(1001, "张三", 20000, "2018.5.5");
        User user2 = new User(1002, "李四", 30000, "2005.4.4");
        User user3 = new User(1003, "王五", 200, "2020.5.4");

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        for (User u : list) {
            System.out.println(u);
        }

        Map<Integer, User> map = new HashMap<>();
        map.put(1001, user1);
        map.put(1002, user2);
        map.put(1003, user3);

        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(key + "====" + map.get(key));
        }

    }
}

class User {
    private int id;
    private String name;
    private double salary;
    private String Date;

    //一个完整的javabean要有set和get方法,以及无参构造器
    public User() {
    }

    public User(int id, String name, double salary, String date) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        Date = date;
    }

    @Override
    public String toString() {
        return "id: " + id + " name: " + name + " salary: " + salary + " Date: " + Date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

}
