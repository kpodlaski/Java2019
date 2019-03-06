package zaj3;

import java.io.*;

/**
 * Created by Krzysztof Podlaski on 06.03.2019.
 */
public class ReadFromFile {

    public static void main(String[] args) throws IOException {
        System.out.println(new File(".")
                .getAbsolutePath());
        File file = new File("files/book.txt");
        FileInputStream fis = new FileInputStream(file);
        for (int i=0; i<200; i++){
            int c =fis.read() ;
            if (c<0) break;
            char znak = (char) c;
            System.out.println(znak +" "+c);
        }
        fis.close();

        BufferedReader fr = new BufferedReader(
                                new FileReader(file));
        for (int i=0; i<200; i++){
            String c =fr.readLine() ;
            if (c == null) break;
            System.out.println(i+"\t"+c);
        }
        fr.close();


    }
}
