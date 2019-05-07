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
public class ReflexTester extends JPanel {
    List<JButton> buttons = new ArrayList<>();
    int rowsCount, columnCount;
    public ReflexTester(int rowsCount, int columnsCount) {
        this.rowsCount=rowsCount;
        this.columnCount=columnsCount;
    }

    public void switchOnButton(int row, int column){
        int elementId= columnCount*(row-1)+(column-1);
        JButton b = buttons.get(elementId);
        b.setText("AAA");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Reflex Tester");
        ReflexTester panel = ReflexTester.buildIntefrace(3,3);
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
        panel.switchOnButton(2,3);
    }

    private static ReflexTester buildIntefrace(int rowsCount,
                                               int columnsCount) {
        ReflexTester panel = new ReflexTester(rowsCount,columnsCount);
        panel.setLayout(new GridLayout(rowsCount,columnsCount));
        for(int y=1; y<=rowsCount; y++){
            for (int x = 1; x<=columnsCount; x++){
                JButton b = new JButton(""+y+x);
                b.addActionListener(panel.new RelexActionListener());
                panel.add(b);
                panel.buttons.add(b);

            }
        }
        return panel;
    }


    private class RelexActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            String text = b.getText();
            if (text.equals("AAA")){
                int index;
                for (index=0; index<buttons.size(); index++){
                    if (buttons.get(index) == b){
                        break;
                    }
                int row = (index/columnCount)+1;
                int col = (index%columnCount)+1;
                b.setText(""+row+col);
                }
            }
            else b.setText("AAA");
        }
    }
}
