package zaj7;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 16.04.2019.
 */
public class Ball {
    public Image image;
    public int x,y;
    public int vx=1, vy=2;
    public int size = 30;

    private Ball(BufferedImage img, int x, int y) {
        image = img;
        this.x=x;
        this.y=y;
    }

    public static Ball create(String filePath, int x, int y)
            throws IOException {
        BufferedImage img = ImageIO.read(
          ClassLoader.getSystemResourceAsStream(filePath)
        );
        return new Ball(img, x,y);

    }

    public void move() {
        x+=vx;
        y+=vy;
    }

    public void colisionsWithBorders(
            int width, int height) {
        if (x<=0  || x+size>=width){
            vx=-vx;
        }
        if (y<=0  || y+size>=height){
            vy=-vy;
        }
    }
}
