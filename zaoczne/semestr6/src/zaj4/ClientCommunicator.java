package zaj4;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by Krzysztof Podlaski on 13.04.2019.
 */
public class ClientCommunicator extends Communicator {

    public ClientCommunicator(UserIntefrace uI) {
        super(uI);
    }

    @Override
    public void initCommunicator(int port) throws IOException{
        initCommunicator("localhost",port);
    }

    public void initCommunicator(String host, int port) throws IOException {
        Socket socket = new Socket(host, port);
        comBase = ComunicationBase.createInstance(socket, uI);
        uI.setCommBase(comBase);
        uI.messageReceived("Communication Started");
    }
}
