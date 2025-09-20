import java.math.BigInteger;

public class FunctionGrowth {
    public static void main(String args[]) {
        System.out.println("Log n \tn \tn Log n \tn^2 \tn^3 \t2^n ");
        for (int i = 16; i <= 2048; i *= 2) {
            System.out.print((int) Math.log(i));
            System.out.print("\t");
            System.out.print(i);
            System.out.print("\t");
            System.out.print((long) (i * Math.log(i)));
            System.out.print("\t");
            System.out.print((long) Math.pow(i, 2));
            System.out.print("\t");
            System.out.print((long) Math.pow(i, 3));
            System.out.print("\t");
            BigInteger twoPowerN = BigInteger.valueOf(2).pow(i);
            System.out.println(twoPowerN);
            System.out.println();
        }
    }
}