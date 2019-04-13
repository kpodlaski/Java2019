package zaj4;

import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 13.04.2019.
 */
public class ClientMain {
    public static void main(String[] args) throws IOException {
        ConsoleClientInterface uI = new ConsoleClientInterface();
        ClientCommunicator clientCommunicator =
                new ClientCommunicator(uI);
        clientCommunicator.initCommunicator(8000);

    }
}
