package zaj4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Krzysztof Podlaski on 13.04.2019.
 */
public class ConsoleClientInterface implements UserIntefrace {
    ComunicationBase commBase;

    public ConsoleClientInterface(){
        Thread t = new Thread(new KeboardListener());
        t.start();
    }


    @Override
    public void messageReceived(String text) {
        System.out.println(text);
    }

    @Override
    public void errorOccured(Exception e) {
        System.out.println("ERROR" + e);
    }

    @Override
    public void sendMessage(String text) {
        try {
            commBase.sendMessage(text);
        } catch (IOException e) {
            errorOccured(e);
            e.printStackTrace();
        }
    }

    @Override
    public void setCommBase(ComunicationBase comBase) {
       this.commBase = comBase;
    }


    class KeboardListener implements Runnable{

        @Override
        public void run() {
            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));
            while(true){
                String text = null;
                try {
                    text = keyboard.readLine();
                } catch (IOException e) {
                    errorOccured(e);
                    e.printStackTrace();
                }
                sendMessage(text);
            }
        }
    }


}
