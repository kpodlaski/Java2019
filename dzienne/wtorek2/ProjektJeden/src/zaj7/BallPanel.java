package zaj7;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 16.04.2019.
 */
public class BallPanel extends JPanel {
    Ball ball;

    public BallPanel(Ball ball) {
        this.ball = ball;
    }

    @Override
    public void paint(Graphics g){
        ball.draw(g);
    }

    public static void main(String[] args) throws IOException {
        Ball ball = Ball.create(
                "zaj7/ball.jpg",30,40,40);
        BallPanel bPanel = new BallPanel(ball);
        JFrame frame = new JFrame("Anmimacja");
        frame.setContentPane(bPanel);
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }



}
