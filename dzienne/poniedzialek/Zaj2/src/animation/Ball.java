package animation;

import java.awt.*;

/**
 * Created by Krzysztof Podlaski on 06.05.2019.
 */
public class Ball {
    double x, y, vx, vy, r=10;
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
        double r2 = distance2ToBall(b);
        if (r2 <= Math.pow(r+b.r,2)){
            //if collide then change velocities of this and b
            //0 approach
            if (Math.signum(vx)==-Math.signum(b.vx))
            {
                vx=-vx;
                b.vx=-b.vx;
            }
            else{
                double v =b.vx;
                b.vx=vx;
                vx=v;
            }
            if (Math.signum(vy) == -Math.signum(b.vy)) {
                vy=-vy;
                b.vy=-b.vy;
            }
            else{
                double v = b.vy;
                b.vy=vy;
                vy=v;
            }
        }

    }

    private double distance2ToBall(Ball b) {
        return Math.pow(x-b.x,2)+Math.pow(y-b.y,2);
    }

    public void drawInfo(Graphics g) {
        g.setColor(color);
        g.drawString("["+vx+","+vy+"]",200,20);
    }

    public void increaseV(double dvx, double dvy)
    {
        vx+=dvx;
        vy+=dvy;
    }
}
