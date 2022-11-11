package game;
/*
 * 炮弹类
 * */

import java.awt.*;

import static java.awt.Color.*;

public class Shell extends GameObject {
    double degree;//角度，炮弹沿着指定角度飞行

    public Shell() {
        x = 200;
        y = 200;

        degree = Math.random() * Math.PI;
        width = 5;
        height = 5;
        speed = 7;
    }

    @Override
    public void drawMyself(Graphics g) {
        Color c = g.getColor();
        g.setColor(YELLOW);
        g.fillOval((int) x, (int) y, width, height);
        g.setColor(c);

        //根据自己的算法指定移动的路径
        x += speed * Math.cos(degree);
        y += speed * Math.sin(degree);

        //碰到边界改变方向
        if (y > Constant.Game_Height - 2 * this.height || y < 40) {
            degree = -degree;
        }
        if (x < 0 || x > Constant.Game_Width - this.width) {
            degree = Math.PI - degree;
        }

    }
}
