package samples2.samples;

import java.io.File;
import java.io.FileReader;

public class BadExceptionHandling {

    public static void main(String[] args){
        File f = new File("hello.txt");
        try {
            FileReader reader = new FileReader(f);
        } catch (Exception e){
            throw new RuntimeException("Something bad");
        }
    }
}
