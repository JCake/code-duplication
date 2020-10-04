package samples2.samples;

import java.util.ArrayList;
import java.util.List;

public class ClearlyRedundant {

    public static void main(String[] args){
        int sum = 0;
        for(int i = 0; i < 100; i++){
            sum += i * 2;
        }
        int sum2 = 0;
        for(int i = 0; i < 10; i++){
            sum2 += i * 3;
        }
        String numDenom = sum + "/" + sum2;
        System.out.println(numDenom);

        System.out.println("Now we'll do it again after a bit");

        List<Integer> sums = new ArrayList<>();

        int sumA = 0;
        for(int i = 0; i < 100; i++){
            sumA += i * 2;
        }
        int sumB = 0;
        for(int i = 0; i < 10; i++){
            sumB += i * 3;
        }
        String numDenom2 = sumA + "/" + sumB;
        System.out.println(numDenom2);

        sums.add(1);
        sums.add(2);

    }

    public static String findNumDenomStr(){
        int sum = 0;
        for(int i = 0; i < 100; i++){
            sum += i * 2;
        }
        int sum2 = 0;
        for(int i = 0; i < 10; i++){
            sum2 += i * 3;
        }
       return sum + "/" + sum2;
    }
}
