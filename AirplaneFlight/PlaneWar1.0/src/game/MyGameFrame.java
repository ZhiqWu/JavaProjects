package game;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static game.Constant.Game_Height;
import static game.Constant.Game_Width;
/*
 * 游戏主窗口
 * */

public class MyGameFrame extends Frame {

    Image planeImage = GameUtils.getImage("images/plane.png");
    Image bg = GameUtils.getImage("images/bg.jpg");
    Plane p1 = new Plane(planeImage, 100, 100, 7);

    Shell s1 = new Shell();
    Shell[] shells = new Shell[50];

    Explode explode;//爆炸


    //初始化窗口
    @Override
    public void paint(Graphics g) {  //g当作是一支画笔

        g.drawImage(bg, 0, 0, Game_Width, Game_Height, null);
        p1.drawMyself(g);

        //画炮弹
        for (int i = 0; i < shells.length; ++i) {
            shells[i].drawMyself(g);

            //碰撞检测，将所有的炮弹和飞机进行矩形检测，检测是否碰撞
            boolean flag = shells[i].getRec().intersects(p1.getRec());
            if (flag) {
                //System.out.println("飞机被击中了！");
                p1.live = false;

                //处理爆炸效果
                if (explode == null) {
                    explode = new Explode(p1.x, p1.y);
                }
                explode.drawMyself(g);
            }
        }
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
        this.addKeyListener(new KeyMonitor()); //启动键盘监听

        //初始化创建50个炮弹对象
        for (int i = 0; i < shells.length; ++i) {
            shells[i] = new Shell();
        }


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

    //内部类：实现键盘的监听处理
    class KeyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            //System.out.println("按下：" + e.getKeyCode());
            p1.moveDirection(e);

        }

        @Override
        public void keyReleased(KeyEvent e) {
            //System.out.println("抬起：" + e.getKeyCode());
            p1.stopDirection(e);
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
