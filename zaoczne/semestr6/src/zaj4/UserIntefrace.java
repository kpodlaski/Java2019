package zaj4;

/**
 * Created by Krzysztof Podlaski on 13.04.2019.
 */
public interface UserIntefrace {
    void messageReceived(String text);

    void errorOccured(Exception e);

    void sendMessage(String text);

    void setCommBase(ComunicationBase comBase);
}
