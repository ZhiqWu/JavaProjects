package game;
/*
 * 游戏物体的根类
 * */

import java.awt.*;

public class GameObject {
    Image img;          //图片
    double x, y;        //物体的坐标
    int speed;          //物体移动的速度
    int width, height;  //物体的宽度和高度

    public GameObject() {
    }

    public GameObject(Image img, double x, double y, int speed, int width, int height) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    public GameObject(Image img, double x, double y, int speed) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
    }

    public void drawMyself(Graphics g) {
        g.drawImage(img, (int) x, (int) y, width, height, null);
    }

    //所有物体都是矩形，当你获得对应的矩形的时候，就可以进行一些相关的判断操作
    public Rectangle getRec() {
        return new Rectangle((int) x, (int) y, width, height);
    }


}
