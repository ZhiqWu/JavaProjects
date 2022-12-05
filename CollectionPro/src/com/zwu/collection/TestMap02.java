package com.zwu.collection;
/*
 * 测试HashMap的使用
 * */

import java.util.HashMap;
import java.util.Map;

public class TestMap02 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001, "老大", 50000);
        Employee e2 = new Employee(1002, "老二", 60000);
        Employee e3 = new Employee(1003, "老三", 70000);
        Employee e4 = new Employee(1001, "老四", 70000);

        Map<Integer, Employee> map = new HashMap<>();
        map.put(1001, e1);
        map.put(1002, e2);
        map.put(1003, e3);
        System.out.println(e1.hashCode());

        Employee emp = map.get(1001);
        System.out.println(emp.getEname());

        map.put(1001, e4);
        Employee emp1 = map.get(1001);
        System.out.println(emp1);


    }
}

//雇员信息
class Employee {
    private int id;
    private String ename;
    private double salary;

    public Employee(int id, String ename, double salary) {
        this.id = id;
        this.ename = ename;
        this.salary = salary;
    }

    public String toString() {
        return "id: " + id + " name: " + ename + " 薪水：" + salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}