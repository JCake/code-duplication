package samples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// This is a mess of code.  I'm trying to see what CodeGuru might flag
public class ComplicatedCode {

    public static void main(String[] args){
        try {
            FileReader reader = new FileReader("input.txt");
            int result = reader.read();
            String s = "";
            while(result > 80){
                reader.read();
                for(int i = 0; i < result; i++){
                    for(int j = result; j < result * 3; j++){
                        int someOtherThing =  j + i - 2;
                        SeveralMethods sm = new SeveralMethods();
                        int calculated = sm.methodB(someOtherThing, j);
                        for(int x = someOtherThing; x < calculated; x+=2){
                            SeveralMethods sm2 = new SeveralMethods();
                            sm2.methodE(x,i);
                            System.out.println(sm2.methodE(x,i));
                            while(x < 100){
                                x += 1;
                                System.out.print(x);
                                s += "More string stuff";
                            }
                        }
                    }
                }
            }
            for(char c : s.toCharArray()){
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // There should be all kinds of things flagged in this code.
    }
}
