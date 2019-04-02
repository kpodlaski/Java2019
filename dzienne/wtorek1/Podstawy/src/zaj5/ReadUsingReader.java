package zaj5;

import java.io.*;
import java.net.URL;

/**
 * Created by Krzysztof Podlaski on 02.04.2019.
 */
public class ReadUsingReader {
    public String readFromSource(Reader reader) throws IOException {
        BufferedReader br = new BufferedReader(reader);
        String line;
        StringBuilder sb = new StringBuilder();
        while ( (line=br.readLine())!=null ){
            sb.append(line);
        }
        return sb.toString();
    }

    public static void main(String[] args)
            throws FileNotFoundException, IOException {
        ReadUsingReader rur = new ReadUsingReader();
        FileReader fr = new FileReader("../../../pan-tadeusz.txt");
        System.out.println(rur.readFromSource(fr));
        fr.close();

        URL url = new URL("https://www.uni.lodz.pl");
        Reader reader = new InputStreamReader(url.openStream());
        rur.readFromSource( reader );
        reader.close();
    }
}
