package zaj2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Krzysztof Podlaski on 04.03.2019.
 */
public class DrawingAPP {
    JPanel mainPanel;
    JPanel drawingPanel;
    JButton gButton, lButton,dButton,pButton;
    private JButton clearButton;

    public DrawingAPP() {

        gButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DrawingPanel dP = (DrawingPanel) drawingPanel;
                dP.moveBall(0,-2);
                dP.repaint();
            }
        });
        drawingPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseMoved(e);
                DrawingPanel dP = (DrawingPanel) drawingPanel;
                dP.moveTo(e.getX(),e.getY());
                dP.repaint();

            }
        });
        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                DrawingPanel dP = (DrawingPanel) drawingPanel;
                dP.nextColor();
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DrawingPanel dP = (DrawingPanel) drawingPanel;
                dP.clearPanel();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DrawingAPP");
        frame.setContentPane(new DrawingAPP().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        drawingPanel = new DrawingPanel();
    }
}
