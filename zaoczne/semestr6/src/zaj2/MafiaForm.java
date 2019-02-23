package zaj2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 23.02.2019.
 */
public class MafiaForm {
    private JTextField ksywkaTextField;
    private JTextField kwotaTextField;
    private JButton dodoajButton;
    private JButton minButton;
    private JButton maxButton;
    private JTextArea spisTextArea;
    private JTextField sumTextField;
    private JPanel mainPanel;
    private List<Wplata> wplaty = new ArrayList<Wplata>();
    private int suma = 0;



    public MafiaForm() {
        dodoajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Wplata w = new Wplata(ksywkaTextField.getText(),
                        Integer.parseInt(kwotaTextField.getText()));
                String text = w.getKsywka()+"\t"+w.getKwota();
                spisTextArea.append(text+"\n");
                wplaty.add(w);
                Collections.sort(wplaty);
                suma+=w.getKwota();
                sumTextField.setText(""+suma);
            }
        });
        maxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Wplata w = Collections.max(wplaty);
                JOptionPane.showMessageDialog(mainPanel,
                        "Maxymalna Wpłata: "+w.getKsywka()+" "+w.getKwota());
            }
        });
        minButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Wplata w = Collections.min(wplaty);
                JOptionPane.showMessageDialog(mainPanel,
                        "Minimalna Wpłata: "+w.getKsywka()+" "+w.getKwota());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MafiaForm");
        frame.setContentPane(new MafiaForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
