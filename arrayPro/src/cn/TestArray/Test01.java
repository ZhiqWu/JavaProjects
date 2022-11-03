package cn.TestArray;

public class Test01 {
    public static void main(String[] args) {
        //静态初始化需要在声明后直接初始化
        Man[] mans = {
                new Man(10, "一"),
                new Man(11, "二"),
                new Man(12, "三"),
                new Man(13, "四"),
                new Man(14, "五")
        };
        for (int i = 0; i < mans.length; ++i) {
            System.out.println(mans[i].getName());
        }
        //增强for循环
        for (Man m : mans) {
            System.out.println(m);
        }

    }
}

class Man {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "id: " + this.id + " ," + "name: " + this.name;
    }

    public Man() {
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

    public Man(int id, String name) {
        this.id = id;
        this.name = name;
    }
}