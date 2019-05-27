package zaj8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Krzysztof Podlaski on 08.05.2019.
 */
public class ReflexTester extends JPanel {

    List<JButton> buttons = new ArrayList<>();
    int rows, cols;
    private long startTime;
    Random rand = new Random();
    ScheduledExecutorService executor =
            Executors.newSingleThreadScheduledExecutor();
    ReflexWaiter2 task =new ReflexWaiter2();

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
        startTime = System.currentTimeMillis();
        //Date d = new Date();
        //startTime = d.getTime();
    }

    private void switchOff(int r, int c){

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
                long endTime = System.currentTimeMillis();
                System.out.println( 1.0*(endTime-startTime)/1000+"s");
                int index;
                for(index=0; index<buttons.size(); index++){
                    if (buttons.get(index)==b) break;
                }
                int r = index/cols +1;
                int c = index%cols +1;
                b.setText(""+r+c);

                //new Thread(new ReflexWaiter()).start();
                executor.schedule(task, rand.nextInt(3000), TimeUnit.MILLISECONDS);


            }
//            else {
//                b.setText("ON");
//                startTime=0;
//            }

        }
    }

    private class ReflexWaiter implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(rand.nextInt(5000));
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            switchOn(rand.nextInt(rows),rand.nextInt(cols));
        }
    }
    private class ReflexWaiter2 implements Runnable {
        @Override
        public void run() {
            switchOn(rand.nextInt(rows),rand.nextInt(cols));
        }
    }
}
