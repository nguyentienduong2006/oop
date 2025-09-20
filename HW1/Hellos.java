import java.util.Scanner;
public class Hellos {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt(); // n < 1000
        String extra;
        for (int i = 1; i <= n; ++i) {
            if (i % 10 == 1 && i % 100 != 11 && i % 100 != 12 && i % 100 != 13) {
                extra = "st";
            }
            else if (i % 10 == 2 && i % 100 != 11 && i % 100 != 12 && i % 100 != 13) {
                extra = "nd";
            }
            else if (i % 10 == 3 && i % 100 != 11 && i % 100 != 12 && i % 100 != 13) {
                extra = "rd";
            }
            else {
                extra = "th";
            }
            System.out.println(i + extra + " Hello");
        }
    }
}
