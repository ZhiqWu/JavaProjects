package com.ArrayTest;
/*
 * 使用javabean和数组存储表格的信息。
 * 非常重要！！
 * */

public class Test03 {
    public static void main(String[] args) {
        //ORM Object relationship mapping 对象关系映射
        //Object[] emp0={1001, "高效益", 18, "程序员", "2019-9-9"}
        Emp emp0 = new Emp(1001, "高效益", 18, "程序员", "2019-9-9");
        Emp emp1 = new Emp(1002, "高效能", 28, "程序员", "2020-9-9");
        Emp emp2 = new Emp(1003, "高收益", 36, "程序员", "2021-9-9");

        Emp[] emps = {emp0, emp1, emp2};//静态初始化
        //遍历数据
        for (int i = 0; i < emps.length; ++i) {
            System.out.println(emps[i].getId() + "\t" + emps[i].getAge());
        }
        for (int i = 0; i < emps.length; ++i) {
            System.out.println(emps[i].toString());
        }

    }
}

class Emp {
    private int id;
    private String name;
    private int age;
    private String job;
    private String hireDate;

    public Emp() {
    }

    public Emp(int id, String name, int age, String job, String hireDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return getId() + "\t" + getName() + "\t" + getAge() + "\t" + getJob() + "\t" + getHireDate();
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

    public String getAge() {
        return age + "岁";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}