package game;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/*
 * 游戏主窗口
 * */

public class MyGameFrame extends Frame {
    //初始化窗口
    @Override
    public void paint(Graphics g) {  //g当作是一支画笔

        Color c = g.getColor();

        g.setColor(Color.red);
        g.setColor(new Color(255, 0, 100));
        //画直线
        g.drawLine(100, 100, 400, 400);
        //画矩形
        g.drawRect(100, 100, 300, 200);
        //画椭圆
        g.drawOval(100, 100, 300, 200);
        //画字符串
        g.drawString("你好咯", 300, 300);
        g.setColor(c);

    }

    public void launchFrame() {
        this.setTitle("飞机大战");
        setVisible(true);//窗口是否可见
        setSize(500, 500); //窗口大小
        setLocation(400, 400);   //窗口打开的位置

        //增加关闭窗口的动作
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); //正常退出程序
            }
        });
    }

    public static void main(String[] args) {
        MyGameFrame gameFrame = new MyGameFrame();
        gameFrame.launchFrame();
    }


}
