package zaj4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Krzysztof Podlaski on 13.04.2019.
 */
public class ServerCommunicator extends Communicator {

    public ServerCommunicator(UserIntefrace uI) {
        super(uI);
    }

    @Override
    public void initCommunicator(int port) throws IOException {
        ServerSocket ssocket = new ServerSocket(port);
        Socket csocket = ssocket.accept();
        comBase = ComunicationBase.createInstance(csocket, uI);
        uI.messageReceived("Communication Started");

    }
}
