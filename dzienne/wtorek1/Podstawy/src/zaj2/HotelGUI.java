package zaj2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Krzysztof Podlaski on 26.02.2019.
 */
public class HotelGUI {
    private JPanel mainPanel;
    private JTextField imieTextField;
    private JTextField nazwiskoTextField;
    private JRadioButton mRadioButton;
    private JRadioButton kRadioButton;
    private JTextField pokojTextField;
    private JButton zatwierdźButton;
    private JTextArea spisTextArea;
    private JTextField cenaTextField;
    private JTextField sumaTextField;
    private double cena = 0.0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("HotelGUI");
        frame.setContentPane(new HotelGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public HotelGUI() {
        zatwierdźButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char plec ='-';
                if (kRadioButton.isSelected()) plec='K';
                if (mRadioButton.isSelected()) plec='M';
                GoscHotelowy g = new GoscHotelowy(
                        imieTextField.getText(),
                        nazwiskoTextField.getText(),
                        plec,
                        pokojTextField.getText(),
                        cenaTextField.getText()
                );
                spisTextArea.append(g+"\n");
                clearFields();
                cena +=g.cena;
                sumaTextField.setText(""+cena);
            }
        });


    }

    private void clearFields() {
        imieTextField.setText("");
        nazwiskoTextField.setText("");
        cenaTextField.setText("");
        pokojTextField.setText("");
        mRadioButton.setSelected(false);
        kRadioButton.setSelected(false);
    }
}
