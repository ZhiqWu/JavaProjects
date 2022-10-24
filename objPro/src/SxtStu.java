public class SxtStu {
    //属性（成员变量）
    int id;
    String sname;
    int age;

    //方法
    public void study() {
        System.out.println("我爱学习！我正在学习！我还在学习！");
    }

    //构造方法
    SxtStu() {//无参的构造方法
    }

    public static void main(String[] args) {
        SxtStu s1 = new SxtStu();//系统会默认初始化,调用构造器，有返回值，但不能定义return
        System.out.println(s1.id);
        System.out.println(s1.sname);
        s1.id = 1001;
        s1.sname = "高手";
        System.out.println(s1.id);
        System.out.println(s1.sname);
        s1.study();
        System.out.println("===========================");
        SxtStu s2 = new SxtStu();
        s2.id = 1002;
        s2.sname="张三";
        System.out.println(s2.id);
        System.out.println(s2.sname);
        s2.study();

    }
}
