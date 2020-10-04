package samples2.samples;

public class SeveralMethods {

    public int methodA(){
        return 5 * 6 + 7;
    }

    public int methodB(int a, int b){
        return a * 6 + b;
    }

    public int methodC(){
        int val1 = 3 * 6 + 9;
        int val2 = 8 * 6 + 3;
        return val1 * 6 + val2;
    }

    public int methodD(int a, int b, int c, int d){
        int val1 = a * 6 + b;
        int val2 = c * 6 + d;
        return val1 * 6 + val2;
    }

    public int methodE(int a, int b){
        int val1 = methodB(a, b);
        int val2 = methodB(a, b);
        int val3 = methodB(a, b);
        int val4 = methodB(a, b);
        int val5 = methodB(a, b);
        return val1 + val2 + val3 + val4 + val5;
    }

    public int methodF(int a, int b, int c, int d){
        int val1 = a * 6 + b;
        int val2 = c * 6 + d;
        return val1 * 6 + val2;
    }

}
