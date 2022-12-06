package com.zwu.collection;

/*
 * 测试TreeMap的使用
 *
 * */

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap01 {
    public static void main(String[] args) {
        Map<Integer, String> treemap1 = new TreeMap<>();
        treemap1.put(20, "aa");
        treemap1.put(30, "bb");
        treemap1.put(4, "vv");

        //按照key递增的方式排序
        for (Integer key : treemap1.keySet()) {
            System.out.println(key + "-----" + treemap1.get(key));
        }

        Map<Emp,String> treemap2=new TreeMap<>();
        treemap2.put(new Emp(100,"张三",50000),"好小子");
        treemap2.put(new Emp(200,"李四",500),"偷懒小子");
        treemap2.put(new Emp(122,"王五",60000),"金牌小子");
        treemap2.put(new Emp(110,"赵六",50000),"开心小子");

        for (Emp key:treemap2.keySet()) {
            System.out.println(key + "-----" + treemap2.get(key));
        }
    }

}

class Emp implements Comparable<Emp>{
    int id;
    String name;
    double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id: "+id+" name: "+name+" salary: "+salary;
    }

    @Override
    public int compareTo(Emp o) {//负数：小于，0：等于；正数：大于
        if(this.salary>o.salary){
            return 1;
        } else if (this.salary<o.salary) {
            return -1;
        }else if(this.id>o.id){
            return 1;
        } else if (this.id<o.id) {
            return -1;
        }
        return 0;
    }
}