package zaj3;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        System.out.println("-------------------");
        fr = new BufferedReader(
                new FileReader(file));
        Pattern pLitwo= Pattern.compile("Litwo");
        String line;

        while (( line= fr.readLine() )!= null){
            Matcher m = pLitwo.matcher(line);

            while(m.find()){
                System.out.println(line);
            }
        }
        fr.close();
        Pattern z2= Pattern.compile("[a-zA-Z]{6,}");
        Pattern z3= Pattern.compile("\\b[a-ząęćźżńłó]{6,}");

    }
}
