package com.zwu.TestInnerClass;

public class Outer01 {
    private int age = 10;

    private void show() {
        System.out.println("要你好看！");
    }

    public class Inner01 {
        private String name = "tom";
        private int age = 20;

        public void showInner() {
            System.out.println("Inner.showInner");
            System.out.println(name);
            System.out.println(age);
            show();//内部类可以直接使用外部类的成员
        }
    }

    public static void main(String[] args) {
        Outer01.Inner01 inner01 = new Outer01().new Inner01();
        inner01.showInner();

        Outer01 out01 = new Outer01();
        Inner01 inner02 = out01.new Inner01();
        inner02.showInner();

    }


}
