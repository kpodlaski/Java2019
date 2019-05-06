package animation;

import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 06.05.2019.
 */
public class Ball {
    double x, y, vx, vy, r=5;
    Color color =Color.blue;

    public Ball(double x, double y, double vx, double vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }

    public void drawBall(Graphics g) {
        g.setColor(color);
        g.fillOval( (int)(x-r),(int)(y-r),
                    (int)(2*r),(int)(2*r));
    }

    public void checkBoundaries(int width, int height) {
        if ( x-5<=0 || x+5>=width){
            vx=-vx;
        }
        if ( y-5<=0 || y+5>=height){
            vy=-vy;
        }
    }

    public void moveBall() {
        x+=vx;
        y+=vy;
    }

    public void checkColisionWith(Ball b) {
        //Check if balls collide
        //if collide then change velocities of this and b
    }
}
