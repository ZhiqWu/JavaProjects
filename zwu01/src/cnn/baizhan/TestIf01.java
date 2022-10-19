package cnn.baizhan;

/*
 * 测试if语句，一个简单的掷色子游戏
 */

public class TestIf01 {
    public static void main(String[] arg) {
        double d = Math.random();       //生成[0,1)的随机数
        int a = 1 + (int)(Math.random()*6); //生成[0,6）之间的随机整数
        System.out.println(a);
        if(a<3){
            System.out.println("小");
        }else{
            System.out.println("大");
        }
    }
}
