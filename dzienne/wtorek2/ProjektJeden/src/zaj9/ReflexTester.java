package zaj9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krzysztof Podlaski on 07.05.2019.
 */
public class ReflexTester extends JPanel{
    List<JButton> buttons = new ArrayList<>();
    int rows, cols;

    public ReflexTester(int rows, int cols) {
        this.rows=rows;
        this.cols=cols;
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Reflex tester");
        ReflexTester rf = ReflexTester.createPanel(3,3);
        frame.setContentPane(rf);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        rf.switchOn(2,1);
    }

    private void switchOn(int row, int column) {
        int index = (row-1)*cols+column-1;
        JButton b = buttons.get(index);
        b.setText("ON");
    }

    private void switchOFF(int row, int column) {
        int index = (row-1)*cols+column-1;
        JButton b = buttons.get(index);
        b.setText(""+row+column);
    }





    private static ReflexTester createPanel(int rows, int cols) {
        ReflexTester rf = new ReflexTester(rows, cols);
        rf.setLayout(new GridLayout(rows, cols));
        for (int r = 1; r<=rows; r++){
            for (int c=1; c<=cols; c++){
                JButton b = new JButton(""+r+c);
                rf.add(b);
                rf.buttons.add(b);
                b.addActionListener(rf.new ReflexActionListener());
            }
        }
        return rf;
    }

    private class ReflexActionListener
            implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if (b.getText().equals("ON")){
                int index;
                for (index = 0; index<buttons.size(); index++){
                    if(buttons.get(index)==b) break;
                }
                int row = index/cols + 1;
                int col = index%cols +1;
                switchOFF(row,col);
            }
            else {
                b.setText("ON");
            }
        }
    }
}
