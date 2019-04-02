package zaj5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by Krzysztof Podlaski on 02.04.2019.
 */
public class ReadUsingStream {

    public String readFromSource(InputStream is)
            throws IOException {
        StringBuilder sb = new StringBuilder();
        int bajt;
        while ((bajt=is.read())>=0 ){
            char c = (char) bajt;
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args)
            throws FileNotFoundException, IOException {
        InputStream is = new FileInputStream
                ("../../../pan-tadeusz.txt");
        ReadUsingStream rus = new ReadUsingStream();
        System.out.println(rus.readFromSource(is));
        is.close();

        URL url = new URL("https://www.uni.lodz.pl");
        is = url.openStream();
        System.out.println(rus.readFromSource(is));
        is.close();
    }
}
