package zaj7;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 16.04.2019.
 */
public class Ball {
    private Image image;
    private int x, y, r;

    public Ball(BufferedImage img, int x, int y, int r) {
        this.image = img;
        this.x=x;
        this.y=y;
        this.r=r;
    }

    public void draw(Graphics g) {
        g.drawImage(image, x-r, y-r,
                2*r, 2*r,
                Color.white, null);
    }

    public static Ball create(String path,
       int x, int y, int r) throws IOException {
        BufferedImage img = ImageIO.read(
       ClassLoader.getSystemResourceAsStream(path)
        );
        return new Ball(img, x, y, r);
    }
}