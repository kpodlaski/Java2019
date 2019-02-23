package zaj2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Krzysztof Podlaski on 23.02.2019.
 */
public class WindowAppForm {
    private JTextField shortTextTextField;
    private JButton button1;
    private JTextArea textArea1;

    public WindowAppForm() {
        ActionListener aL = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = shortTextTextField.getText();
                textArea1.append(text+"\n");
                shortTextTextField.setText("");
            }
        };
        button1.addActionListener(aL);
        shortTextTextField.addActionListener(aL);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("WindowAppForm");
        frame.setContentPane(new WindowAppForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel mainPanel;

    
}
