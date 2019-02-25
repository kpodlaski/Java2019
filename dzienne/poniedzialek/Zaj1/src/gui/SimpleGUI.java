package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Krzysztof Podlaski on 25.02.2019.
 */
public class SimpleGUI {
    private JTextField shortTextField;
    private JButton okButton;
    private JTextArea mainTextArea;
    private JPanel mainPanel;

    public SimpleGUI() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = shortTextField.getText();
                mainTextArea.append(text+"\n");
                shortTextField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SimpleGUI");
        frame.setContentPane(new SimpleGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
