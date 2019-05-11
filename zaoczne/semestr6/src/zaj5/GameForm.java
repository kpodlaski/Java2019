package zaj5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Krzysztof Podlaski on 11.05.2019.
 */
public class GameForm {
    private JPanel mainPanel;
    private JButton uButton;
    private JButton dButton;
    private JButton lButton;
    private JButton rButton;
    private JPanel drawingPanel;

    public GameForm() {
        uButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DrawingPanel dp =(DrawingPanel) drawingPanel;
                dp.moveBall(0,-5);
                dp.repaint();
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        drawingPanel = new DrawingPanel();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GameForm");
        frame.setContentPane(new GameForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
