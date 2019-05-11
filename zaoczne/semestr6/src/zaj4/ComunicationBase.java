package zaj4;

import java.io.*;
import java.net.Socket;

/**
 * Created by Krzysztof Podlaski on 13.04.2019.
 */
public class ComunicationBase {
    Socket socket;
    InputStream is;
    OutputStream os;
    UserIntefrace uI;
    InputStreamListener listener;

    public static ComunicationBase
        createInstance(Socket socket, UserIntefrace uI)
            throws IOException {
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        return new ComunicationBase(socket,is, os,uI);
    }

    private ComunicationBase(Socket socket, InputStream is, OutputStream os, UserIntefrace uI) {
        this.socket = socket;
        this.is = is;
        this.os = os;
        this.uI = uI;
        listener = new InputStreamListener();
        Thread t = new Thread(listener);
        t.start();
    }

    public void sendMessage(String message)
            throws UnsupportedEncodingException, IOException {
        os.write(message.getBytes("utf8"));
        os.write('\n');
    }

    public void close(){
        try {
            os.close();
            is.close();
            socket.close();
        } catch (IOException e) {
            uI.errorOccured(e);
            e.printStackTrace();
        }
    }

    class InputStreamListener implements Runnable{
        boolean endComunication = false;
        @Override
        public void run() {
            try {
                BufferedReader buffReader = new BufferedReader(
                                            new InputStreamReader(is));
                while (!endComunication) {
                    String text = buffReader.readLine();
                    if (text == null) {
                        endComunication = true;
                        break;
                    }
                    uI.messageReceived(text);
                    if (text.trim().equals("[STOP]")){
                        endComunication = true;
                    }
                }
            }
            catch(IOException e){
                uI.errorOccured(e);
            }
            finally {
                uI.messageReceived("ZAMYKAMY");
                uI.close();
            }
        }
    }
}
