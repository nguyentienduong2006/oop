import java.util.Scanner;
public class FivePerLine {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        for (int i = 1; i <= n; ++i) {
            System.out.print(i + " ");
            if (i % 5 == 0) System.out.print("\n");
        }
    }
}
