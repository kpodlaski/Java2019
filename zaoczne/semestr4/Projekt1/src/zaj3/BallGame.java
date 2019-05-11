package zaj3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Krzysztof Podlaski on 11.05.2019.
 */
public class BallGame {
    private JButton button1;
    private JPanel mainPanel;
    private JPanel drawingPanel;

    public BallGame() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DrawingPanel dp= (DrawingPanel) drawingPanel;
                dp.moveBall(5,5);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        drawingPanel = new DrawingPanel();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BallGame");
        frame.setContentPane(new BallGame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
