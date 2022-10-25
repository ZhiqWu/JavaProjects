public class Sxtstu2 {
    int id;
    String sname;
    int age;

    Sxtstu2() {//无参构造器。如果没有手动定义，系统自动添加。
    }

    Sxtstu2(int id) {//重载
        System.out.println(id);//就近原则
        this.id = id;
    }

    Sxtstu2(int id, String name, int age) {
        this.id = id;
        this.sname = name;
        this.age = age;

    }

    public static void main(String[] args) {

    }
}
