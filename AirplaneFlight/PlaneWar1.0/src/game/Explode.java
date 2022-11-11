package game;
/*
 * 爆炸类
 * */

import java.awt.*;

public class Explode {
    //位置
    double x, y;

    static Image[] images = new Image[16];
    int count;

    static {
        for (int i = 0; i < 16; ++i) {
            images[i] = GameUtils.getImage("images/explode/e" + (i + 1) + ".gif");
            //images[i].getWidth(null);         //解决懒加载问题
        }
    }

    public void drawMyself(Graphics g) {
        if (count < 16) {
            g.drawImage(images[count], (int) x, (int) y, null);
            count++;
        }
    }

    public Explode() {
    }

    public Explode(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
