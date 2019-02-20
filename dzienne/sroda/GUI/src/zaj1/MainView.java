package zaj1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 20.02.2019.
 */
public class MainView {
    private JPanel panel1;
    private JTextField textFieldImie;
    private JTextField textFieldKwota;
    private JButton maxButton;
    private JButton minButton;
    private JEditorPane listaWplat;
    private JTextField textFieldSuma;
    private JButton dodajButton;
    private JPanel panel2;
    private List<Wplata> wplaty = new ArrayList<>();

    public MainView() {
        dodajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Wplata w = new Wplata(textFieldImie.getText(),
                        Integer.parseInt(textFieldKwota.getText()));
                wplaty.add(w);
                fillJEditorPane();
            }
        });
        maxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel1,
                        "Maksymalna wpłata:");
            }
        });
    }

    private void fillJEditorPane() {
        int suma = 0;
        String wplatyText = "";
        Collections.sort(wplaty);
        for (Wplata w : wplaty){
            wplatyText+=w.getImie()+"\t"+w.getKwota()+"\n";
            suma+=w.getKwota();
        }
        listaWplat.setText(wplatyText);
        textFieldSuma.setText(""+suma);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("MainView");
        frame.setContentPane(new MainView().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
