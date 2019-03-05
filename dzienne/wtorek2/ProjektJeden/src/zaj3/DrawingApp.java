package zaj3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Krzysztof Podlaski on 05.03.2019.
 */
public class DrawingApp {
    private JPanel mainPanel;
    private JButton uButton;
    private JButton dButton;
    private JButton lButton;
    private JButton rButton;
    private JPanel drawingPanel;

    public DrawingApp() {
        dButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDrawingPanel mp = (MyDrawingPanel) drawingPanel;
                mp.moveBall(0,5);//przesuń w dół o 5px
                mp.repaint();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DrawingApp");
        frame.setContentPane(new DrawingApp().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        drawingPanel = new MyDrawingPanel();
    }
}
