package zaj3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * Created by Krzysztof Podlaski on 05.03.2019.
 */
public class DrawingPanel {
    private JPanel mainPanel;
    private JButton uButton;
    private JButton dButton;
    private JButton lButton;
    private JButton rButton;
    private JPanel drawingPanel;

    public DrawingPanel() {
        uButton.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
                mp.moveBall(0,-5);
                mp.repaint();
            }
        });
        drawingPanel.addMouseMotionListener(
                new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
                mp.moveBallTo(e.getX(),e.getY());
                mp.repaint();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DrawingPanel");
        frame.setContentPane(new DrawingPanel().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        drawingPanel = new MyDrawingPanel();
    }
}
