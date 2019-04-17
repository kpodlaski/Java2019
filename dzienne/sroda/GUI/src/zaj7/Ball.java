package zaj7;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 17.04.2019.
 */
public class Ball {
    private Image image;
    private int x, y, r, vx=2, vy=-1;

    private Ball(BufferedImage image, int x, int y, int r) {
        this.image=image;
        this.x=x;
        this.y=y;
        this.r=r;
    }

    public static Ball create(String path,
           int x, int y, int r) throws IOException {
        BufferedImage image = ImageIO.read(
        ClassLoader.getSystemResourceAsStream(path)
        );
        return new Ball(image,x,y,r);
    }

    public void draw(Graphics g) {
        g.drawImage(image,x+r,y+r,
                2*r,2*r,
                null);
    }

    public void move() {
        x+=vx;
        y+=vy;
    }
}
