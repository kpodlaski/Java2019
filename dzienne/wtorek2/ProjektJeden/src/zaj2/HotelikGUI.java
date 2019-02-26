package zaj2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Krzysztof Podlaski on 26.02.2019.
 */
public class HotelikGUI {
    private JTextField imieTextField;
    private JTextField nazwiskoTextField;
    private JTextField nrPokojuTextField;
    private JTextField cenaTextField;
    private JRadioButton mRadioButton;
    private JRadioButton kRadioButton;
    private JButton zatwierdzButton;
    private JTextArea textArea1;
    private JTextField sumaTextField;
    private JPanel mainPanel;
    private double suma=0.0;

    public HotelikGUI() {
        zatwierdzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char plec = '-';
                if (mRadioButton.isSelected()) plec='M';
                if (kRadioButton.isSelected()) plec='K';
                GoscHotelowy g = new GoscHotelowy(
                        imieTextField.getText(),
                        nazwiskoTextField.getText(),
                        plec,
                        nrPokojuTextField.getText(),
                        cenaTextField.getText()
                );
                textArea1.append(g+"\n");
                suma+=g.cena;
                sumaTextField.setText(""+suma);
                clearForm();
            }
        });
    }

    private void clearForm() {
        cenaTextField.setText("");
        imieTextField.setText("");
        nazwiskoTextField.setText("");
        nrPokojuTextField.setText("");
        mRadioButton.setSelected(false);
        kRadioButton.setSelected(false);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HotelikGUI");
        frame.setContentPane(new HotelikGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocation(200,200);
    }
}
