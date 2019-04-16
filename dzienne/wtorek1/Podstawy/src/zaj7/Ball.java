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
    public int vx, vy;
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
}
