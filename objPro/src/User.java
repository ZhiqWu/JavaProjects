public class User {
    int id;
    String name;
    String pwd;
    static String company = "阿里妈妈";

    public User(int id, String name, String pwd) {
        this(name); //this()可以用于调用其他构造器，且必须位于第一行
        this.id = id;
        this.pwd = pwd;
    }

    public User(String name) {
        this.name = name;
    }

    public void login() {
        System.out.println("登录 " + this.name);
        System.out.println(company);
    }

    public static void printCompany() {
        //login();//调用非静态成员，编译就会报错
        System.out.println(company);
    }

    //this不能用在static方法内
    public static void main(String[] args) {//main()属于类，不属于对象，不能用this
        User u1 = new User(100, "高老庄", "bb");
        System.out.println(u1.id);
        System.out.println(u1.name);
        u1.login();
        User.printCompany();
        User.company = "阿里哥哥";
        User.printCompany();
        u1.printCompany();
    }
}
