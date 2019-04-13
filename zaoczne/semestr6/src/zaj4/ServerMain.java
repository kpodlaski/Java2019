package zaj4;

import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 13.04.2019.
 */
public class ServerMain {
    public static void main(String[] args) throws IOException {
        ConsoleClientInterface uI = new ConsoleClientInterface();
        ServerCommunicator serverCommunicator =
                new ServerCommunicator(uI);
        serverCommunicator.initCommunicator(8000);
    }
}
