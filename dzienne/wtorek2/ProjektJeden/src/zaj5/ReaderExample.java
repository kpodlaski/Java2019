package zaj5;

import java.io.*;
import java.net.URL;

/**
 * Created by Krzysztof Podlaski on 02.04.2019.
 */
public class ReaderExample {
    public static String readFromSource(Reader r)
            throws IOException {
        BufferedReader br = new BufferedReader(r);
        StringBuilder sb = new StringBuilder();
        String line;
        while ( (line = br.readLine())!=null ){
            sb.append(line+"\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        Reader r = new FileReader("../../../pan-tadeusz.txt");
        System.out.println(readFromSource(r));
        r.close();

        URL url = new URL("https://www.uni.lodz.pl");
        r = new InputStreamReader(url.openStream());
        System.out.println(readFromSource(r));
        r.close();

    }
}
