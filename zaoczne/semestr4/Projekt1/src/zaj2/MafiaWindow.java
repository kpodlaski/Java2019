package zaj2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Krzysztof Podlaski on 30.03.2019.
 */
public class MafiaWindow {
    private JTextArea operacjeTextArea;
    private JPanel mainPanel;
    private JTextField ksywkaTextField;
    private JRadioButton wpłataRadioButton;
    private JButton dodajButton;
    private JRadioButton wypłataRadioButton;
    private JTextField kwotaTextField;
    private JTextField sumaTextField;
    private double suma = 0.0;

    public MafiaWindow() {
        dodajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double kwota =
                        Double.parseDouble(kwotaTextField.getText());
                if (wpłataRadioButton.isSelected()){
                    suma+=kwota;
                    operacjeTextArea.append(
                            ksywkaTextField.getText()+" "+kwota+"\n"
                    );
                }
                else{
                    suma-=kwota;
                    operacjeTextArea.append(
                            ksywkaTextField.getText()+"-"+kwota+"\n"
                    );
                }
                ksywkaTextField.setText("");
                sumaTextField.setText(""+suma);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MafiaWindow");
        frame.setContentPane(new MafiaWindow().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,500);
        frame.setLocation(100,100);
        frame.setVisible(true);

    }
}
