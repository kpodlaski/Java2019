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
        g.drawImage(image,x-r,y-r,
                2*r,2*r,
                null);
    }

    public void move() {
        x+=vx;
        y+=vy;
    }

    public void colissionWithBorders(
            int width, int height) {
        if (y-r<=0 || y+r>=height){
            vy=-vy;
        }
        if (x-r<=0 || x+r>=width){
            vx=-vx;
        }
    }

    public void colissionWithBall(Ball ball) {
        double d2 = Math.pow(x-ball.x,2);
        d2+=Math.pow(y-ball.y,2);
        if (d2<=Math.pow(r+ball.r,2)){
            if (Math.signum(vx)==-Math.signum(ball.vx)){
                vx=-vx;
                ball.vx=-ball.vx;
            }
            if (Math.signum(vy)==-Math.signum(ball.vy)) {
                vy = -vy;
                ball.vy = -ball.vy;
            }
        }

    }
}
