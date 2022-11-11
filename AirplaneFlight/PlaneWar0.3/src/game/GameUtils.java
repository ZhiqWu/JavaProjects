package game;

/*
 * 游戏的工具类
 * */

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class GameUtils {

    //构造器私有，防止别人创建本类对象
    private GameUtils() {
    }

    public static Image getImage(String path) {  //images/plane.png
        BufferedImage img = null;
        URL u = GameUtils.class.getClassLoader().getResource(path);
        try {
            img = ImageIO.read(u);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return img;
    }

    public static void main(String[] args) {
        Image img = GameUtils.getImage("images/plane.png");
        System.out.println(img);
    }
}
