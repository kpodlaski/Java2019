package zaj5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by Krzysztof Podlaski on 02.04.2019.
 */
public class StreamExample {
    public static String readFromSource(InputStream is)
            throws IOException {
        int b;
        StringBuilder sb = new StringBuilder();
        while ( (b = is.read())>-1 ){
            sb.append((char) b);
        }
        return sb.toString();
    }
    public static void main(String[] args)
            throws FileNotFoundException, IOException {
        InputStream is = new FileInputStream(
                "../../../pan-tadeusz.txt");
        System.out.println(readFromSource(is));
        is.close();

        URL url = new URL("https://www.uni.lodz.pl");
        is = url.openStream();
        System.out.println(readFromSource(is));
        is.close();
    }
}
