package zaj8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 08.05.2019.
 */
public class ReflexTester extends JPanel {

    List<JButton> buttons = new ArrayList<>();
    int rows, cols;

    public ReflexTester(int rows, int cols) {
        this.rows = rows;
        this.cols=cols;
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Reflex tester");
        ReflexTester refTest = ReflexTester.create(3,3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(refTest);
        frame.setSize(200,200);
        frame.setVisible(true);
        refTest.switchOn(2,1);
    }

    private void switchOn(int r, int c) {
        buttons.get(r*cols+c).setText("ON");
        //Pomiar czasu
    }

    private static ReflexTester create(int rows, int cols) {
        ReflexTester rT = new ReflexTester(rows,cols);
        rT.setLayout(new GridLayout(rows,cols));
        ActionListener aL = rT.new ReflexActionListener();
        for (int r =1; r<=rows; r++){
            for(int c =1; c<=cols; c++){
                JButton b = new JButton(""+r+c);
                rT.add(b); // to samo co: rT.add(b,(r-1)*cols+c-1);
                rT.buttons.add(b);
                b.addActionListener(aL);
            }
        }
        return rT;
    }


    private  class ReflexActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if(b.getText().equals("ON")){
                int index;
                for(index=0; index<buttons.size(); index++){
                    if (buttons.get(index)==b) break;
                }
                int r = index/cols +1;
                int c = index%cols +1;
                b.setText(""+r+c);
            }
            else {
                b.setText("ON");
            }
        }
    }
}
