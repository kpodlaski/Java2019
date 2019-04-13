package zaj4;

import java.io.IOException;

/**
 * Created by Krzysztof Podlaski on 13.04.2019.
 */
public abstract class Communicator {
    ComunicationBase comBase;
    UserIntefrace uI;

    public Communicator(UserIntefrace uI) {
        this.uI = uI;
    }

    abstract public void initCommunicator(int port) throws IOException;
}
