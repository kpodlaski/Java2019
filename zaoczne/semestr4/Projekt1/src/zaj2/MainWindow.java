package zaj2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Krzysztof Podlaski on 30.03.2019.
 */
public class MainWindow {
    private JTextArea textArea1;
    private JTextField textField1;
    private JButton button1;
    private JPanel mainPanel;

    public MainWindow() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                textArea1.append(text+"\n");
                textField1.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainWindow");
        frame.setContentPane(new MainWindow().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400,600);
        frame.setLocation(300,100);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
