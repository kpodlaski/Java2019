package zaj2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Krzysztof Podlaski on 27.02.2019.
 */
public class DrawingGUI {
    private JPanel mainPanel;
    private JButton gButton;
    private JButton lButton;
    private JButton dButton;
    private JButton pButton;
    private JPanel drawingPanel;

    public DrawingGUI() {
        gButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DrawingPanel p = (DrawingPanel) drawingPanel;
                p.moveBall(0,-5);
                p.repaint();
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        drawingPanel = new DrawingPanel();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DrawingGUI");
        frame.setContentPane(new DrawingGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,600);
        frame.setLocation(300,100);
    }
}
