package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 25.02.2019.
 */
public class MafiaGUI {
    private JTextField ksywkaTextField;
    private JTextField kwotaTextField;
    private JButton dodajButton;
    private JButton maxButton;
    private JButton minButton;
    private JEditorPane editorPane1;
    private JTextField sumaTextField;
    private JPanel mainPanel;
    private List<Wplata> wplaty = new ArrayList<>();
    private int suma =0;

    public MafiaGUI() {
        dodajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Wplata w = new Wplata(ksywkaTextField.getText(),
                        Integer.parseInt(kwotaTextField.getText()));
                wplaty.add(w);
                suma+=w.getKwota();
                sumaTextField.setText(""+suma);
                editorPane1.setText(editorPane1.getText()+w.getKsywka()+"\t"+w.getKwota()+"\n");
            }
        });
        maxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Wplata w = Collections.max(wplaty);
                JOptionPane.showMessageDialog(mainPanel,
                        w.getKsywka()+" "+w.getKwota());
            }
        });
        minButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Wplata w = Collections.min(wplaty);
                JOptionPane.showMessageDialog(mainPanel,
                        w.getKsywka()+" "+w.getKwota());

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MafiaGUI");
        frame.setContentPane(new MafiaGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
