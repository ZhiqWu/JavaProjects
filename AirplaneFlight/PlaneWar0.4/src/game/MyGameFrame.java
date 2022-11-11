package game;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static game.Constant.Game_Height;
import static game.Constant.Game_Width;
/*
 * 游戏主窗口
 * */

public class MyGameFrame extends Frame {

    Image plane = GameUtils.getImage("images/plane.png");
    Image bg = GameUtils.getImage("images/bg.jpg");


    static int count = 0;
    int planeX = 100;

    //初始化窗口
    @Override
    public void paint(Graphics g) {  //g当作是一支画笔
        System.out.println("绘制窗口的次数：" + count);
        count++;
        g.drawImage(bg, 0, 0, Game_Width, Game_Height, null);
        g.drawImage(plane, planeX, 100, 22, 33, null);
        planeX += 1;

    }

    public void launchFrame() {
        this.setTitle("飞机大战");
        setVisible(true);//窗口是否可见
        setSize(Game_Width, Game_Height); //窗口大小
        setLocation(400, 400);   //窗口打开的位置

        //增加关闭窗口的动作
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); //正常退出程序
            }
        });

        new PaintThread().start(); //启动重画窗口的线程

    }

    /*
     * 定义了一个重画窗口的线程
     * 定义为内部类是为了方便使用窗口类的相关方法
     * */
    class PaintThread extends Thread {
        @Override
        public void run() {
            while (true) {
                repaint();      //内部类可以直接使用外部类的成员
                try {
                    Thread.sleep(20); //1s=1000ms,1s画20次(20*50=1000)
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    //添加双缓冲技术
    private Image offScreenImage = null;

    public void update(Graphics g) {
        if (offScreenImage == null)
            offScreenImage = this.createImage(Game_Width, Game_Height);//这是游戏窗口的宽度和高度
        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }


    public static void main(String[] args) {
        MyGameFrame gameFrame = new MyGameFrame();
        gameFrame.launchFrame();
    }


}
